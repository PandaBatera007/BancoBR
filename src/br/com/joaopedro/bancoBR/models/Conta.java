package br.com.joaopedro.bancoBR.models;

public class Conta {
     private final int numConta;
     private final int senha;
     private final String nomeUsuario;
     private int saldo;

     public Conta(String nomeUsuario, int numConta, int senha, int saldo){
          this.nomeUsuario = nomeUsuario;
          this.numConta = numConta;
          this.senha = senha;
          this.saldo = saldo;
     }

     public void exibeMenu(){
          System.out.println("Bem-vindo " + getNomeUsuario());
          System.out.println("CONTA: " + getNumConta());
          System.out.println("********************");
          System.out.println("1 - Depositar Saldo");
          System.out.println("2 - Sacar");
          System.out.println("3 - Consultar Saldo");
          System.out.println("4 - Sair");
          System.out.println("********************");

     }
     public int getNumConta() {
          return numConta;
     }

     public String getNomeUsuario() {
          return nomeUsuario;
     }

     public boolean verificaValorDeposito(int valor){
          if(valor > 0){
               depositar(valor);
               return true;
          }else
               return false;
     }

     public boolean verificaValorSaque(int valor){
          if(valor < 0 || valor > getSaldo()){
               return false;
          }else {
               sacar(valor);
               return true;
          }
     }

     void sacar(int valor){
          saldo -= valor;
     }


     void depositar(int saldo){

          this.saldo += saldo;
     }

     public int getSaldo(){
          return saldo;
     }
}
