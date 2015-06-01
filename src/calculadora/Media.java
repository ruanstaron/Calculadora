package calculadora;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        double a,b,c = 0;
        int esc = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a primeira nota");
            a=scanner.nextDouble();
            System.out.println("Digite a segunda nota");
            b=scanner.nextDouble();
            System.out.println("Digite a terceira nota");
            c=scanner.nextDouble();
            if((a+b+c)/3>=6){
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Aluno reprovado");
            }
            System.out.println("Digite 9 para sair");
            esc=scanner.nextInt();
        }while(esc!=9);
    }   
}