import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ex1(input);
//        ex2(input);
//        ex3(input);
        ex4(input);
        ex5(input);
        ex6(input);
        ex7(input);
        ex8(input);
        input.close();

    }
//    1- Faça um programa para ler um número inteiro, e e depois dizer
//se este número é negativo ou não.
    static void ex1(Scanner input){
        System.out.print("digite um numero ");
        int num = input.nextInt();
        if (num > 0){
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }
//    Faça um programa para ler um número inteiro e dizer se este
//número é par ou impar.
    static void ex2(Scanner input){
        System.out.print("digite um numero ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
//    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar O
//uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indi-
//cando se os valores lidos são múltiplos entre si. Atenção: os núme-
//ros devem poder ser digitados em ordem crescente ou decres-
//cente.
    static void ex3(Scanner input){
        System.out.print("digite um numero ");
        int num = input.nextInt();

        System.out.print("digite um numero ");
        int num2 = input.nextInt();

        if (num % num2 == 0){
            System.out.println("São multiplos");
        } else if (num2 % num == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
//    Leia hora inicial e a hora final de um jogo. A seguir calcule a
//duração do Jogo, sabendo que O mesmo pode começar em um dia
//e terminar em outro, tendo uma duração mínima de 1 hora e má-
//xima de 24 horas
    static void ex4(Scanner input){

    }
//    Com base na tabela abaixo, escreva um programa que leia o có-
//digo de um item e a quantidade deste item. A seguir, calcule e
//mostre o valor da conta a pagar:
//    Código          Descrição  Preço
//    1               Pizza       4
//    2               Xburger      4,5
//    3               Xbacon        5
//    4               Xsalada       2
//    5               Refri       1,5
    static void ex5(Scanner input){

    }
//    Faça um programa que leia um valor qualquer e apresente uma
//mensagem dizendo em qual dos seguintes intervalos ([0,25],
//(25,50], (50,75], (75,100]) este valor se encontra.Se o valor não
//estiver em nenhum destes intervalos, deverá ser impressa a men-
//sagem "Fora de intervalo"
    static void ex6(Scanner input){

    }
//    Leia 2 valores com uma casa decimal (x e y), que devem repre-
//sentar as coordenadas de um ponto em um plano. A seguir, deter-
//mine qual o quadrante ao qual pertence o ponto, ou se se está sobre
//um dos eïxos cartesianos ou na origem (x= y=0).
    static void ex7(Scanner input){

    }
//    8- Faça um programa que leia um valor com duas casas de-
//cimais, equivalente ao salário de uma pessoa. Em seguida
//calcule e mostre o valor que esta þessoa deve pagar de Im-
//O
//posto de Renda, segundo a tabela abaixo
//    Base calculo                      Aliquota
//    de R$ 1903,99 até R$ 2826,65
//    de R$ 2826,66,99 até R$ 3751,05
//    de R$ 3751,06 até R$ 4664,68
//    acima de R$ 4664,68
    static void ex8(Scanner input){

    }

}
