package edu.diego.primeirasemana;

public class BoletimEstudantil {
    
    public static void main (String [] args){
        float n1 = 5, n2 = 0, n3 = 6, n4 = 4;
        System.out.println(aprovacaoFinal(n1,n2,n3,n4));
    }

    public static String aprovacaoFinal(float n1, float n2, float n3, float n4){
        float notaFinal = (n1+n2+n3+n4)/4;

        if (notaFinal<6 && notaFinal>=4){
            return "Reprovado com direito a recuperação..:"+notaFinal;
        } else if(notaFinal <4){
            return "reprovado..:"+notaFinal;
        } else if(notaFinal >= 6) {
            return "Aprovado..:"+notaFinal;
        }
        return null;
    }


}
