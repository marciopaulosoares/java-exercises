package compileandrun.test001;

import compileandrun.model.DogModel;

public class my001class {
    public static void main(String[] args) {
        DogModel dog = new DogModel(4);
        System.out.println("Hello World, my dog has " + dog.getLegs() + " legs");
    }
}
