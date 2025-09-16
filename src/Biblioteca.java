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

    public String listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + ", Nome: " +  usuario.getNome() + ", Tipo: " + usuario.getTipo());
        } return null;
    }

    public void listarEmprestimos(){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println("UserID: " + emprestimo.getUsuario() +
                    ", Livro: " + emprestimo.getLivro() + ",Dt Emprestimo: " + emprestimo.getDataEmprestimo()  + "Status: " + emprestimo.statusEmprestimo());
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
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }
}
