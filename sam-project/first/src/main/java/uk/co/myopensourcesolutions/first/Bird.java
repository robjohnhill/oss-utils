package uk.co.myopensourcesolutions.first;

public class Bird extends Animal {
    private BirdType type;
    private int wingSpan;
    private boolean fly;

    public Bird(int height, int numberLimbs) {
        super(height, numberLimbs);
        this.type = type;
    }

    public Bird(BirdType type, int wingSpan, int height, int numberLimbs) {
        super(height, numberLimbs);
        this.type = type;
        this.wingSpan = wingSpan;
    }

    public BirdType getType() {
        return type;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public void print() {
        System.out.println("bird type is : " + type);
        System.out.println("wingspan is: " + wingSpan);
        super.print();
    }
}
