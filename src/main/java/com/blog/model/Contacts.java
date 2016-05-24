package com.blog.model;

import javax.persistence.*;

/**
 * Created by Sergey on 23.05.2016.
 */
@Entity
@Table(name = "contacts", schema = "blog")
public class Contacts {
    private int id;
    private String name;
    private String value;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 60)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacts contacts = (Contacts) o;

        if (id != contacts.id) return false;
        if (name != null ? !name.equals(contacts.name) : contacts.name != null) return false;
        if (value != null ? !value.equals(contacts.value) : contacts.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
