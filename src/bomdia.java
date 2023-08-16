import java.util.Scanner;

public class bomdia {
    //    programa bom dia/tarde/noite


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("que horas são ");
//        int hora = input.nextInt();

        while (true) {
            System.out.print("que horas são ");
            int hora = input.nextInt();

            if (hora < 12 && hora >= 6) {
                System.out.println("Bom Dia!!!!!!!!");
            } else if (hora < 6 || hora > 19 && hora <= 24) {
                System.out.println("Boa Noite");
            } else if (hora <= 19) {
                System.out.println("Boa Tarde!!!");
            } else {
                System.out.println("digite uma hora valida");
            }
        }
//        input.close();

    }
}