package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        /*System.out.println("Olá mundo!");*/
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Era da Incerteza", 260);
        System.out.println(livro1);
    }
}
class Livro {
    private String nome;
    private Integer numpags;

    public Livro(String nome, Integer numpags){
        this.nome = nome;
        this.numpags = numpags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpags() {
        return numpags;
    }

    public void setNumpags(Integer numpags) {
        this.numpags = numpags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpags=" + numpags +
                '}';
    }
}
