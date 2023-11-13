package Week3Exercises;

public class ConcreteShape {

    private double length;
    private double width;
    private int height;
    private double radius;

    public ConcreteShape(double length, double width, int height, double radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public  double area(double radius)
    {
     return Math.PI*Math.pow(radius,2);
    }
    public  double perimeter(char x,int width,int height)
    {
        return (0.5 * width) * height;
    }
    public double area(double length,double width){
     return length * width;
    }

    public static void main(String[] args) {
        ConcreteShape shapes=new ConcreteShape(20,10,12,7);
        System.out.println(shapes.area(7));
        System.out.println(shapes.perimeter('T',10,12));
        System.out.println(shapes.area(10,10));

    }
}
