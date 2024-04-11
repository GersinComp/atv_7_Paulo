import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(10F);

        aluno.setNome(String.valueOf(JOptionPane.showInputDialog(null, "Informe o nome de aluno:")));
        aluno.setMatricula(Integer.valueOf(JOptionPane.showInputDialog(null, "Informe o n° da matrícula:")));
        aluno.setNotaProva1(Float.valueOf(JOptionPane.showInputDialog(null, "Informe a nota da 1ª prova:")));
        aluno.setNotaProva2(Float.valueOf(JOptionPane.showInputDialog(null, "Informe a nota da 2ª prova:")));
        aluno.setNotaTrabalho(Float.valueOf(JOptionPane.showInputDialog(null, "Informe a nota do trabalho:")));

        Float notaProva1 = aluno.getNotaProva1();
        Float notaProva2 = aluno.getNotaProva2();
        Float notaTrabalho = aluno.getNotaTrabalho();

        aluno.aprovacao(notaProva1, notaProva2, notaTrabalho);
    }
}
