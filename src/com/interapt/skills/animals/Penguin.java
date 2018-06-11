package com.interapt.skills.animals;

public class Penguin extends Animal {

    private String type;
    private String featherType;
    private String wingSpan;

    public Penguin(String name, String location, char gender, double weight, String type, String featherType, String wingSpan) {
        super(name, location, gender, weight);
        this.type = type;
        this.featherType = featherType;
        this.wingSpan = wingSpan;
    }

    public String getType() {
        return type;
    }

    public String getFeatherType() {
        return featherType;
    }

    public void setFeatherType(String featherType) {
        this.featherType = featherType;
    }

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }
}
