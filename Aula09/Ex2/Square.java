package Ex2;

public class Square extends TwoDimensionalShape{
    private double ladoQuadrado;
    
    public Square(double ladoQuadrado){
        this.ladoQuadrado = ladoQuadrado;
    }

    public double area(){
        return ladoQuadrado*ladoQuadrado;
    }

    public double perimetro(){
        return 4*ladoQuadrado;
    }

    public double getLadoQuadrado(){
        return ladoQuadrado;
    }

    public void setLadoQuadrado(double ladoQuadrado){
        this.ladoQuadrado = ladoQuadrado;
    }

    public String toString(){
        String msg;
        msg = "\nLado do Quadrado: "+ladoQuadrado;
        msg+= "\nPerimetro do Quadrado: "+perimetro();
        msg+= "\nArea do Quadrado: "+area();
        return msg;
    }
}
