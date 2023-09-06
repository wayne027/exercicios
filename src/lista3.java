import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean sair = true;

        while (sair) {
            System.out.print("\n\t qual execicio voce quer ver[1-3] 0 para sair: ");
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1 -> ex1(input);
                case 2 -> ex2(input);
                case 3 -> ex3(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }
//  1
    static void ex1(Scanner input){
        int senha = 0;
        while(senha != 2002){
            System.out.print("\nsenha incorreta");
            System.out.print("\ncoloque a senha: ");
            senha = input.nextInt();
        }
        System.out.print("\nsenha correta");
    }
// 2
    static void ex2(Scanner input){
        while(true){
            System.out.print("digite o valor X: ");
            float x = input.nextFloat();

            System.out.print("digite o valor Y: ");
            float y = input.nextFloat();

            if (x == 0 || y == 0) {
                System.out.print("esta no eixo");
                break;
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
    }
// 3-
// Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
//  deve ser solicitado um novo código (até que seja válido). 
// O programa será encerrado quando o código informado for o número 4.
//  Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
        static void ex3(Scanner input){
            int alcool = 0;
            int gasolina = 0;
            int diesel = 0; 
            int cod;
            while(true) {
                System.out.print("Combustivel abastecido: \n\t1.Alcool \n\t2.Gasolina \n\t3.Diesel \n\t4.Finalizar \n\t Digite: ");
                cod = input.nextInt();
                if(cod ==1)
                {
                    System.out.println(alcool);
                }
                    else if(cod ==2 )
                {
                    System.out.print(gasolina);
                }
                    else if (cod == 3)
                {
                    System.out.print(diesel);
                }
                    else if (cod == 4) {
                        System.out.print("Foi de base");
                        break;
                }
            }
            System.out.printf("\n\tAlcool: %s  \n\tGasolina: %s \n\tDiesel: %s", alcool, gasolina, diesel);
        }
}