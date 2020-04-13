package uk.co.myopensourcesolutions.first;

import java.util.ArrayList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        Animal bird = new Bird(BirdType.ROBIN, 1, 10, 2);
        Animal cat = new Cat(2);
        List<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(cat);
        animals.stream().forEach(a -> {
            a.print();
            System.out.println("animal height is: " + a.getHeight());
        }  );
    }
}
