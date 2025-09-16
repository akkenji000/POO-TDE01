import java.time.LocalDate; //import de data
import java.util.concurrent.LinkedBlockingDeque;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoReal;

    public Emprestimo(Livro livro, Usuario usuario){
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    //Getters/Setters
    public Livro getLivro() {return livro;}
    public Usuario getUsuario(){return usuario;}
    public LocalDate getDataEmprestimo() {return dataEmprestimo;}
    public LocalDate getDataDevolucaoReal() {return dataDevolucaoReal;}


    public String statusEmprestimo(){
        if (getDataDevolucaoReal() != null){
            return ("Finalizado em: " + getDataDevolucaoReal());
        }
        else {
            return ("Não-Finalizado");
        }
    }

    public void finalizarEmprestimo(){
        this.dataDevolucaoReal = LocalDate.now();
    }



    @Override
    public String toString() {
        return "Emprestimo [Livro: " + livro.getTitulo() + ", Usuário: " + usuario.getNome() + ", Data Empréstimo: " + dataEmprestimo + "]";
    }
}
