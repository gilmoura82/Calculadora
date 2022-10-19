import Classes.Operacoes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        String msg, oper;
        String a = "";
        String b = "";

        msg = "Bem vindo!!! Informe uma operação" + "\n" + "1 - Soma" + "\n" + "2 - Subtração" + "\n"
                + "3 - Multiplicação" + "\n" + "4 - Divisão";

        // Instância da Classe das Operações Matemáticas
        Operacoes operacao = new Operacoes();


        boolean continueLoop = true;

        do {
            oper = JOptionPane.showInputDialog(null, msg);
            a = JOptionPane.showInputDialog("Informe O Numerador: ");
            b = JOptionPane.showInputDialog("Informe O Denominador: ");

            switch (oper) {
                case "1": {
                    resultado = operacao.soma(Integer.parseInt(a), Integer.parseInt(b));
                    break;
                }
                case "2": {
                    resultado = operacao.subtrair(Integer.parseInt(a), Integer.parseInt(b));
                    break;
                }
                case "3": {
                    resultado = operacao.multiplicar(Integer.parseInt(a), Integer.parseInt(b));
                    break;
                }
                case "4": {
                    resultado = operacao.dividir(Integer.parseInt(a), Integer.parseInt(b));
                    break;
                }
            }
            try {
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                continueLoop = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada Inválida, informe um nº inteiro");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir qualquer Nº por zero");
            }

        } while (continueLoop);
    }


}
