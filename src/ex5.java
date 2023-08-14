import java.util.Scanner;

public class ex5 {
    //    ex5
//    Faça um programa para ler o código de uma peça 1, o numero de peças em 1, o valor unitário de cada peça 1,
//    o código de uma peça 2, o numero de peças em 2, o valor unitário de cada peça 2.
//    Calcule e mostre o valor a ser pago
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o o codigo da peca: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.println("qual o valor da peça " + codigo);
        double val_peca = input.nextDouble();
        input.nextLine();

        Peca peca1 = new Peca(codigo, val_peca);

        System.out.println("quantas peças: ");
        int num_pecas1 = input.nextInt();
        input.nextLine();

        System.out.println("Qual o o codigo da peca: ");
        int codigo2 = input.nextInt();
        input.nextLine();

        System.out.println("qual o valor da peça " + codigo2);
        double val_peca2 = input.nextDouble();
        input.nextLine();

        Peca peca2 = new Peca(codigo2, val_peca2);

        System.out.println("quantas peças: ");
        int num_pecas2 = input.nextInt();
        input.nextLine();

//calcular preço
        double val_pagar = (peca2.val_peca * num_pecas2) + (peca1.val_peca * num_pecas1);

        System.out.printf("pagar %.2f R$", val_pagar);

        input.close();
    }
}

class Peca {
    int codigo;
    double val_peca;
    public Peca(int codigop, double val_pecap) {
        codigo = codigop;
        val_peca = val_pecap;
    }
    public int a() {
        return codigo;
    }
}