package br.com.exercicios.exercicio03;
/**No ambiente de trabalho é bastante comum existir
 * um processo de code review (revisão de código),
 * onde um colega de trabalho revisa o código de
 * outro em busca de problemas, inconformidades
 * ou até mesmo para sugerir otimizações.

 Você foi designado para realizar a revisão do
 código de um colega, porém durante a execução
 dos testes unitários você percebeu que havia algum
 comportamento estranho: os valores passados por parâmetro no construtor não estavam sendo atribuídos corretamente aos atributos do objeto. Faça a análise do código a seguir e aplique a correção adequada para o problema descrito.*/

/**public class ContaBancaria {
    public String agencia = "0";
    public int conta = 0;
    public ContaBancaria(String agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }
}*/

/**
 O problema no código está no fato de que os atributos
 agencia e conta estão sendo inicializados com valores
 padrão na declaração da classe. Isso significa que
 os valores passados por parâmetro no construtor serão ignorados.

 Para corrigir o problema, basta remover os valores padrão
 da declaração dos atributos. O código corrigido ficaria assim:*/

public class ContaBancaria {

    public String agencia;
    public int conta;

    public ContaBancaria(String agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }
}