public class Main {
    public static void main(String[] args) {
        //Criação alunos/professores
        Usuario aluno01 = new Aluno("Ronaldo", "1");
        Usuario aluno02 = new Aluno("Fenomeno", "2");
        Usuario aluno03 = new Aluno("Heisenberg", "3");
        Usuario professor01 = new Professor("Lebron", "4");
        Usuario professor02 = new Professor("James", "5");
        Usuario professor03 = new Professor("JordanNum1", "6");

        //Criar Livros
        Livro livro01 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1937, "0000", 10);
        Livro livro02 = new Livro("Código Limpo", "Robert Cecil Martin", 2008, "0001", 10);
        Livro livro03 = new Livro("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979, "0003", 10);

        //Iniciar Biblioteca/Cadastro usuarios e livros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro(livro01);//Livros
        biblioteca.cadastrarLivro(livro02);
        biblioteca.cadastrarLivro(livro03);
        biblioteca.cadastrarUsuario(aluno01);//Usuários
        biblioteca.cadastrarUsuario(aluno02);
        biblioteca.cadastrarUsuario(aluno03);
        biblioteca.cadastrarUsuario(professor01);
        biblioteca.cadastrarUsuario(professor02);
        biblioteca.cadastrarUsuario(professor03);



        //Sout's
        System.out.println("---------SISTEMA BIBLIOTECA---------\n");
        System.out.println("Listagem de usuários cadastrados: ");
        biblioteca.listarUsuarios(); //Listar users

        System.out.println("Realizando empréstimo...\n");
        biblioteca.realizarEmprestimo("O Senhor dos Anéis", "1"); //Emprestimos
        biblioteca.realizarEmprestimo("O Senhor dos Anéis", "2");
        biblioteca.realizarEmprestimo("O Senhor dos Anéis", "3");
        biblioteca.listarEmprestimos();

        biblioteca.realizarDevolucao("O Senhor dos Anéis", "1"); //Devolução
        biblioteca.listarEmprestimos();


        System.out.println("Prazo para Alunos: " + aluno01.calcularPrazoDevolucao() + " Dias.");
        System.out.println("Prazo para Professores: " + professor01.calcularPrazoDevolucao() + " Dias.");

    }
}
