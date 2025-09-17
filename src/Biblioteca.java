import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca (){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    //Métodos de cadastro
    public void cadastrarLivro (Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario (Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorID(String id){
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(">>ID: " + usuario.getId() + ", Nome: " +  usuario.getNome() + ", Tipo: " + usuario.getTipo());
        }
    }

    public void listarEmprestimos(){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println(">>UserID: " + emprestimo.getUsuario().getId() +
                    "; >>Livro: " + emprestimo.getLivro().getTitulo() + "; >>Tipo: " + emprestimo.getUsuario().getTipo() + "; >>Dt Emprestimo: " + emprestimo.getDataEmprestimo()  + "; >>Status: " + emprestimo.statusEmprestimo());
        }
    }

    public Livro buscarLivroPorTitulo (String titulo){
        for (Livro livro : livros){
            if (livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;


    }

    // Funcionalidades principais
    public void realizarEmprestimo(String titulo, String id) {
        Livro livro = buscarLivroPorTitulo(titulo);
        Usuario usuario = buscarUsuarioPorID(id);

        if (livro != null && usuario != null && livro.getQuantidadeDisponivel() > 0) {
            livro.emprestar();
            Emprestimo novoEmprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(novoEmprestimo);
            System.out.println("Empréstimo realizado com sucesso!");
            System.out.println("\n Unidades restantes: " + livro.getQuantidadeDisponivel());
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
            System.out.println("\n Revise as informações e tente novamente!");
        }
    }

    public void realizarDevolucao(String titulo, String id) {
        Emprestimo emprestimoParaFinalizar = null;
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(titulo) &&
                    emprestimo.getUsuario().getId().equals(id) &&
                    emprestimo.getDataDevolucaoReal() == null) {
                emprestimoParaFinalizar = emprestimo;
                break; // Encontrou o empréstimo, pode parar o loop
            }
        }

        if (emprestimoParaFinalizar != null) {
            emprestimoParaFinalizar.setDataDevolucaoReal(); //Atualiza a data de devolução no empréstimo
            emprestimoParaFinalizar.getLivro().devolver();  //Aumenta a quantidade disponível do livro
            System.out.println("Devolução do livro '" + titulo + "' realizada com sucesso!");
        } else {
            System.out.println("Não foi possível encontrar um empréstimo ativo para este livro e usuário.");
        }
    }
    // Listagens diferentes
    public void listarTodosOsLivros() {
        System.out.println("\n--- Catálogo de Livros ---");
        for (Livro livro : livros) {
            System.out.println(">> Título: " + livro.getTitulo() + "; Autor: " + livro.getAutor() + "; Disponíveis: " + livro.getQuantidadeDisponivel());
        }
    }

    public void listarEmprestimosAtivos() {
        System.out.println("\n--- Relatório de Empréstimos Ativos ---");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataDevolucaoReal() == null) { // A condição chave é esta!
                System.out.println(">> Usuário: " + emprestimo.getUsuario().getNome() + "; Livro: " + emprestimo.getLivro().getTitulo() + "; Data: " + emprestimo.getDataEmprestimo());
            }
        }
    }

    public void historicoEmprestimosUsuario(String id) {
        Usuario usuario = buscarUsuarioPorID(id);
        if (usuario == null) {
            System.out.println("Usuário com ID " + id + " não encontrado.");
            return;
        }

        System.out.println("\n--- Histórico de Empréstimos para: " + usuario.getNome() + " ---");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuario().getId().equals(id)) {
                System.out.println(">> Livro: " + emprestimo.getLivro().getTitulo() + "; Status: " + emprestimo.statusEmprestimo());
            }
        }
    }
}
