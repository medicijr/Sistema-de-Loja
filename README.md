# 🛒 Sistema de Loja - Java POO

Sistema de loja desenvolvido em Java para praticar os 4 pilares da Orientação a Objetos.

## 📚 Conceitos aplicados

- **Abstração** → classes `Produto`, `ProdutoFisico` e `ProdutoDigital`
- **Encapsulamento** → atributos `private` com getters e setters
- **Herança** → `ProdutoFisico` e `ProdutoDigital` herdando de `Produto`
- **Polimorfismo** → `List<Produto>` com produtos diferentes se comportando do seu jeito
- **instanceof + cast** → identificar e chamar métodos específicos de cada tipo

## 🗂️ Estrutura do projeto

src/
└── br/
└── com/
└── loja/
├── model/
│   ├── Produto.java
│   ├── ProdutoFisico.java
│   └── ProdutoDigital.java
└── Main.java

## ⚙️ Funcionalidades

- Cadastro de produtos físicos com peso e cálculo de frete automático
- Cadastro de produtos digitais com tamanho em MB e geração de link
- Listagem completa com detalhes de cada produto
- Cálculo de frete = 10% do preço do produto
- Geração de link de download automático para produtos digitais
- Identificação automática de unidade de peso (g ou kg)

## 🚀 Como rodar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Rode a classe `Main.java`

## 🛠️ Tecnologias

- Java 21
- IntelliJ IDEA
