package MyExcercises.Excercise7_Polymorphism;

public class Rectangle implements Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
