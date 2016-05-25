package com.blog.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by Sergey on 25.05.2016.
 */
@Entity
public class Users {

    @Size(min = 6, max = 30, message = "Минимальное значение логина 6 символов")
    private String login;
    @Size(min = 8, max = 30, message = "Минимальное значение пароля 8 символов")
    private String pass;
    private String email;

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

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (login != null ? !login.equals(users.login) : users.login != null) return false;
        if (pass != null ? !pass.equals(users.pass) : users.pass != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
