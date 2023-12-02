package br.com.exercicios.exercicio01;
/**Em seu ambiente de trabalho alguns colegas deixaram
 * de seguir algumas boas práticas para o controle de
 * visibilidade de atributos importantes e que não
 * deveriam ser alterados em outras partes do código.
 * Após algumas entregas, problemas começaram a surgir
 * na funcionalidade de atualização do saldo e alguns
 * clientes começaram a ficar com saldo negativo sem
 * possuir cheque especial. Quem fez as últimas alterações
 * no código esqueceu de colocar uma validação na alteração
 * do atributo Saldo.

 Faça as alterações na classe ContaBancaria de
 forma que nenhum desenvolvedor consiga realizar
 visualizar ou alterar o Saldo sem utilizar um método
 de getSaldo ou setSaldo. O método getSaldo será
 utilizado para consultar o valor do saldo, enquanto
 o setSaldo deverá realizar a atualização do valor
 do tipo double passado via parâmetro, garantindo
 que a conta não ficará negativa. Caso a atualização
 de saldo seja para um valor negativo, devolver a mensagem
 "Saldo insuficiente". Demais casos retornar "Saldo atualizado".

 public class ContaBancaria {
 public String agencia;
 public int conta;
 public double saldo;
 }*/

public class ContaBancaria {
    private String agencia;
    private int conta;
    private double saldo;

    // Construtor da classe
    public ContaBancaria(String agencia, int conta, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para atualizar o saldo com validação
    public String setSaldo(double novoSaldo) {
        if (novoSaldo < 0) {
            return "Saldo insuficiente";
        } else {
            saldo = novoSaldo;
            return "Saldo atualizado";
        }
    }



    // Exemplo de utilização
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("001", 123456, 1000.0);

        // Consultar saldo
        System.out.println("Saldo atual: " + conta.getSaldo());

        // Atualizar saldo (com validação)
        String resultadoAtualizacao = conta.setSaldo(1500.0);
        System.out.println(resultadoAtualizacao);

        // Tentar atualizar saldo para um valor negativo
        resultadoAtualizacao = conta.setSaldo(-500.0);
        System.out.println(resultadoAtualizacao);
    }
}
