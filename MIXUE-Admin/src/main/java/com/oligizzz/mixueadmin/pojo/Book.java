package com.oligizzz.mixueadmin.pojo;

import java.io.Serializable;

/**
 *
 * @TableName book
 */
public class Book implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 封面URL
     */
    private String cover;

    /**
     * 标题
     */
    private String title;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版时间
     */
    private String date;

    /**
     * 出版社
     */
    private String press;

    /**
     * 简介
     */
    private String abs;

    /**
     *
     */
    private Integer cid;

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 封面URL
     */
    public String getCover() {
        return cover;
    }

    /**
     * 封面URL
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 出版时间
     */
    public String getDate() {
        return date;
    }

    /**
     * 出版时间
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 出版社
     */
    public String getPress() {
        return press;
    }

    /**
     * 出版社
     */
    public void setPress(String press) {
        this.press = press;
    }

    /**
     * 简介
     */
    public String getAbs() {
        return abs;
    }

    /**
     * 简介
     */
    public void setAbs(String abs) {
        this.abs = abs;
    }

    /**
     *
     */
    public Integer getCid() {
        return cid;
    }

    /**
     *
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Book other = (Book) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getPress() == null ? other.getPress() == null : this.getPress().equals(other.getPress()))
            && (this.getAbs() == null ? other.getAbs() == null : this.getAbs().equals(other.getAbs()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getPress() == null) ? 0 : getPress().hashCode());
        result = prime * result + ((getAbs() == null) ? 0 : getAbs().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cover=").append(cover);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", date=").append(date);
        sb.append(", press=").append(press);
        sb.append(", abs=").append(abs);
        sb.append(", cid=").append(cid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
