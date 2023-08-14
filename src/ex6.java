import java.util.Scanner;

public class ex6 {
    //    ex6
//    Faça um programa que leia três valores com ponto flutuante double A, B e C
//    Em seguida, calcule
//    a) a area do triangulo retangulo que tem A por base e C por altura.
//    b) a area do circulo de raio C (pi = 3.14159).
//    c) a area do trapézio que tem A e B por base e C por altura.
//    d) a area do quadrado que tem lado B.
//    e) a area do retangulo que tem lados A e B.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("valor A: ");
        float A = input.nextFloat();
        System.out.print("valor B: ");
        float B = input.nextFloat();
        System.out.print("valor C: ");
        float C = input.nextFloat();

        area_triangulo(A, C);
        area_circulo(C);
        area_trapezio(A, B, C);
        area_quadrado(B);
        area_retangulo(A, B);

        input.close();
    }

    public static void area_triangulo(float base, float altura) {
        float area = (base * altura) /2;
        System.out.printf("\n\t%f . %f = %f", base, altura, area);
    }

    public static void area_circulo(float raio) {
        double area = (raio*raio) * 3.14159;
        System.out.printf("\n\t%f^2 . pi = %f", raio, area);
    }

    public static void area_trapezio(float lado1, float lado2, float altura) {
        float area = ((lado1 + lado2) * altura) /2;
        System.out.printf("\n\t((%f + %f) * %f) / 2 = %f", lado1, lado2, altura, area);
    }

    public static void area_quadrado(float lado) {
        float area = lado*lado;
        System.out.printf("\n\t%f^2 = %f", lado, area);
    }

    public static void area_retangulo(float lado1, float lado2) {
        float area = lado1 * lado2;
        System.out.printf("%f . %f = %f", lado1, lado2, area);
    }
}