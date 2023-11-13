package Week3Exercises;

public class Organism {
   private String name;
   private static int count=0;

    public Organism(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}



class Animal extends Organism {
    ;

    int numberOfLegs;


    public Animal(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;

    }

    void speak() {
        System.out.println();


    }
}


class Plant extends Organism {
    private double length;

    public Plant(String name, double length) {
        super(name);
        this.length = length;
    }

    void sleep() {
        System.out.println(getName()+ " is sleeping.");
    }

    public double getLength() {
        return length;
    }
}

class Dog extends Animal {
    public Dog(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    void speak() {
        System.out.println(getName() + " barks.");
    }


}
class Tree extends Plant {
    public Tree(String name, double length) {
        super(name, length);
    }

    public static void main(String[] args) {
        Dog dog=new Dog("lhasa",4);
        Tree tree=new Tree("Iroko",70.0);
        dog.speak();
        System.out.println(Organism.getCount());

    }
}

