package com.blog.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Sergey on 18.05.2016.
 */
@Entity
@Table(name = "articles", schema = "blog")
public class Articles {
    private int id;
    private String title;
    private String text;
    private Timestamp date;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "text", nullable = false, length = -1)
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

        Articles articles = (Articles) o;

        if (id != articles.id) return false;
        if (title != null ? !title.equals(articles.title) : articles.title != null) return false;
        if (text != null ? !text.equals(articles.text) : articles.text != null) return false;
        if (date != null ? !date.equals(articles.date) : articles.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}