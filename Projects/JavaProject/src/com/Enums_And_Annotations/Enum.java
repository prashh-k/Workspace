package com.Enums_And_Annotations;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enum {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

