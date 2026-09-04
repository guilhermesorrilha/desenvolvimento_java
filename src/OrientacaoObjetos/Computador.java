package OrientacaoObjetos;

public class Computador {

    String modelo;
    String marca;
    double preco;
    int memoriaRam;
    int espacoHD;
    boolean placaDeVideoDedicada;

    Fabricante fabricante;

    // Atributo estático e final - constante compartilhada por todas as instâncias:
    // existe uma única cópia na classe e não pode ser reatribuída
    static final double PRECO_POR_GB_RAM = 150;

    public double calcularDesconto(double desconto) {
        return preco * desconto;
    }

    boolean adicionarMemoriaRam(int quantidade) {
        if (!quantidadeRamValida(quantidade)) return false;
        memoriaRam += quantidade;
        preco += quantidade * PRECO_POR_GB_RAM;
        return true;
    }

    // Método estático - pertence à classe, não ao objeto.
    // Só acessa membros estáticos (não enxerga atributos de instância nem o this),
    // por isso é chamado pelo nome da classe: Computador.quantidadeRamValida(8)
    static boolean quantidadeRamValida(int quantidade) {
        return quantidade % 2 == 0;
    }
}
