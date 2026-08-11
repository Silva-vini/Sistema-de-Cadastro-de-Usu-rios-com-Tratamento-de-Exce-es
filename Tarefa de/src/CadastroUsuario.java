import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja muito bem vindo, por favor me informe seu nome.");
        String nome = scanner.next();
        System.out.println("Que maravilha ter você aqui " + nome + ", me falei sua idade para finalizarmos seu cadastro.");

        int idade = scanner.nextInt();

        try {
            cadastrarUsuario(nome, idade);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Processo de cadastro finalizado.");
        }


    }

    public static void cadastrarUsuario(String nome, int idade)throws IdadeInvalidaException{
        if( idade < 18){
            throw new IdadeInvalidaException("Usuário precisa ter mais que 18 anos de idade para se cadastrar.");
        }
        System.out.println("Usuário " + nome + ", foi cadastrado com sucesso.");

    }
}
