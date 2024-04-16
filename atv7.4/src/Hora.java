public class Hora {
    private String hora;
    private String minuto;
    private String segundo;

    public Hora(String horaDigitada) {
        String[] horaSeparada = horaDigitada.split(":");

        this.hora = horaSeparada[0];
        this.minuto = horaSeparada[1];
        this.segundo = horaSeparada[2];
    }

    public String getHoraFormatada() {
        return hora + "/" + minuto + "/" + segundo;
    }
}
