package uk.co.myopensourcesolutions.first;

public class Animal {
    private int height;
    private int numberLimbs;

    public Animal(int height, int numberLimbs) {
        this.height = height;
        this.numberLimbs = numberLimbs;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberLimbs() {
        return numberLimbs;
    }

    public void print() {
        System.out.println("height is: " + height);
        System.out.println("numberLimbs is: " + numberLimbs);
    }
}
