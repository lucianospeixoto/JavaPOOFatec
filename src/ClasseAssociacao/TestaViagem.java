package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaViagem {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("447150900805", "Luciano");
        LocalDateTime data = LocalDateTime.of(2026,7,15,13,10);
        Voo v1 = new Voo(1, "Campinas", "Paris", data);

        Reserva reserva1 = new Reserva(111, 12, LocalDateTime.now(), p1, v1);
        System.out.println(reserva1.toString());

    }
}
