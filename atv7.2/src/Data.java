import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;

public class Data {
    private final String dia;
    private final String mes;
    private final String ano;

    // Função de validação sugerida pelo professor:
    public static void isValid(String value) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate.parse(value, dateTimeFormatter);
        } catch (DateTimeParseException _) {
        }
    }

    // Construtor da classe que já faz um tipo de verificação se é data válida ou não:
    public Data(String dataDigitada) {
        String[] dataSeparada = dataDigitada.split("/");

        this.dia = dataSeparada[0];
        this.mes = dataSeparada[1];
        this.ano = dataSeparada[2];

        isValid(dataDigitada);
    }

    // Como os atributos dia, mes e ano são retornados pelo construtor, os setters dos mesmos foram removidos por não serem usados:
    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    // Método para retornar o mês por extenso:
    public String getMesExtenso(String mes){
        int mesInteiro = Integer.parseInt(mes);
        String mesExtenso = "";
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");
        mesExtenso = meses.get(mesInteiro - 1);
        return mesExtenso;
    }

    public Integer comparar(String data1, String data2){
        if (data1.equals(data2)) {
            return 0;
        }

        else {
            // Pegando separadamente os dias, meses e anos de ambas as datas:
            String[] data1Separada = data1.split("/");
            int dia1 = Integer.parseInt(data1Separada[0]);
            int mes1 = Integer.parseInt(data1Separada[1]);
            int ano1 = Integer.parseInt(data1Separada[2]);

            String[] data2Separada = data2.split("/");
            int dia2 = Integer.parseInt(data2Separada[0]);
            int mes2 = Integer.parseInt(data2Separada[1]);
            int ano2 = Integer.parseInt(data2Separada[2]);

            // Pegando ano, mes e dia, respectivamente para comparar:
            // Foi considerado data1 como a do parâmetro e data2 como a corrente, dado que não é necessário pegar a data do sistema:
            if (ano1 > ano2)
                return -1;
            else if (mes1 > mes2)
                return -1;
            else if (dia1 > dia2)
                return -1;
            else
                return 1;
        }
    }
}
