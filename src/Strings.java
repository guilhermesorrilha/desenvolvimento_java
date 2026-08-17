public class Strings {
    static void main(String[] args) {
        String escola1 = "Fiap";

        String escola2 = new String("Fiap");

        // Compara endereço na memória, por isso o resultado é "false"
        /* boolean isEqual = (escola1 == escola2);
        System.out.println("Igual: " + isEqual); */

        // Compara valores
        boolean isEqual = (escola1.equals(escola2));
        System.out.println("Igual: " + isEqual);

        // Blocos de textos
        String poema = """
                Tomara
                
                Que a tristeza te convença
                Que a saudade não compensa
                E que a ausência não dá paz
                E o verdadeiro amor de quem se ama
                Tece a mesma antiga trama
                Que não se desfaz
                
                E a coisa mais divina
                Que há no mundo
                É viver cada segundo
                Como nunca mais...
                """;
    }
}