package br.com.exercicios.exercicio02;

/**Ao longo de 2020 e 2021, diversas competições esportivas foram postergadas
 devido à pandemia. Com o passar do tempo, muitos organizadores tiveram que
 readequar seus cadastros de atletas para conseguir dimensionar corretamente
 a estrutura necessária para realização do evento no ano de 2022 e com isso
 alguns problemas surgiram. Para evitar erros, decidiram construir um sistema
 que auxilie nessa tarefa de controle de informações e você foi escolhido para
 realizar o levantamento de classes para este sistema.
 Uma das classes necessárias será a "Atleta". Esta classe terá todas as informações
 sobre o atleta que pretende competir determinada prova. Alguns dados podem e
 devem ser abertos ao acesso geral dentro do código, pois são informações
 abertas e que podem ser utilizadas para criação de campanhas de marketing,
 porém outras deverão ser restritas somente à classes derivadas do Atleta e
 também teremos informações confidenciais que deverão ser informadas apenas
 durante o cadastro e não poderão ser alteradas ou acessadas em nenhum outra
 parte do código.

 Abaixo você encontrará o nome, tipo e descritivo de acesso do atributo:

 nome (String): aberto para utilização geral em qualquer parte do código.
 dataNascimento (String): restrito apenas para classes que sejam derivadas
 do Atleta, pois existem pessoas que não se sentem confortáveis em compartilhar
 essa informação.
 cpf (String): informação restrita e que não pode ser acessada ou alterada
 em nenhum outro lugar, exceto a própria classe Atleta.
 melhorTempo (String): informação restrita apenas para classes derivadas do Atleta.
 quantidadeParticipacoes (int): informação aberta para acesso e atualização de qualquer lugar do código.
 Observações:Não é necessário criar um construtor para a classe Atleta. Caso seja criada,
 é obrigatória a existência de um construtor sem nenhum parâmetro.
 Considerando a descrição da classe e seus atributos necessários,
 construa uma entidade que atenda os requisitos de atributos e seus
 respectivos modificadores de acesso.*/


public class Atleta {
    // Atributo aberto para utilização geral
    public String nome;

    // Atributo restrito apenas para classes derivadas do Atleta
    protected String dataNascimento;

    // Atributo restrito que não pode ser acessado ou alterado em nenhum outro lugar, exceto na própria classe Atleta
    private String cpf;

    // Atributo restrito apenas para classes derivadas do Atleta
    protected String melhorTempo;

    // Atributo aberto para acesso e atualização de qualquer lugar do código
    public int quantidadeParticipacoes;

    // Construtor sem parâmetro (obrigatório)
    public Atleta() {
        // Pode ser vazio ou conter lógica necessária
    }
}
