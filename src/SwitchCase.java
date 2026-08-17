import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha:" + System.lineSeparator()
        + "1- Pesquisar usuário" + System.lineSeparator()
        + "2- Cadastrar usuário" + System.lineSeparator()
        + "3- Abrir pedido" + System.lineSeparator()
        + "4- Fechar pedido");

        int opcao = entrada.nextInt();

        switch(opcao) {
            case 1:
                System.out.println(opcao + " - Pesquisar usuário");
                break;
            case 2:
                System.out.println(opcao + " - Cadastrar usuário");
                break;
            case 3:
                System.out.println(opcao + " - Abrir pedido");
                break;
            case 4:
                System.out.println(opcao + " - Fechar pedido");
                break;
            default:
                System.out.println(opcao + " - Opção inválida");
        }
    }
}
