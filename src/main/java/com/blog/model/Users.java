package com.blog.model;

import javax.persistence.*;

/**
 * Created by Sergey on 18.05.2016.
 */
@Entity
@Table(name = "users", schema = "blog")
public class Users {
    private String login;
    private String pass;

    @Id
    @Column(name = "login", nullable = false, length = 15)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "pass", nullable = false, length = 45)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (login != null ? !login.equals(users.login) : users.login != null) return false;
        if (pass != null ? !pass.equals(users.pass) : users.pass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        return result;
    }
}
