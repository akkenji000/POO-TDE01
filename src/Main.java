public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("==== INICIANDO SISTEMA DE BIBLIOTECA ====");
        System.out.println("=============================================");

        //SETUP INICIAL Criando a biblioteca e cadastrando os itens
        System.out.println("\n--- Realizando Cadastros Iniciais ---");
        Biblioteca biblioteca = new Biblioteca();

        // Cadastrando Livros
        Livro livro01 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "978-0618640157", 1); // Apenas 2 cópias
        Livro livro02 = new Livro("Código Limpo", "Robert Cecil Martin", 2008, "978-8576082674", 3);
        biblioteca.cadastrarLivro(livro01);
        biblioteca.cadastrarLivro(livro02);
        System.out.println("Livros cadastrados.");

        //Cadastrando Usuários
        Usuario aluno01 = new Aluno("Ronaldo", "1");
        Usuario professor01 = new Professor("Lebron", "4");
        biblioteca.cadastrarUsuario(aluno01);
        biblioteca.cadastrarUsuario(professor01);
        System.out.println("Usuários cadastrados.");

        //Mostrando o estado da biblioteca
        System.out.println("\n--- Relatórios Inicial ---");
        biblioteca.listarTodosOsLivros();
        biblioteca.listarUsuarios();

        //Realizando empréstimos
        System.out.println("\n--- Realizando Empréstimos ---");
        System.out.println("\n>> Aluno 'Ronaldo' pegando 'O Senhor dos Anéis':");
        biblioteca.realizarEmprestimo("O Senhor dos Anéis", "1");

        System.out.println("\n>> Professor 'Lebron' pegando 'Código Limpo':");
        biblioteca.realizarEmprestimo("Código Limpo", "4");

        // Relatório pós-emprestimo
        System.out.println("\n--- Relatórios Após Empréstimos ---");
        biblioteca.listarTodosOsLivros(); // Note que a quantidade disponível diminuiu
        biblioteca.listarEmprestimosAtivos();

        // Tentando emprestar livro indisponível
        System.out.println("\n--- Tentando Empréstimo de Livro Indisponível ---");
        Usuario aluno02 = new Aluno("Fenomeno", "2"); // Cadastrando um novo aluno
        biblioteca.cadastrarUsuario(aluno02);
        System.out.println("\n>> Aluno 'Fenomeno' tentando pegar 'O Senhor dos Anéis' (que já foi emprestado):");
        biblioteca.realizarEmprestimo("O Senhor dos Anéis", "1");
        biblioteca.realizarEmprestimo("O Senhor dos Anéis", "2");

        // Realizando devolução
        System.out.println("\n--- Realizando Devoluções ---");
        System.out.println("\n>> Aluno Ronaldo devolvendo 'O Senhor dos Anéis':");
        biblioteca.realizarDevolucao("O Senhor dos Anéis", "1");

        //Verificando o estado final
        System.out.println("\n--- Relatórios Finais ---");
        biblioteca.listarTodosOsLivros(); // A quantidade deve ter voltado ao normal
        biblioteca.listarEmprestimosAtivos(); // O empréstimo do Ronaldo não deve mais aparecer

        //Relatório de histórico
        System.out.println("\n--- Verificando Históricos de Empréstimos ---");
        biblioteca.historicoEmprestimosUsuario("1"); // Ronaldo 1 empréstimo finalizado
        biblioteca.historicoEmprestimosUsuario("4"); // Lebron  1 empréstimo não-finalizado

        //Prazos devolução
        System.out.println("\n--- Verificando Prazos de Devolução ---");
        System.out.println("Prazo para Alunos: " + aluno01.calcularPrazoDevolucao() + " Dias.");
        System.out.println("Prazo para Professores: " + professor01.calcularPrazoDevolucao() + " Dias.");

        System.out.println("=============================================");
        System.out.println("======= OPERAÇÃO FINALIZADA =======");
        System.out.println("=============================================");
    }
}