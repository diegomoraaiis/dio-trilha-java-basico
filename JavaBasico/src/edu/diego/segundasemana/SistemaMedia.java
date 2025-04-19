package edu.diego.segundasemana;

import java.util.Scanner;

public class SistemaMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da prova 1..:");
        Float n1 = scanner.nextFloat();
        System.out.println("Digite a nota da prova 2..:");
        Float n2 = scanner.nextFloat();
        System.out.println("Digite a nota da prova 3..:");
        Float n3 = scanner.nextFloat();
        System.out.println("Digite a nota da prova 4..:");
        Float n4 = scanner.nextFloat();


       String mf = media(n1,n2,n3,n4);

        switch (mf) {
            case "A":
                System.out.println("Aprovado");
                break;
            case "D":
                System.out.println("Reprovado : com direito a recuperação");    
        
            case "X":
            System.out.println("Reprovado: sem direito a recuperação");

            case "E":
            System.out.println("Erro: Favor digitar apenas valores de 0-10");
            default:
                break;
        }
    }

    public static String media(float n1, float n2, float n3, float n4){

            Float notaFinal = (n1+n2+n3+n4)/4;
            
            //Exeplo de condição ternária
            //String resultado = notaFinal >=6 ? "Aprovado" : "reprovado"; 
            //System.out.println(resultado);
            
            if (notaFinal <4) {
               return "X";
            }  else if(notaFinal >=4 && notaFinal <6){
                return "D";
            } else if (notaFinal>=6 && notaFinal <=10){
                return "A";
            } else if(notaFinal >10){
                return "E";
            }  else{
                System.out.println( "Erro desconhecido");
                return null;
            }
             
    }
}
