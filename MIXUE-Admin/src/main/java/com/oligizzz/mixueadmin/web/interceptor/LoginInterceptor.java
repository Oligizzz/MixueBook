package com.oligizzz.mixueadmin.web.interceptor;

import com.oligizzz.mixueadmin.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String context = session.getServletContext().getContextPath();

        //需要验证的页面
        String[] requiredView = new String[]{"index"};

        //当前请求路径
        String curUrl = request.getRequestURI();

        if (check(curUrl, requiredView)) {
            User user = (User) session.getAttribute("user");
            if (user == null) {
                response.sendRedirect("login");
                return false;
            }
        }
        return true;
    }

    private boolean check(String curUrl, String[] requiredViews) {
        for (String s : requiredViews) {
            if (StringUtils.startsWith(curUrl, s)) {
                return true;
            }
        }
        return false;
    }
}
