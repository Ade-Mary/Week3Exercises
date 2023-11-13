package Week3Exercises;

public abstract class LivingThings
{
    private static String name;
    private static int age;

  public LivingThings(String name, int age) {

       setName(name);
     setAge(age);
   }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        LivingThings.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        LivingThings.age = age;
    }

    abstract void speak();
   abstract void sleep();
}
