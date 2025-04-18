package edu.diego.primeirasemana;

public class TipoDeVariaveis {

  public static void main(String[] args) {
    // tipos primitivos
    byte idade = 123;
    short ano = 2021;
    int cep = 21070333;
    long cpf = 11154487596L;
    double salario = 300.2;
    final float pi = 3.14F;
    System.out.println("idade: " + idade + "ano: " + ano + "cep: " + cep + "cpf: " + cpf + "salario: " + salario);
    System.out.println("O valor de pi é: " + pi);
    // variaveis
    int numero = 5;
    numero = 10;
    System.out.print("Numero..:" + numero);

    // constantes
    // pi = 10;
    // o valor acima foi comentado pois não pode mudar valor de constante.

  }
}