package com.blog.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 * Created by Sergey on 25.05.2016.
 */
@Entity
public class Users {


    @Id
    @Column(name = "login")
    @Size(min = 6, max = 15, message = "Логин должен содержать не менее 6 символов и не более 15")
    private String login;

    @Column(name = "pass")
    @Size(min = 8, message = "Пароль должен содержать не менее 8 символов")
    private String pass;

    @Column(name = "email")
    @Email(message = "Введенный email не корректен")
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

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
