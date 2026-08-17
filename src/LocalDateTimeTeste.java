import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeTeste {
    static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        ZonedDateTime agoraGlobal = ZonedDateTime.now(ZoneId.of("Greenwich"));
        System.out.println(agoraGlobal);

        System.out.println(agoraGlobal
                .minusHours(3)
                .withZoneSameLocal(ZoneId.of("America/Sao_Paulo")));

        /*for(String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/
    }
}
