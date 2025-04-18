package edu.diego.projetofinal;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 25458595;
        String agencia = "112";
        String nomeCompleto = " ";
        Float saldo = 0f;
        boolean condicao = true;

        while (condicao == true)
            
        {
            System.out.println("Digite o número da agência..: ");
            String AgenciaRecuperada = scanner.next();
            if (agencia.equals(AgenciaRecuperada)) {
                System.out.println("Digite seu nome..: ");
                String nome = scanner.next();
                System.out.println("Digite seu Sobrenome..: ");
                String sobrenonome = scanner.next();
                nomeCompleto = nome.concat(" ").concat(sobrenonome);
                System.out.println("Olá " + nomeCompleto + ", sua agência é: " + agencia + ". N° da conta: " + numero
                        + ", e o saldo ..:" + saldo + " reais");
                break;
            } else {
                System.out.println("Não reconhecemos essa agência!! Tente novamente. :D");
                condicao = true;
            }

        }

    }
}
