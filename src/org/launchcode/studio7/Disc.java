package org.launchcode.studio7;

public abstract class Disc {
    String name;
    double capacity;
    String contents;
    String discType;

    public Disc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}

