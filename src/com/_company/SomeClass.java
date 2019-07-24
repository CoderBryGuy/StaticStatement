package com._company;

public class SomeClass {
    private final int instanceNumber;
    private static int classCounter = 0;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(this.name + " created, instance is is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public static int getClassCounter() {
        return classCounter;
    }

    public String getName() {
        return name;
    }
}
