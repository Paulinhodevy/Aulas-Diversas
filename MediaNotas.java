import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita o número de Alunos
        System.out.println("Digite o número de alunos: ");
        int numerodeAlunos = scanner.nextInt();

        //Array para armazenar as notas 
        double[] notas = new double[numerodeAlunos];

        //Coleta as notas dos alunos
        for (int i = 0; i < numerodeAlunos; i++) {
            System.out.print("Digite a nota do Aluno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        //Calcula a média
        double soma = 0;
        for (int i = 0; i < numerodeAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / numerodeAlunos;

        //Exibe a média
        System.out.println("A média das notas dos Alunos é: " + media);

        //Fecha o scanner
        scanner.close();







    }
}
