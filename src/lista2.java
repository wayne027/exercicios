import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = true;

        while (sair) {
            System.out.print("\t qual execicio voce quer ver[1-8] 0 para sair: ");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1 -> ex1(input);
                case 2 -> ex2(input);
                case 3 -> ex3(input);
                case 4 -> ex4(input);
                case 5 -> ex5(input);
                case 6 -> ex6(input);
                case 7 -> ex7(input);
                case 8 -> ex8(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }
//    1
    static void ex1(Scanner input){
        System.out.print("digite um numero ");
        int num = input.nextInt();
        if (num > 0){
            System.out.println("positivo");
        } else {
            System.out.println("negativo");
        }
    }
//    2
    static void ex2(Scanner input){
        System.out.print("digite um numero ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
//   3
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
//    4
    static void ex4(Scanner input) {
        System.out.print("digite a hora inicial ");
        int num = input.nextInt();

        System.out.print("digite a hora final ");
        int num2 = input.nextInt();

        if (num >= 1 && num2 <= 24) {
            System.out.printf("o jogo durou %s horas \n", num2 - num);
        } else {
            System.out.println("voce digitou a/as horas erradas");
        }

    }
//    5
//    Código          Descrição  Preço
//    1               Pizza       4
//    2               Xburger      4,5
//    3               Xbacon        5
//    4               Xsalada       2
//    5               Refri       1,5
    static void ex5(Scanner input){
        System.out.print("""
                \t1\tPizza
                \t2\tXburger
                \t3\tXbacon
                \t4\tXsalada
                \t5\tRefri
                digite o codigo do pedido:\s""");
        int cod = input.nextInt();

        System.out.print("digite a quantidade: ");
        float quant = input.nextInt();
        if(cod==1){System.out.printf("seu pedido foi %s  Pizza, custou%s\n",quant,quant * 4);
        } else if (cod ==2) {
            System.out.printf("seu pedido foi %s  Xburger, custou %s\n",quant,quant * 4.5);
        } else if (cod ==3) {
            System.out.printf("seu pedido foi %s  Xbacon, custou %s\n",quant,quant * 5);
        } else if (cod ==4) {
            System.out.printf("seu pedido foi %s  Xsalada, custou %s\n", quant, quant * 2);
        } else if (cod ==5) {
            System.out.printf("seu pedido foi %s Refri, custou %s\n ", quant, quant * 1.5);
        } else {
            System.out.println("não pediu nada");
        }
        }
//    6
    static void ex6(Scanner input) {
        System.out.print("digite um valor: ");
        int num = input.nextInt();

        if (num >= 0 && num <= 25) {
            System.out.println("entre 0 e 25");
        } else if (num >= 25 && num <= 50) {
            System.out.println("entre 25 e 50");
        } else if (num >= 50 && num <= 75) {
            System.out.println("entre 50 e 75");
        } else if (num >= 75 && num <= 100) {
            System.out.println("entre 75 e 100");
        } else {
            System.out.println("não esta em nenhum intervalo");
        }
    }
//    7
    static void ex7(Scanner input){
        System.out.print("digite o valor X: ");
        float x = input.nextFloat();

        System.out.print("digite o valor Y: ");
        float y = input.nextFloat();

        if (x == 0 || y == 0) {
            System.out.print("esta no eixo");
        } else if (x > 0 && y > 0) {
            System.out.println("1 quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2 quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3 quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("4 quadrante");
        }
    }
//    8
//    Base calculo                      Aliquota
//    de R$ 1903,99 até R$ 2826,65          7,5%
//    de R$ 2826,65 até R$ 3751,05          15,0%
//    de R$ 3751,06 até R$ 4664,68          22,5%
//    acima de R$ 4664,68                   27,5%
    static void ex8(Scanner input){
        System.out.print("Qual o salario: ");
        double salario = input.nextDouble();

        if (salario >= 1903.99 && salario < 2826.65) {
            System.out.println("pague 7,5% de aliquota, que é igual a " + salario * 0.075);
        } else if (salario >= 2826.65 && salario <= 3751.05) {
            System.out.println("pague 15,0% de aliquota, que é igual a " + salario * 0.15);
        } else if (salario >= 3751.05 && salario <= 4664.68) {
            System.out.println("pague 22,5% de aliquota, que é igual a " + salario * 0.225);
        } else if (salario > 4664.68) {
            System.out.println("pague 27,5% de aliquota, que é igual a " + salario * 0.275);
        } else {
            System.out.println("salario baixo");
        }

    }

}
