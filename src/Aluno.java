public class Aluno extends Usuario{
    private int prazoDevolucao = 15;

    public Aluno(String nome, String id) {
        super(nome, id);
    }

    @Override
   public int calcularPrazoDevolucao(){return prazoDevolucao;}

   @Override
    public String getTipo(){return "Aluno";}
}


