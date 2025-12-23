package classes_and_objects.exercises;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;

    }

    public void  add(ComplexNumber anotherComplexNumber){
        real += anotherComplexNumber.real;
        imaginary += anotherComplexNumber.imaginary;

    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber anotherComplexNumber){
        this.real -= anotherComplexNumber.real;
        this.imaginary -= anotherComplexNumber.imaginary;
    }
}
