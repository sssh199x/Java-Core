package inheritance.exercises;

public class Circle {
    // write code here
    private double radius;

    public Circle(double radius){
        if(radius < 0){
            this.radius = 0;
            return;
        }
        this.radius = radius;
    }


    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }
}
