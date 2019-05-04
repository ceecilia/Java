
/**
 * Write a description of class Rectangle here.
 * 
 * @author (Ashi Cecilia Matno U15/FNS/CSC/058) 
 * @version (a version number or a date)
 */
class Rectangle {
private double length , width;
public Rectangle(double rectangleLength , double rectangleWidth) {
length = rectangleLength;
width = rectangleWidth;
}
public double area() {
return length * width;
}
// Accessor methods
public double getLength() {
return length;
}
public double getWidth() {
return width;
}
// Mutator methods
public void setLength(double newLength) {
length = newLength;
}
public void setRectangleWidth(float newWidth) {
width = newWidth;
}
}