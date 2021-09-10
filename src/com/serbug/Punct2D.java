package com.serbug;

public class Punct2D {

    private float x;
    private float y;

    public Punct2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void modificaCoordonate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void showPunct() {
        System.out.println("Puctul va avea coordonatele (" + this.x + ", " + this.y + ").");
    }
}
