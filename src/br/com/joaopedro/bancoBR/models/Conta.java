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

     public boolean verificaValorDeposito(int valor, int verificaSenha){
          if(valor > 0 && validarSenha(verificaSenha)){
               System.out.println("Valor Depositado com Sucesso!");
               depositar(valor);
               return true;
          }else if(valor < 0){
               System.out.println("Valor Ínvalido");
          }else
               System.out.println("Senha Incorreta");

          return false;
     }

     public boolean verificaValorSaque(int valor, int verificaSenha){
          if(valor <= 0 || valor > getSaldo()){
               System.out.println("Saldo Insuficiente ou Valor Inválido");
               return false;
          }else if(validarSenha(verificaSenha)){
               System.out.println("Valor Sacado com Sucesso!");
               sacar(valor);
               return true;
          }else{
               System.out.println("Senha Incorreta");
               return false;
          }

     }

      private boolean validarSenha(int senha){
          if(this.senha == senha){
               return true;
          }
          else
               return false;
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
