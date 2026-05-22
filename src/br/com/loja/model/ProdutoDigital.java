package br.com.loja.model;

/*
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
public class ProdutoDigital extends Produto {
    private int tamanhoMb;

    public ProdutoDigital(String nome, double preco, int tamanhoMb) {
        super(nome, preco);
        this.tamanhoMb = tamanhoMb;
    }

    public int getTamanhoMb() {
        return tamanhoMb;
    }

    public void setTamanhoMb(int tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Produto: "+getNome()+ " / Preço R$: "+getPreco()+" / Tamanho MB: "+getTamanhoMb());
    }
    public void gerarLink(){
        System.out.println("Link gerado para: " + getNome() +
                " → https://loja.com/download/" + getNome().toLowerCase().replace(" ", "-"));
    }
}
