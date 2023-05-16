package Ex2;

public class Circle extends TwoDimensionalShape {
    private double raio;

    public Circle(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double area(){
        return Math.PI*raio*raio;
    }

    public double perimetro(){
        return Math.PI*2*raio;
    }

    public String toString(){
        String msg;
        msg = "\nRaio do Circulo: "+raio;
        msg+= "\nPerimetro do Circulo: "+perimetro();
        msg+= "\nArea do Circulo: "+area();
        return msg;
    }

}
