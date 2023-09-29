
package org.example;

import java.util.ArrayList;
/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.
 *******************************************************************************/
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Animal> animals = new ArrayList<>();
        animals = test(animals);

        animals.stream().forEach(animal -> {
            animal.eat();
            animal.sound();
        });
    }

    public static <T extends Animal> List<T> test(List<T> animals) {
        animals.add((T) new Dog());
        animals.add((T) new Cat());

        return animals;
    }

}
