import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class InstanteDuracao {
    static void main(String[] args) throws InterruptedException {
        /*Instant inicio = Instant.now();
        Thread.sleep(6000);
        Instant fim = Instant.now();

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração em nanossegundos: " + duracao.toNanos());
        System.out.println("Duração em milissegundos: " + duracao.toMillis());
        System.out.println("Duração em segundos: " + duracao.toSeconds());
        System.out.println("Duração em minutos: " + duracao.toMinutes());
        System.out.println("Duração em horas: " + duracao.toHours());
        System.out.println("Duração em dias: " + duracao.toDays());*/


        LocalDateTime inicio = LocalDateTime.of(LocalDate.of(2026, 7, 21), LocalTime.of(23, 18, 47));
        LocalDateTime fim = LocalDateTime.of(LocalDate.of(2026, 7, 22), LocalTime.of(00, 34, 12));

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Horas estudadas: " + duracao.toHoursPart());
        System.out.println("Minutos estudados: " + duracao.toMinutesPart());

        String tempoTotal = String.format("%02d:%02d", duracao.toHoursPart(), duracao.toMinutesPart());

        System.out.println(tempoTotal);
    }
}
