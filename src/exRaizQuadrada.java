import java.util.Scanner;

public class exRaizQuadrada {
    //    exRaizQuadrada
//     programa função quadratica

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\tvalor a: ");
        double a = input.nextDouble();
        input.nextLine();

        System.out.print("\tvalor b: ");
        double b = input.nextDouble();
        input.nextLine();

        System.out.print("\tvalor c: ");
        double c = input.nextDouble();
        input.nextLine();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("\tdelta negativo");
        } else {
            double rdelta = Math.sqrt(delta);

            double x1 = (-b - rdelta) / 2;
            double x2 = (-b + rdelta) / 2;

            System.out.printf("\tdelta: %f\n\tx1: %f\n\tx2: %f", delta, x1, x2);
        }

        input.close();
    }
}
