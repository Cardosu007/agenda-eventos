import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();

    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atacao);
        eventoMap.put(data, evento);
    }

}
