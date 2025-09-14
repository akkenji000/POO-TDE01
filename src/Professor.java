public class Professor extends Usuario{
    private int prazoDevolucao = 30;
    public Professor(String nome, String id) {
        super(nome, id);
    }
    @Override
    public int calcularPrazoDevolucao(){
        return prazoDevolucao;
    }
}
