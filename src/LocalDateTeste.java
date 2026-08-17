import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTeste {
    static void main(String[] args) {

        /*LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println("Dia da semana (nome): " + localDate.getDayOfWeek().name());
        System.out.println("Dia da semana (ordinal): " + localDate.getDayOfWeek().ordinal());
        System.out.println("Mês (nome): " + localDate.getMonth().name());
        System.out.println("Mês (ordinal): " + localDate.getMonthValue());
        System.out.println("Ano: " + localDate.getYear());
        System.out.println("Ano bissexto: " + localDate.isLeapYear());
        System.out.println("Número de dias do mês: " + localDate.lengthOfMonth());
        System.out.println("Número de dias do ano: " + localDate.lengthOfYear());


        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);
        System.out.println("Ontem: " + ontem);

        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Amanhã: " + amanha);

        LocalDate mesQueVem = hoje.plusMonths(1);
        System.out.println("Mês que vem: " + mesQueVem);

        LocalDate anoQueVem = hoje.plusYears(1);
        System.out.println("Ano que vem: " + anoQueVem);

        LocalDate ultimoDiaDesteMes = hoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia deste mês: " + ultimoDiaDesteMes);

        LocalDate ultimoDiaDezembro = hoje.withMonth(12).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia de dezembro deste ano: " + ultimoDiaDezembro);

        LocalDate nascimento = LocalDate.of(2006, Month.JULY, 30);
        System.out.println("Data de nascimento: " + nascimento);*/


        // Realizando comparações entre datas.
        /*LocalDate nascimento = LocalDate.of(2008, 2, 26);
        LocalDate hoje = LocalDate.now();

        // Saber se é igual, antes ou depois
        System.out.println("Igual: " + nascimento.isEqual(hoje));
        System.out.println("Antes: " + nascimento.isBefore(hoje));
        System.out.println("Depois: " + nascimento.isAfter(hoje));

        // E o período decorrido?
        Period periodo = Period.between(nascimento, hoje);

        System.out.println(periodo.getYears() + " anos "
        + periodo.getMonths() + " meses "
        + periodo.getDays() + " dias");

        System.out.println("Período em meses: " + periodo.toTotalMonths());*/


        // Formatação data
        System.out.println("Hoje: "
        + LocalDate.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
