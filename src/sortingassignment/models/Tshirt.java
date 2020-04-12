/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment.models;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Tshirt {

    private Size size;
    private Color color;
    private Fabric fabric;
    private String name;
    private double price;
    private static String[] names;

    static {
        names = new String[]{"Aloha", "Baseball", "Camp",
            "Epaulette", "Lumberjack", "Granddad", "Golf",
            "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
    }

    public Tshirt(Size size, Color color, Fabric fabric, String name, double price) {
        this.size = size;
        this.color = color;
        this.fabric = fabric;
        this.name = name;
        this.price = price;
    }
    public Tshirt() {
        this.size = randomSize();
        this.color = randomColor();
        this.fabric = randomFabric();
        this.name = randomName();
        this.price = generatePrice(size.ordinal(), color.ordinal(), fabric.ordinal());

    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tshirt{" + "size=" + size + ", color=" + color + ", fabric=" + fabric + ", name=" + name + ", price=" + price + '}';
    }

    public Color randomColor() {
        Color[] c;
        Random ran = new Random();
        c = Color.values();
        return c[ran.nextInt(c.length)];
    }

    public Size randomSize() {
        Size[] s;
        Random ran = new Random();
        s = Size.values();
        return s[ran.nextInt(s.length)];
    }

    public Fabric randomFabric() {
        Fabric[] f;
        Random ran = new Random();
        f = Fabric.values();
        return f[ran.nextInt(f.length)];
    }

    private double generatePrice(int size, int color, int fabric) {
        String temp = "" + size + color + fabric;
        double timi = Double.parseDouble(temp) / 10;
        return timi;
    }

    private String randomName() {
        Random ran = new Random();
        int s = ran.nextInt(names.length);
        return names[s];
    }

}
