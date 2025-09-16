public class Main {
    public void main(String[] args) {
        //Criação alunos/professores
        Usuario Aluno01 = new Aluno("Ronaldo", "1");
        Usuario Professor01 = new Professor("Lebron", "2");

        //Criar Livros
        Livro livro01 = new Livro("teste01", "autorTeste", 2000, "0000", 300);

        //Criação Emprestimo
        Emprestimo Emprestimo01 = new Emprestimo(livro01, Aluno01);

        //Iniciar Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro(livro01);
        biblioteca.cadastrarUsuario(Aluno01);
        biblioteca.cadastrarUsuario(Professor01);


        //Sout's
        System.out.println("SISTEMA BIBLIOTECA");
        System.out.println("Listagem de usuários");
        biblioteca.listarUsuarios();
        System.out.println("Prazo para Alunos: " + Aluno01.calcularPrazoDevolucao() + " Dias.");
        System.out.println("Prazo para Professores: " + Professor01.calcularPrazoDevolucao() + " Dias.");
        System.out.println("O Usuário ID: " + Aluno01.getId() + ", Nome: " + Aluno01.getNome() + ", Tipo: " + Aluno01.getTipo());
        System.out.println("O Usuário ID: " + Professor01.getId() + ", Nome: " + Professor01.getNome() + ", Cargo: " + Professor01.getTipo());
    }
}
