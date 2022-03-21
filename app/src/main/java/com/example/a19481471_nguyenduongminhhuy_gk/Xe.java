package com.example.a19481471_nguyenduongminhhuy_gk;

public class Xe {
    private int id;
    private String name;
    private double giasaugiam;
    private double giagoc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiasaugiam() {
        return giasaugiam;
    }

    public void setGiasaugiam(double giasaugiam) {
        this.giasaugiam = giasaugiam;
    }

    public double getGiagoc() {
        return giagoc;
    }

    public void setGiagoc(double giagoc) {
        this.giagoc = giagoc;
    }

    public Xe(int id, String name, double giasaugiam, double giagoc) {
        this.id = id;
        this.name = name;
        this.giasaugiam = giasaugiam;
        this.giagoc = giagoc;
    }

    @Override
    public String toString() {
        return "Xe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giasaugiam=" + giasaugiam +
                ", giagoc=" + giagoc +
                '}';
    }
}
