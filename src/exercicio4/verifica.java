package exercicio4;

import javax.swing.JOptionPane;

public class verifica {

    public void verificador(int numero_digitado, int numero_sorteado) throws Exception{
        if(numero_digitado < numero_sorteado){
            throw new MenorQueException();
        }
        else if(numero_digitado > numero_sorteado){
            throw new MaiorQueException();
        }
        else if(numero_digitado == numero_sorteado){
            JOptionPane.showMessageDialog(null, "FIM DE JOGO voce acertou o numero sorteado:");
            JOptionPane.showMessageDialog(null, "O numero sorteado foi: "+ numero_sorteado);
            JOptionPane.showMessageDialog(null, "Voce digitou: " + numero_digitado);
            throw new NumeroSorteado();
        }

    }
   
}
