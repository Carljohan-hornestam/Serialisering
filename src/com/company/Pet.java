package com.company;

import java.io.Serializable;

public class Pet implements Serializable {
    private String type;
    private String sound;
    private transient int age;

    public Pet (String type, String sound, int age){
        this.type = type;
        this.sound = sound;
        this.age = age;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                ", age=" + age +
                '}';
    }
}
