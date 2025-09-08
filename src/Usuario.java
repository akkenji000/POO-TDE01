public class Usuario {
    //Definir Atributos
    String nome;
    int id;
    boolean aluno;

    //Contructor para "molde" de Úsuario
    public Usuario(String nome, int id, boolean aluno){
        this.nome = nome;
        this.id = id;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public boolean usuarioAluno(){
        return aluno = true;
    }
}
