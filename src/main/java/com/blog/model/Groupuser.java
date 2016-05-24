package com.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sergey on 18.05.2016.
 */
@Entity
@Table(name = "groupuser", schema = "blog")
public class Groupuser {
    private String name;

    @Id
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groupuser groupuser = (Groupuser) o;

        if (name != null ? !name.equals(groupuser.name) : groupuser.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
