package uk.co.myopensourcesolutions.first;

public class Cat extends Animal {
    private boolean hasTail;

    public Cat(int height) {
        super(height, 4);
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
