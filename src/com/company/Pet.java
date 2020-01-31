package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    public String name;
    public String type;

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
