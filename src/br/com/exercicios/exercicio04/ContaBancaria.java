package br.com.exercicios.exercicio04;

/**O código no template tem um problema de implementação
 * que permite que qualquer desenvolvedor consiga realizar
 * alterações nos atributos sem seguir a regra de negócio
 * implementada no setter da classe. Faça a correção do
 * código para que todos os acessos aos atributos da classe s
 * ejam feitos, exclusivamente, através dos getters e setters.

 public class ContaBancaria {
 public String agencia;
 public int conta;
 public double saldo;
 public double getSaldo() {
 return this.saldo;
 }
 public String setSaldo(double valor) {
 if(valor >= 0) {
 this.Saldo = valor;
 return "Saldo atualizado";
 }
 else {
 return "Saldo insuficiente";
 }
 }
 }*
 O problema do código original era que os atributos agencia e
 conta estavam declarados como public. Isso significa que
 qualquer desenvolvedor poderia acessar e modificar esses
 atributos diretamente, ignorando a regra de negócio implementada no setter da classe.

 A correção consiste em declarar os atributos como private.
 Isso impedirá que qualquer desenvolvedor acesse ou modifique esses
 atributos diretamente. Os únicos acessos permitidos
 serão através dos getters e setters.*/

public class ContaBancaria {

    private String agencia;
    private int conta;
    private double saldo;

    // Getter para agencia
    public String getAgencia() {
        return agencia;
    }

    // Setter para agencia
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Getter para conta
    public int getConta() {
        return conta;
    }

    // Setter para conta
    public void setConta(int conta) {
        this.conta = conta;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo com validação
    public String setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
            return "Saldo atualizado";
        } else {
            return "Saldo insuficiente";
        }
    }
}