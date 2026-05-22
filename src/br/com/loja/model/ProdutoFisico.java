package br.com.loja.model;
/*
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
public class ProdutoFisico extends Produto{
    private double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public void exibirDetalhes(){
        if (getPeso() >= 1000){
            System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco()+" / Peso: "+getPeso()+"kg");
        }else {
            System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco()+" / Peso: "+getPeso()+"g");
        }

    }
    public double calcularFrete(){
        return getPreco() * 0.1;

    }
}
