/*
Faça um programa de consulta que leia nomes de pessoas, 
sendo a quantidade determinada pelo usuário. Logo após a entrada 
pergunte ao usuário o número do nome que ele gostaria de consultar. 
Após sua resposta, exiba o nome e o telefone. Chame atenção do usuário em caso 
de uma consulta inválida, ou seja, com números menores ou iguais a zero, 
ou maiores do que a quantidade cadastrado - Usuário Inválido
 */
package aula_14_e_15;
import java.util.Scanner; 
public class Ex02 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        int i;        
        System.out.println("Quantas pessoas serão cadastradas?");
        i = ler.nextInt();
        int []tel = new int [i];
        String []nome = new String [i];
 
        for (int x = 0; x < i; x ++){
            System.out.println("cadastre a pessoa número "+(1 + x));
            nome [x] = ler.next();
            System.out.println("Cadastre o telefone da pessoa número "+(1 + x));
            tel [x] = ler.nextInt();    
        }
        String  buscadenome;
        System.out.println("Digite o nome do cliente.");
        buscadenome = ler.next();
        
        boolean semcadastro = true;
        for (int x = 0; x < i; x ++){
            if (buscadenome. equals (nome [x])){
                System.out.println(nome[x]);
                System.out.println(tel [x]);
                semcadastro = false;
            }
        }
 
        if (!semcadastro){ 
        } else {
            System.out.println("Nome não cadastrado");
        }
    }
}