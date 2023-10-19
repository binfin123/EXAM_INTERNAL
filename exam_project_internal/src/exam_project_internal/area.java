package exam_project_internal;

public class area {

    public void circle_Area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }

    public void rectangle_Area(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is: " + area);
    }

    public void triangle_Area(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle with base " + base + " and height " + height + " is: " + area);
    }

    public static void main(String[] args) {
        area areaCalculator = new area();
        
        areaCalculator.circle_Area(5.0);
        areaCalculator.rectangle_Area(6.0, 4.0);
        areaCalculator.triangle_Area(3.0, 8.0);
    }
}
