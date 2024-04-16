public class Data {
    private final String dia;
    private final String mes;
    private final String ano;
    private String dataFormatada;

    public Data(String dataDigitada) {
        String[] dataSeparada = dataDigitada.split("/");
        this.dia = dataSeparada[0];
        this.mes = dataSeparada[1];
        this.ano = dataSeparada[2];
        this.dataFormatada = dataSeparada[0] + "/" + dataSeparada[1] + "/" + dataSeparada[2];
    }

    public String getDataFormatada() {
        return dataFormatada;
    }
}