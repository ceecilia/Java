
/**
 * Write a description of class Circle here.
 * 
 * @author (Ashi Cecilia Matno U15/FNS/CSC/058) 
 * @version (a version number or a date)
 */
public class Circle
{
private static int numberOfCircles = 0;
private double radius;
public Circle(double circleRadius) {
numberOfCircles++;
radius = circleRadius;
}
public double area() {
return Math.PI * radius * radius;
}
public double circumference() {
return 2.0 * Math.PI * radius;
}
public static int getNumberOfCircles() {
return numberOfCircles;
}
}
