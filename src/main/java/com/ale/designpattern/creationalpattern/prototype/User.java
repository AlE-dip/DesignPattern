package com.ale.designpattern.creationalpattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Cloneable{
    private String username;
    private String password;
    private String email;

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
