
package aula09correcao;
import java.util.Scanner;

public class MainEscola {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        Turma tr = new Turma();
        Curso cr = new Curso();
        
        System.out.println("Digite o código do curso: ");
        cr.setCodigo(ler.nextInt());        
        System.out.println("Digite o nome do curso: ");
        cr.descricao = ler.next();
        System.out.println("Digite a carga horária do curso: ");
        cr.setCargaHoraria(ler.nextInt());
        System.out.println("Digite o código da turma: ");
        tr.setCodigo(ler.nextInt());
        System.out.println("Digite a data de início da turma: ");
        tr.setDataInicio(ler.nextInt());
        System.out.println("Digite a data de término da turma: ");
        tr.setDataTermino(ler.nextInt());
        
        //frufru
        System.out.println("Dados do contrato!"+"\n"+"**********************");
        
        
        //invocação dos métodos acessores com retorno
        System.out.println("O código do curso é: "+cr.getCodigo());
        System.out.println("O nome do curso é: "+cr.descricao);
        System.out.println("A carga horária do curso é: "+cr.getCargaHoraria());
        System.out.println("O código da turma é: "+tr.getCodigo());
        System.out.println("A data de início da turma é: "+tr.getDataInicio()+"\n"+"E data de término da turma é: "+tr.getDataTermino());
        
    }
    
}
