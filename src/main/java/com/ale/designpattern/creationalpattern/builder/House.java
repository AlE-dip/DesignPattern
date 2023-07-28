package com.ale.designpattern.creationalpattern.builder;

import lombok.Data;

@Data
public class House {
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;
    private String color;

    public static Builder builder(){
        return new HouseBuilder();
    }
}
