public class Livro {
    //Denifindo atributos da classe livro
    private String titulo;
    private String autor;
    private int ano;
    private String ISBN;
    private int quantidadeDisponivel;

    //Constructor Livro
    public Livro(String titulo, String autor, int ano, String ISBN, int quantidadeDisponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    //Getters
    public String getTitulo(){return titulo;}
    public String getAutor() {return autor;}
    public int getAno() {return ano;}
    public String getISBN() {return ISBN;}
    public int getQuantidadeDisponivel(){return quantidadeDisponivel;}

    //Emprestar
    public void emprestar(){
        if (quantidadeDisponivel > 0){
            quantidadeDisponivel--;
        }
    }
    //Devolver
    public void devolver(){
        quantidadeDisponivel++;
    }
}
