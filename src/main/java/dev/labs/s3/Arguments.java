package dev.labs.s3;

public class Arguments {

    public static void main(String[] args) {
        System.out.println(Circle.numberOfCircles); // Referenced by class name only as it is a class variable

        Circle oval = new Circle(5,5);
        System.out.println(Circle.numberOfCircles);

        Circle round = new Circle(1,1);
        System.out.println(Circle.numberOfCircles);

        System.out.println(round.numberOfCircles); // Possible but discouraged because it is not clear we are accessing a class variable
    }
}

// Ref: https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
class Circle {
    private int originOne;
    private int originTwo;

    // Class Variable
    public static int numberOfCircles = 0;

    static final double PI = 3.1416;

    public Circle(int originOne, int originTwo) {
        this.originOne = originOne;
        this.originTwo = originTwo;
        ++numberOfCircles;
    }

    public static int getNumberOfCircles(){
//        return originOne; // Not possible
//        int test = new Circle(2,2).originOne; // Work around
        return numberOfCircles;
    }

    public int getOriginOne() {
        return originOne;
    }

    public void setOriginOne(int originOne) {
        this.originOne = originOne;
    }

    public int getOriginTwo() {
        return originTwo;
    }

    public void setOriginTwo(int originTwo) {
        this.originTwo = originTwo;
    }


}
