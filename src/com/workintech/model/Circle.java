package com.workintech.model;

public class Circle {
   private double radius;

    public Circle (double radius) {
        this.radius = radius;
        if(radius < 0) {
            radius = 0;
        }else {
            radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
