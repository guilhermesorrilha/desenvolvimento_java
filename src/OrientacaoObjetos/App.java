package OrientacaoObjetos;

public class App {
    static void main(String[] args) {
        Computador pc = new Computador();

        pc.modelo = "G5";
        pc.marca = "Dell";
        pc.preco = 5200.50;
        pc.memoriaRam = 8;
        pc.espacoHD = 256;
        pc.placaDeVideoDedicada = true;

        Fabricante dell = new Fabricante();
        dell.nome = "Dell Computadores";
        dell.endereco = "Av. Paulista, 1000";

        pc.fabricante = dell;

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
