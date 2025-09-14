public abstract class Usuario {
    //Definir Atributos
    private String nome;
    private int id;
    //private String tipoUsuario;

    //Contructor para inicializar Usuário
    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
        //this.tipoUsuario = tipoUsuario;
    }


    //get para Nome, ID, Tipo Usuário
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    //Método abstrato para Polimorfismo
    public abstract int calcularPrazoDevolucao();
}
