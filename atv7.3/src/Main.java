import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String horaDigitada = JOptionPane.showInputDialog("Digite as horas no formato HH:MM:SS :");
        Hora hora = new Hora(horaDigitada);

        String horaDigitada2 = JOptionPane.showInputDialog("Digite as horas no formato HH:MM:SS :");
        Hora hora2 = new Hora(horaDigitada2);

        String horas1 = hora.getHora();
        String horas2 = hora2.getHora();
        String minutos1 = hora.getMinuto();
        String minutos2 = hora2.getMinuto();
        String segundos1 = hora.getSegundo();
        String segundos2 = hora.getSegundo();

        String horaFormatada = hora.displayHora();
        String horaFormatada2 = hora2.displayHora();

        JOptionPane.showMessageDialog(null, "Horas do primeiro horário digitado: " + horas1 + "\n" + "Minutos do primeiro horário digitado: " + minutos1 + "\n" + "Segundos do primeiro horário digitado: " + segundos1 + "\n");
        JOptionPane.showMessageDialog(null, "Horas do segundo horário digitado: " + horas2 + "\n" + "Minutos do segundo horário digitado: " + minutos2 + "\n" + "Segundos do segundo horário digitado: " + segundos2 + "\n");

        JOptionPane.showMessageDialog(null, "Primeiro horário digitado formatado: " + horaFormatada + "\n");
        JOptionPane.showMessageDialog(null, "Segundo horário digitado formatado: " + horaFormatada2 + "\n");

        Integer difHoras = hora.compararHora(horaDigitada, horaDigitada2);
        JOptionPane.showMessageDialog(null, "Diferença das horas digitadas: " + difHoras + "\n");
    }
}
