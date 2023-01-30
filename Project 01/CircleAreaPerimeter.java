// Programmer : Jsako

public class CircleAreaPerimeter {

    public static void main(String[] args) {
        double radius, area, perimeter;
        final double pi = 3.14159;
        radius = 5.5;
        area = radius * radius * pi;
        perimeter = 2 * radius * pi;
        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);
    }
    
}