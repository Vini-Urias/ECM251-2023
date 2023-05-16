package Ex2;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, lado_quadrado, lado1, lado2, base_triangulo, altura;
/*
 * 
 * 
 * 
 */
             // Testando a classe Square
        System.out.println("Lado do quadrado: ");
        lado_quadrado = sc.nextDouble();
        Square quadrado = new Square(lado_quadrado);
        System.out.println(quadrado.toString());
        quadrado.setLadoQuadrado(4.0);
        System.out.println(quadrado.toString());
/*
 * 
 * 
 * 
 */
             // Testando a classe Circle
        System.out.println("Raio do Circulo: ");
        raio = sc.nextDouble();
        Circle circulo = new Circle(raio);
        System.out.println(circulo.toString());
        circulo.setRaio(4);
        System.out.println(circulo.toString());
/*
 * 
 * 
 * 
 */
            // Testando a classe Triangle
        System.out.println("Base do Traingulo: ");
        base_triangulo = sc.nextDouble();
        System.out.println("Altura do Triangulo: ");
        altura = sc.nextDouble();
        System.out.println("Outro lado do Triangulo: ");
        lado1 = sc.nextDouble();
        System.out.println("Segundo outro lado do Triangulo: ");
        lado2 = sc.nextDouble();
        Triangle triangulo = new Triangle(base_triangulo, altura, lado1, lado2);
        System.out.println(triangulo.toString());
        triangulo.setAltura(2);
        triangulo.setBase(2);
        triangulo.setLado1(2);
        triangulo.setLado2(2);
        System.out.println(triangulo.toString());

        sc.close();
    }
}
