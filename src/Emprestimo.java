import java.time.LocalDate; //import de data
import java.util.concurrent.LinkedBlockingDeque;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;

    public Emprestimo(Livro livro, Usuario usuario){
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(usuario.calcularPrazoDevolucao());
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public void finalizarEmprestimo(){
        this.dataDevolucaoReal = LocalDate.now();
    }
}
