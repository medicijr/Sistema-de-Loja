package br.com.loja.model;

/*
Produto (classe mãe)
├── atributos: nome, preco
├── método: exibirDetalhes()

ProdutoFisico (filha de Produto)
├── atributo: peso
├── método: exibirDetalhes() — sobrescreve com peso
└── método: calcularFrete() — retorna preco * 0.1

ProdutoDigital (filha de Produto)
├── atributo: tamanhoMb
├── método: exibirDetalhes() — sobrescreve com tamanhoMb
└── método: gerarLink() — imprime "Link gerado para: " + nome

testa
├── cria 2 ProdutoFisico e 2 ProdutoDigital
├── adiciona numa List<Produto>
├── percorre e chama exibirDetalhes() de cada um
├── se for ProdutoFisico → imprime o frete
└── se for ProdutoDigital → gera o link
 */
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void exibirDetalhes(){
        System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco());
    }

}
