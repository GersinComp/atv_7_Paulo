import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String dataDigitada = JOptionPane.showInputDialog(null, "Insira a data no formato DD/MM/AAAA: ");
        Data data = new Data(dataDigitada);

        String dataDigitada2 = JOptionPane.showInputDialog(null, "Insira a data no formato DD/MM/AAAA: ");
        Data data2 = new Data(dataDigitada2);

        String dia = data.getDia();
        String mes = data.getMes();
        String ano = data.getAno();
        String mesFormatado = data.getMesExtenso(mes);

        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
        System.out.println(mesFormatado);

        String dia2 = data2.getDia();
        String mes2 = data2.getMes();
        String ano2 = data2.getAno();
        String mesFormatado2 = data2.getMesExtenso(mes2);

        System.out.println(dia2);
        System.out.println(mes2);
        System.out.println(ano2);
        System.out.println(mesFormatado2);

        int comparado = data.comparar(dataDigitada, dataDigitada2);
        System.out.println(comparado);

    }


}
