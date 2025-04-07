import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        View.exibirMenu();
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        JOptionPane.showMessageDialog(null,idade);
    }
}