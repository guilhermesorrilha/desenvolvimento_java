package poo;

public class App {
    static void main(String[] args) {

        Fabricante dell = new Fabricante();
        dell.nome = "Dell Computadores";
        dell.endereco = "Av. Paulista, 1000";

        Computador pc = new Computador("G5", "Dell", 5200.50, 8, 256, true, dell);

        System.out.println(pc);

        double valorComDesconto = pc.calcularDesconto(0.1);
        System.out.println("Valor com desconto: " + valorComDesconto);

        boolean sucesso = pc.adicionarMemoriaRam(8);

        if (sucesso) {
            System.out.println("Memoria Ram adicionada!");
            System.out.println("Nova quantidade: " + pc.memoriaRam);
            System.out.println("Novo valor do computador: " + pc.preco);
        } else {
            System.out.println("Não foi possível adicionar memória");
        }
    }
}
