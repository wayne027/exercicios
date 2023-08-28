import java.util.Scanner;

public class lista4 {
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
                case 4 -> ex1(input);
                case 5 -> ex2(input);
                case 6 -> ex3(input);
                case 7 -> ex3(input);
                case 0 -> sair = false;
            }
        }

        input.close();

    }
// 1- Leia um valor inteiro X (1 <= X <= 1000). 
// Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
static void ex1(Scanner input){

}
// 2- Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//  Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
//  mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
static void ex2(Scanner input){
    
}
// 3- Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
// Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
//  Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
// sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
static void ex3(Scanner input){
    
}
// 4- Fazer um programa para ler um número N. 
// Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
//  Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
static void ex4(Scanner input){
    
}
// 5-  Ler um valor N. Calcular e escrever seu respectivo fatorial. 
// Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.
static void ex5(Scanner input){
    
}
// 6-  Ler um número inteiro N e calcular todos os seus divisores.
static void ex6(Scanner input){
    
}
// 7-  Fazer um programa para ler um número inteiro positivo N. 
// O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, 
// mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
static void ex7(Scanner input){
    
}
}