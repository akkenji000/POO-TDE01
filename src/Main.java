public class Main {
    public static void main(String [] args) {


        //Criação de usuarios alunos e professores
        Usuario Aluno01 = new Aluno("Ronaldo", "1");
        Usuario Professor01 = new Professor("Lebron", "2");

        //Criação Livros
        Livro livro01 = new Livro("teste01", "autorTeste", 2000, "0000", 300);

        //Instanciar Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro(livro01);
        biblioteca.cadastrarUsuario(Aluno01);
        biblioteca.cadastrarUsuario(Professor01);


        System.out.println("O Usuário ID: " + Aluno01.getId() + ", Nome: " + Aluno01.getNome() + ", Tipo: " + Aluno01.getTipo());
        System.out.println("O Usuário ID: " + Professor01.getId() + ", Nome: " + Professor01.getNome() + ", Cargo: " + Professor01.getTipo());
    }
}
