import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String dataDigitada = JOptionPane.showInputDialog(null, "Digite a data (DD/MM/AAAA) do voo: ");
        Data dataVoo = new Data(dataDigitada);
        String dataVooFormatada = dataVoo.getDataFormatada();
//        JOptionPane.showMessageDialog(null, dataVooFormatada);

        String horaDigitada = JOptionPane.showInputDialog(null, "Digite a hora (HH/MM/SS) do voo: ");
        Hora horaVoo = new Hora(horaDigitada);
        String horaVooFormatada = horaVoo.getHoraFormatada();
//        JOptionPane.showMessageDialog(null, horaVooFormatada);

        Integer numVoo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero do voo: "));
        Voo voo = new Voo(dataVoo, horaVoo, numVoo);
//        JOptionPane.showMessageDialog(null, numVoo);

        for (int i = 0; i < voo.getMaxLugares(); i++) {
            Integer lugar = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual cadeira gostaria de reservar? "));
            String verificarLugar = voo.verificarLugar(lugar);
            JOptionPane.showMessageDialog(null, verificarLugar);
            String ocuparLugar = voo.ocupar(lugar);
            JOptionPane.showMessageDialog(null, ocuparLugar);
            Integer proxLugarLivre = voo.proximoLivre();
            JOptionPane.showMessageDialog(null, "O próximo lugar livre é a cadeira: " + proxLugarLivre);
        }
    }
}