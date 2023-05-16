package Ex2;

public class Triangle extends TwoDimensionalShape{
    private double lado1;
    private double lado2;


    public Triangle(double base, double altura, double lado1, double lado2){
        super(base, altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
     
    public double area(){
        return (super.getBase()*super.getAltura())/2;
    }

    public double perimetro(){
        return lado1+lado2+super.getBase();
    }

    public String toString(){
        String msg;
        msg = "\nLado 1 do Triangulo: "+lado1;
        msg += "\nLado 2  do Triangulo: "+lado1;
        msg+= "\nBase do Triangulo: "+super.getBase();
        msg+= "\nAltura do Triangulo: "+super.getAltura();
        msg+= "\nPerimetro do Triangulo: "+perimetro();
        msg+= "\nArea do Triangulo: "+area();
        return msg;
    }



}
