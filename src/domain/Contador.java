package domain;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        System.out.println("-------------------Desafio Controle de fluxo---------------------");
        System.out.println("A seguir você deverá informar dois valores.");

        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Informe o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; ++i) {
                System.out.println("Imprimindo a " + i + "ª interação: " + i);
            }
        }
    }
}