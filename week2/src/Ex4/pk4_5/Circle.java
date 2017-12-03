package Ex4.pk4_5;

public class Circle extends Shape {
  double radius;

  public Circle() {
    super();
    this.radius = 1.0;
  }

  public Circle(String color, boolean filled) {
    super(color, filled);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return Math.PI * radius * 2;
  }

  @Override
  public String toString() {
    return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
  }

}
