public class Professor extends Usuario{
    private int prazoDevolucao = 30;
    public Professor(String nome, int id) {
        super(nome, id);
    }
    @Override
    public int calcularPrazoDevolucao(){
        return prazoDevolucao;
    }
}
