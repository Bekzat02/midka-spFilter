package com.company;

public class Circle {
    public int id;
    public double radius;
    public double diameter;

    public Circle(int id, double radius, double diameter) {
        this.id = id;
        this.radius = radius;
        this.diameter = diameter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
