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


        Computador note = new Computador();

        note.modelo = "Macbook Pro";
        note.marca = "Apple";
        note.preco = 15999.99;
        note.memoriaRam = 16;
        note.espacoHD = 512;
        note.placaDeVideoDedicada = false;

        Fabricante apple = new Fabricante();
        apple.nome = "Apple";
        apple.endereco = "Av. Estados, 308";

        note.fabricante = apple;
    }
}
