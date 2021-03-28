//Um aluno realizou três provas de uma disciplina. 
//Considerando o critério abaixo, faça um programa que mostre se 
// ele ficou para exame; em caso positivo, qual nota esse aluno 
//precisa tirar no exame para passar. Média = (Provai + Prova2 + Prova3)/3 
//A média deve ser maior ou igual a 7 ,0. Se não conseguir, a nova média 
//deve ser: Final = (Média + Exame )/2 Nesse caso, a média final deve ser maior ou 
//igual a 5,0.
//com switch
import java.util.Scanner;

public class FacaEnquanto {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        int prova1, prova2, prova3, media;
        int nota = 7;

        System.out.print("Consulta de aprovação " + "\n");

        do {
            System.out.print("Digite a primeira nota: ");
            prova1 = read.nextInt();
            if (prova1 > 10) {
                System.out.println("A nota deve estar entre 0 e 10");
            } else {
                System.out.println("");
            }
        } while (prova1 > 10);

        do {
            System.out.print("Digite a segunda nota: ");
            prova2 = read.nextInt();
            if (prova2 > 10) {
                System.out.println("A nota deve estar entre 0 e 10");
            } else {
                System.out.println("");
            }
        } while (prova2 > 10);

        do {
            System.out.print("Digite a terceira nota: ");
            prova3 = read.nextInt();
            if (prova3 > 10) {
                System.out.println("A nota deve estar entre 0 e 10");
            } else {
                System.out.println("");
            }
        } while (prova3 > 10);

        media = (prova1 + prova2 + prova3) / 3;
        if (media >= nota) {
            System.out.println("Parabéns! O Aluno está aprovado!");
        } else {
            System.out.println("Média atingida: " + media);
            int nota2 = 5;
            double precisa = (nota2 - media);
            String chose;
            System.out.println("Nova média: 5");
            System.out.println("O aluno precisará realizar o exame.");
            System.out.print("Para aprovação, este aluno precisa atingir a nota: " + precisa + "\n");
            System.out.println("O aluno já realizou o exame? S = Sim e N = Não");
            chose = read.next();

            switch (chose) {
                case "S":
                    double exame;
                    do {
                        System.out.println("Digite a nota do EXAME: ");
                        exame = read.nextDouble();
                        if (exame > 10) {
                            System.out.println("A nota deve estar entre 0 e 10");
                        }
                    } while (exame > 10);
                    double fim = (media + exame);
                    System.out.println("Nota final: " + fim);
                    if (fim >= 5) {
                        System.out.println("O aluno está aprovado com EXAME.");
                    } else {
                        System.out.println("O aluno está reprovado!");
                    }
                    break;

                case "N":
                    System.out.println("O EXAME precisa ser feito para concluir o status de aprovação do aluno.");
                    break;

                default:
                    System.out.println("Caractere inválido!");
                    break;
            }
        }
    }
}