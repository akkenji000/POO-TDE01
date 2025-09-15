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

    public Livro buscarLivroPorISBN (String ISBN){
        for (Livro livro : livros){
            if (livro.getISBN().equals(ISBN)){
                return livro;
            }
        }
        return null;
    }


}
