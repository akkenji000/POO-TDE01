public class Main {
    public static void main(String [] args) {
        //Criação de usuarios alunos e professores
        Usuario Aluno01 = new Usuario("Ronaldo", 1);
        Usuario Professor01 = new Usuario("Lebron", 2);


        System.out.println("O Usuário ID: " + Aluno01.getId() + ", Nome: " + Aluno01.getNome() + ", Cargo: ");
        System.out.println("O Usuário ID: " + Professor01.getId() + ", Nome: " + Professor01.getNome() + ", Cargo: ");
    }
}
