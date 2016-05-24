package com.blog.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Sergey on 18.05.2016.
 */
@Entity
@Table(name = "messages", schema = "blog")
public class Messages {
    private int id;
    private String text;
    private Timestamp date;
    private Articles articlesByArticlesId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "text", nullable = false, length = 255)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Messages messages = (Messages) o;

        if (id != messages.id) return false;
        if (text != null ? !text.equals(messages.text) : messages.text != null) return false;
        if (date != null ? !date.equals(messages.date) : messages.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "articles_id", referencedColumnName = "id", nullable = false)
    public Articles getArticlesByArticlesId() {
        return articlesByArticlesId;
    }

    public void setArticlesByArticlesId(Articles articlesByArticlesId) {
        this.articlesByArticlesId = articlesByArticlesId;
    }
}
