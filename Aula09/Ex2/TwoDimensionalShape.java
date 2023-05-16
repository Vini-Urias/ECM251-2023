package Ex2;

public class TwoDimensionalShape extends Shape {
    private double base;
    private double altura;


    public TwoDimensionalShape(){
        base = 0.0;
        altura = 0.0;
    }

    public TwoDimensionalShape(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
