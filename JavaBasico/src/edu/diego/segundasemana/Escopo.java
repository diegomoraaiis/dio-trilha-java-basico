package edu.diego.segundasemana;
/*
 * @autor Diego Morais
 * @version 1.0
 * @since 2025
 */

public class Escopo {
    public static void main(String[] args) {
    //variável de classe:
    String teste = "testando variável de classe"; // assessivel em todos os metodos, segue o exemplo no metodo testar
        testando();
        System.out.println(teste);
    }   



    public static void testando(){
        String teste = "testando";
        System.out.println(teste);
    }


}
