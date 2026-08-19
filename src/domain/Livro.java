package domain;

public class Livro {
    private String nome;
    private double preco;

    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "domain.Livro{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
