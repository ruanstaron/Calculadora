package calculadora;

import java.util.Scanner;

public class Calculadora {
    static int esc;
    static double a;
    static double b;
    static double somar(double a, double b){
        return a+b;
    }
    
    static double subtrair(double a, double b){
        return a-b;
    }
    
    static double multiplicar(double a, double b){
        return a*b;
    }
    
    static double dividir(double a, double b){
        if(b==0){
            System.out.println("Impossível dividir por zero");
            return 0;
        }else{
            return a/b;
        }
    }
    
    static void numeros(){
        Scanner scanner = new Scanner(System.in);
        if(esc==5){
            System.out.println("Digite o peso do individuo");
            a=scanner.nextDouble();
            System.out.println("Digite a altura do individuo");
            b=scanner.nextDouble();
        }else{
            System.out.println("Digite o primeiro valor");
            a=scanner.nextDouble();
            System.out.println("Digite o segundo valor");
            b=scanner.nextDouble();
        }
    }
    
    static void imc(double aa,double bb){
        double imc=aa/(bb*bb);
        if(imc<18.5){
            System.out.println("Você está abaixo do peso");
        }
        if(imc>=18.5 && imc<=24.9){
            System.out.println("Peso ideal");
        }
        if(imc>=25 && imc<=29.9){
            System.out.println("Excesso de peso");
        }
        if(imc>=30 && imc<=34.9){
            System.out.println("Gordo");
        }
        if(imc>=35 && imc<=39.9){
            System.out.println("Baleia");
        }
        if(imc>=40){
            System.out.println("Procure um médico");
        }
                
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-IMC, 9-Sair\n");
            esc=scanner.nextInt();
            switch(esc){
                case 1:
                    numeros();
                    System.out.println(somar(a,b));
                    break;
                case 2:
                    numeros();
                    System.out.println(subtrair(a,b));
                    break;
                case 3:
                    numeros();
                    System.out.println(multiplicar(a,b));
                    break;
                case 4:
                    numeros();
                    System.out.println(dividir(a,b));
                    break;
                case 5:
                    numeros();
                    imc(a,b);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }while(esc!=9);
    }
}