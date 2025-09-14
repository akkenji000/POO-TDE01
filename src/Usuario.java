public abstract class Usuario {
    //Definir Atributos
    private String nome;
    private String id;
    //private String tipoUsuario;

    //Contructor para inicializar Usuário
    public Usuario(String nome, String id){
        this.nome = nome;
        this.id = id;
        //this.tipoUsuario = tipoUsuario;
    }


    //get para Nome, ID, Tipo Usuário
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    //Método abstrato para Polimorfismo
    public abstract int calcularPrazoDevolucao();
}
