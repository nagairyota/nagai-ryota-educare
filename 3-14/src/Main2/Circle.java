package Main2;

public class Circle extends Shape {
    double radius;

    public Circle(double  radius){
        this.radius = radius;
    }

    @Override
    public double  getArea(){
        double result = this.radius * this.radius * 3.14;
        return result;
    }
}
