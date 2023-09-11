import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //response object(of the class Scanner) is initialized to read user input(Radius of circle)
        Scanner response = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double radius = response.nextDouble();

        System.out.print("The Diameter of your circle is: ");
        System.out.println(circleDiameter(radius));
        System.out.println("The Area of your circle is: ");
        System.out.println(circleArea(radius));
        System.out.println("The Circumference of your circle is: ");
        System.out.println(circleCircumference(radius));

    }
    public static double circleDiameter(double radius) {
        //This is a function that multiplies the input argument (Radius) of type double by two
        //This value is then returned
        return radius * 2;

    }
    public static double circleArea(double radius) {
        //This is a function that squares the input argument (Radius) of type double, and multiplies it by pi(Math.PI)
        //This value is then returned
        return Math.PI * (Math.pow(radius, 2));

    }
    public static double circleCircumference(double radius) {
        //This is a function that multiplies the input argument (Radius) of type double, by two, and Math.PI
        //This value is then returned

        return 2 * Math.PI * radius;

    }


}
