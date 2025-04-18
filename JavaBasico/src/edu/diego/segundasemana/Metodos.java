package edu.diego.segundasemana;

public class Metodos {

    public static void main(String[] args) {

        soma();
        soma2(1, 4);
        System.out.println(soma3(4, 4));

    }

    // metodo simples, sem retorno e sem parâmetro
    public static void soma() {
        System.out.println("Printa apenas dentro do metodo, sme retorno");
        System.out.println("1 + 1 = " + (1 + 1));
    }

    // metodo simples com parâmetro
    public static void soma2(int n1, int n2) {
        System.out.println("Numero 1 + numero 2 = " + (n1 + n2));
    }

    // metodo com parâmetro e retorno
    public static String soma3(int n1, int n2) {
        return "Soma entre os números..:" + (n1 + n2);
    }

}
