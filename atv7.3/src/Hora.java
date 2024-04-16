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

    // Essa função compara as duas horas digitadas, a comparação é feita de forma hora1 compara com hora2
    public Integer compararHora(String hora1, String hora2){
        if (hora1.equals(hora2))
            return 0;
        else {
            // Pegando separadamente as horas, minutos e segundos das horas digitadas:
            String[] data1Separada = hora1.split(":");
            int horas1 = Integer.parseInt(data1Separada[0]);
            int minutos1 = Integer.parseInt(data1Separada[1]);
            int segundos1 = Integer.parseInt(data1Separada[2]);

            String[] data2Separada = hora2.split(":");
            int horas2 = Integer.parseInt(data2Separada[0]);
            int minutos2 = Integer.parseInt(data2Separada[1]);
            int segundos2 = Integer.parseInt(data2Separada[2]);

            horas1 *= 3600;
            horas2 *= 3600;
            minutos1 *= 60;
            minutos2 *= 60;

            int segundosTotais1 = horas1 + minutos1 + segundos1;
            int segundosTotais2 = horas2 + minutos2 + segundos2;

            Integer difHoras = null;
            if (segundos1 > segundos2) {
                difHoras = (segundosTotais1 - segundosTotais2);
            }
            else {
                difHoras = (segundosTotais1 - segundosTotais2) * (-1);
            }
            return difHoras;
        }
    }

    public String getHora() {
        return hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public String displayHora (){
        return hora + ":" + minuto + ":" + segundo;
    }
}
