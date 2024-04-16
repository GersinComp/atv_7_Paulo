import java.util.ArrayList;

public class Voo {
    private final Data data;
    private final Hora horario;
    private final Integer numVoo;
    private final ArrayList<String> lugares;
    private final Integer maxLugares;

    public Voo(Data data, Hora horario, Integer numVoo) {
        this.data = data;
        this.horario = horario;
        this.numVoo = numVoo;
        this.maxLugares = 100;
        this.lugares = new ArrayList<>(maxLugares);
        for (int i = 0; i < maxLugares; i++) {
            lugares.add("livre");
        }
    }

    String ocupar(Integer lugar) {
        for (int i = (lugar - 1); i < maxLugares; i++) {
            if ((i == (lugar - 1)) && lugares.get(i).equals("livre")) {
                lugares.set(lugar - 1, "ocupado");
                System.out.println("reserva no lugar " + lugar + " concluída!");
                break;
            }
            else
                System.out.println("Infelizmente o lugar selecionado já está ocupado, tente outro lugar!");
        }
        return null;
    }

    String verificarLugar(Integer lugar) {
            if (lugares.get(lugar - 1).equals("livre")) {
                System.out.println("O lugar " + lugar + " está disponível!");
            }
            else
                System.out.println("Infelizmente, o lugar selecionado já está ocupado!");
        return null;
    }

    public int proximoLivre() {
        for (int i = 0; i < maxLugares; i++) {
            if (lugares.get(i).equals("livre")) {
                return i + 1;
            }
        }
        return 0;
    }

    public Data getData() {
        return data;
    }

    public Hora getHorario() {
        return horario;
    }

    public Integer getNumVoo() {
        return numVoo;
    }

    public Integer getMaxLugares() {
        return maxLugares;
    }
}
