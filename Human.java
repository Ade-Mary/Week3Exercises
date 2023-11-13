package Week3Exercises;

public class Human extends LivingThings implements Living{


    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {

        System.out.println("Humans can move from one place to another");
    }

    @Override
    public void eat() {
        System.out.println("Humans are omnivores");
    }

    @Override
    void speak() {

        System.out.println("human speak.");
    }

    @Override
    void sleep() {
        System.out.println("Humans need to get at least 6 hours of sleep every day.");
    }


}
