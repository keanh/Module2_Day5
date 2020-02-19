public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(){

    }

    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}

class TestCircle{
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println("Diện tích hình tròn 1: " + circle1.getArea() + " có màu " + circle1.getColor());
        Circle circle2 = new Circle();
        circle2.setRadius(10);
        System.out.println("Diện tích hình tròn 2: " + circle2.getArea() + " có màu " + circle2.getColor());
    }
}
