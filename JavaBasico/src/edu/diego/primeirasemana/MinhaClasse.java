package edu.diego.primeirasemana;

public class MinhaClasse {
    
    public static void main (String [] args){
        
        String primeiroNome = "Diego";
        String segundoNome = "Morais";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome ){
        return "Resultado..: "+primeiroNome.concat(" ").concat(segundoNome);
    }

}
