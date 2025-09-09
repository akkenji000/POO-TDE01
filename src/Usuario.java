public class Usuario {
    //Definir Atributos
    private String nome;
    private int id;
    private String tipoUsuario;

    //Contructor para "molde" de Úsuario
    public Usuario(String nome, int id, String tipoUsuario){
        this.nome = nome;
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    //get para Nome, ID, Tipo Usuário
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
