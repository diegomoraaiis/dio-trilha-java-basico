package edu.diego.primeirasemana;

public class Operadores {

    public static void main(String[] args) {
        int numero1 = 6;
        int numero2 = 4;
        String nome1 = "diegos";
        String nome2 = "diego";

         int soma = numero1 + numero2;
         int subtracao = numero1 - numero2;
         int multiplicacao = numero1 * numero2;
         int divisao = numero1 / numero2;

        //Imprimindo os resultados
         System.out.println("Soma: " + soma);
         System.out.println("Subtração: " + subtracao);
         System.out.println("Multiplicação: " + multiplicacao);
         System.out.println("Divisão: " + divisao);

         System.out.println("numero -- "+(numero1--));  //continua o mesmo numero depois decrementa (20)
         System.out.println("numero -- "+(numero1));  //decrementou: 19
         System.out.println("numero +: "+ (numero1++));  //continua o mesmo numero depois incrementa (19)
         System.out.println("numero -- "+(numero1));  //incrementou: 20
         System.out.println("numero -- "+(--numero1)); //decrementa direto
         System.out.println("numero ++ "+(++numero1)); //incrementa direto

         //operadores lógicos

         boolean booleano = true;
         System.out.println(booleano);
         System.out.println(!booleano);

         //Operadores ternários (: ?)
         //exemplo

         if (numero1 == numero2) {
         System.out.println("veradeiro");
         } else {
         System.out.println("false");
         }

        // usando operadores ternários para o mesmo processo
        // numero1 =10;  mudando valor para mudar resultado
         String resultado = numero1 == numero2 ? "verdadeiro" : "falso";
         System.out.println(resultado);
         

         //operadores relacionais
         //== compara se é igual
         //!= compara se é direfente
         //> compara se é maior
         //>= compara se é maior ou igual
         //< compara se é menor
         //<= compara se é menor ou igual

        if(numero1 == numero2){
            System.out.println("Iguais");
        } 
        if(numero1 != numero2){
            System.out.println("Diferentes");
        }
        if(numero1 < numero2){
            System.out.println("Menor");
        }
        if(numero1 <= numero2){
            System.out.println("Menor ou igual");
        }
        if(numero1 > numero2){
            System.out.println("Maior");
        }
        if(numero1 >= numero2){
            System.out.println("Maior ou igual");
        }

        //Comparando Strings (Para obetos, sempre usar equals)
        System.out.println(nome1.equals(nome2));


        // Operadores lógicos (&& ||)
        if (nome1.equals(nome2) && numero1 >= 5) {
            System.out.println("Nomes iguais e numero > 5");
        } else{
            System.out.println("Nomes diferentes ou numero <= 5");
        }
        


    }

}
