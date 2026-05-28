package br.com.loja;

import br.com.loja.model.Produto;
import br.com.loja.model.ProdutoDigital;
import br.com.loja.model.ProdutoFisico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoFisico("Teclado", 130, 50));
        produtos.add(new ProdutoFisico("Mouse", 330, 25));
        produtos.add(new ProdutoFisico("Barra olimpica", 4500, 1500));

        produtos.add(new ProdutoDigital("Ebook", 140, 20));
        produtos.add(new ProdutoDigital("Curso", 620, 70));
        produtos.add(new ProdutoDigital("Marketing", 1453, 80));

       produtos.forEach(produto -> {
           produto.exibirDetalhes();
           if (produto instanceof ProdutoFisico){
               System.out.println("Frete: R$ " +
                       String.format("%.2f", ((ProdutoFisico) produto).calcularFrete()));
           }
           if (produto instanceof ProdutoDigital){
               ((ProdutoDigital)produto).gerarLink();
           }
           System.out.println("==========================================================================");
       });
    }
}
