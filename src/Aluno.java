public class Aluno extends Usuario{
    private int prazoDevolucao = 15;

    public Aluno(String nome, int id) {
        super(nome, id);
    }

   @Override
   public int calcularPrazoDevolucao(){
        return prazoDevolucao;
   }
}


