package br.com.joaopedro.bancoBR.models;

import java.util.Scanner;

public class Interface {

    public void menuInicial() {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;


        System.out.println("*********************");
        System.out.println("Bem Vindo ao Banco BR");
        System.out.println("*********************");
        System.out.println("Cadastre sua Conta");
        System.out.print("Digite o Nome do Usuário: ");
        String nomeUsuario = leitura.nextLine();
        System.out.print("Número da Conta: ");
        int numConta = leitura.nextInt();
        System.out.print("Senha da Conta: ");
        int senha = leitura.nextInt();
        System.out.println("Deposito inicial: ");
        int saldo = leitura.nextInt();
        Conta novaConta = new Conta(nomeUsuario, numConta, senha, saldo);


        while (opcao != 4) {

            novaConta.exibeMenu();

            System.out.print("digite a opção desejada: ");
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Valor de Depósito: ");
                    int valor = leitura.nextInt();
                    System.out.print("DIGITE A SENHA: ");
                    int senhaDeposito = leitura.nextInt();
                    novaConta.verificaValorDeposito(valor, senhaDeposito);
                    break;
                }
                case 2: {
                    System.out.print("Valor de Saque: ");
                    int valor = leitura.nextInt();
                    System.out.print("DIGITE A SENHA: ");
                    int senhaSaque = leitura.nextInt();
                    novaConta.verificaValorSaque(valor, senhaSaque);
                    break;
                }
                case 3: {
                    System.out.println("Saldo Atual: " + novaConta.getSaldo());
                    break;
                }
                case 4:
                    break;

                default: {
                    System.out.println("Opção Inválida!");
                }
            }
        }
        leitura.close();
    }
}

