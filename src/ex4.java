import java.util.Scanner;

public class ex4 {
//    ex4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o número do funcionário: ");
        int funcionario_num = input.nextInt();
        input.nextLine();

        System.out.print("Horas trabalhadas: ");
        float horas_trabalhadas = input.nextFloat();
        input.nextLine();

        System.out.print("quanto voce recebe por hora: ");
        float recebe_hora = input.nextFloat();
        input.nextLine();

        float salario = horas_trabalhadas * recebe_hora;

        System.out.printf("o funcionário %s voce recebe %.2f R$ de salário", funcionario_num, salario);

        input.close();
    }
}