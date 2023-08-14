import java.util.Scanner;

public class exRaizQuadrada {
    //    exRaizQuadrada
//     programa le 2 numeros e diga a sua raiz quadrada, a sua potencia e seus valores absolutos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("valor x: ");
        double x = input.nextDouble();
        input.nextLine();

        System.out.print("valor y: ");
        double y = input.nextDouble();
        input.nextLine();

        double raizx = Math.sqrt(x), raizy = Math.sqrt(y);
        System.out.printf("\n\traiz x: %f\n\traiz y: %f", raizx, raizy);

        double powx = Math.pow(x, 2), powy = Math.pow(y, 2);
        System.out.printf("\n\tx^2: %f\n\ty^2: %f", powx, powy);

        double absx = Math.abs(x), absy = Math.abs(y);
        System.out.printf("\n\tvalor absoluto de x: %f\n\tvalor absoluto de y: %f", absx, absy);

        input.close();
    }
}