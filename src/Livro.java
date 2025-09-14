public class Livro {
    //Denifindo atributos da classe livro
    private String titulo;
    private String autor;
    private int ano;
    private int ISBN;
    private int quantidadeDisponivel;

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor() {
        return autor;}

    public int getAno() {
        return ano;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
