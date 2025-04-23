package edu.diego.controledefluxo;

import java.util.Scanner;

public class contador {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception){
            System.out.println("Parametro um é maior que o parametro dois ");
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else{
            int cont = (parametroDois - parametroUm);
            for(int x = 1; x<=cont;x++ ){
                System.out.println("imprimindo numero..: " + x);
            }

        }

    }
}
