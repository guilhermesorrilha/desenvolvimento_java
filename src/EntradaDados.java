import java.util.Scanner;

public class EntradaDados {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota da prova semestral: ");
        float ps = entrada.nextFloat();
        System.out.println("Informe a nota do TCC: ");
        float tcc= entrada.nextFloat();
        System.out.println("Informe a nota da prova intermediária 1: ");
        float av1= entrada.nextFloat();
        System.out.println("Informe a nota da prova intermediária 2: ");
        float av2= entrada.nextFloat();

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2) / 2) * 0.2;
        System.out.println("A média final é: " + mediaFinal);
    }
}
