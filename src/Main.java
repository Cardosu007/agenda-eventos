import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 20), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 25), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.NOVEMBER, 30), "Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }


}