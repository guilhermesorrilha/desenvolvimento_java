public class Intro {
    public static void main(String[] args) {

        // Tipos de dados
        byte idade = 22, quantidadeDeDependentes = 1;
        short anoDeNascimento = 2000;
        long quantidade = 15000;
        float altura = 1.78f, largura = .65f;
        double preco = 19.99;

        // Escopo de variáveis
        String frase;

        {
            frase = "Aprendi o conceito sobre escopos de variáveis em Java: ";
            {
                String fraseInterna = "Os blocos mais internos conseguem enxergar as variáveis declaradas no mesmo bloco ou nos blocos mais externos";
                frase = frase + fraseInterna;
                {
                    fraseInterna = ", portanto não podemos declarar outra variável com o mesmo nome no mesmo bloco ou nos blocos mais internos. ";
                    frase = frase + fraseInterna;
                }
            }
            String fraseInterna = "Entretanto podemos declarar variáveis com o mesmo nome em outros blocos ou em blocos mais externos. ";
            frase = frase + fraseInterna + "Agora já posso trabalhar conhecendo melhor o escopo das variáveis em Java.";
        }
        System.out.println(frase);

        // Inferência automática do tipo
        var maior = true;
        var salario = 15990.99f;
        /* Ainda assim não se pode atribuir um valor de tipo diferente ao que o interpretador atribuiu para variável inicialmente de forma automática, por exemplo:
        maior = 12;*/

        // Operadores aritméticos
        System.out.println("5/2 = " + 5f/2f); // Nesse caso é necessário colocar o f ou um ponto flutuante após o número, para que ele consiga retornar um número também de ponto flutuante, se não ele retorna um inteiro

        // Maneira mais enxuta de encrementar ou decrementar 1 a uma variável
        idade++;
    }
}