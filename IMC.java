

import java.util.Scanner;
import java.lang.Math;

public class IMC {
    static double imc(double altura, double peso) {
        return peso / Math.pow(altura, 2);
    }



    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = lerTeclado.nextLine();
        
        System.out.print("Qual a sua altura em metros: ");
        double altura = lerTeclado.nextDouble();

        System.out.print("Qual a seu peso em kilos: ");
        double peso = lerTeclado.nextDouble();

        System.out.println("qual o seu genero");
        char genero = lerTeclado.next().charAt(0);

        double respostaIMC = imc(altura,peso);

        switch (genero) {
            case 'M':
            case 'm':
                if(respostaIMC < 20){
                    System.out.println("Abaixo do normal");
                }
                else if (respostaIMC >= 20 && respostaIMC< 25) {
                    System.out.println("Normal");
                }
                else if (respostaIMC >= 25 && respostaIMC< 30) {
                    System.out.println("Obesidade leve");                    
                }
                else if (respostaIMC >= 30 && respostaIMC< 40) {
                    System.out.println("Obesidade");
                }
                else if (respostaIMC >= 40){
                    System.out.println("Obesidade morbida");
                }

                
                break;
            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if(respostaIMC < 19){
                    System.out.println("Abaixo do normal");
                }
                else if (respostaIMC >= 19 && respostaIMC< 24) {
                    System.out.println("Normal");
                }
                else if (respostaIMC >= 24 && respostaIMC< 29) {
                    System.out.println("Obesidade leve");                    
                }
                else if (respostaIMC >= 29 && respostaIMC< 39) {
                    System.out.println("Obesidade");
                }
                else if (respostaIMC >= 39){
                    System.out.println("Obesidade morbida");
                }

                
                break;
            default:
            System.out.println("Responda adequdamente");
                break;
        
        





    }
    System.out.println(nome+ "Seu IMC é: "+ respostaIMC);
}

}