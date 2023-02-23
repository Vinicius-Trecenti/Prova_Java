package exercicio4;

import javax.swing.JOptionPane;

public class sorteio {
    //Fazer uma classe Sorteio para:
    public static void main(String[] args) throws Exception {
        // Sortear um número de 0 a 1000 (dica: usar Math.random())

        int flag = 1;
        int contador = 1;
        int numero_sorteado;
        int ult_num=0;
        numero_sorteado = (int) (Math.random() * 1000);

        // Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
        // quantas tentativas ele acertou.
        while(flag == 1){
                try {
                    verifica teste_sort = new verifica();
                        
                    // Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
                    // menor do que o número sorteado.
                    int numero_digitado=0;
                    ult_num = numero_digitado;
                    numero_digitado = Integer. parseInt(JOptionPane. showInputDialog(null, "Digite o numero para tentar acertar: ")); 
                    

                    flag = Integer. parseInt(JOptionPane. showInputDialog(null, "Digite [1 Continuar][0 Parar]"));
                    if(flag == 1){
                        contador++;
                    } 
                    else if(flag == 0){
                        JOptionPane.showMessageDialog(null, "Quantiadade de tentativas: " + contador);
                        break;
                    }

                    teste_sort.verificador(numero_digitado, numero_sorteado);

                // ii. lançar a exceção MaiorQueException caso o número arriscado seja
                // maior do que o sorteado
                } catch (MaiorQueException e) {
                    JOptionPane.showMessageDialog(null, "Quase tente outro: " + e.getMessage());

                // i. lançar a exceção MenorQueException caso o número arriscado seja
                // menor do que o sorteado
                } catch (MenorQueException e) {
                    JOptionPane.showMessageDialog(null, "Quase tente outro: " + e.getMessage());
                }
                // iii. capturar essas exceções e tratá-las, mantendo a lógica original.
                catch (NumeroSorteado e) {
                    JOptionPane.showMessageDialog(null, "FIM DE JOGO " + e.getMessage());
                }
            }

            if(flag == 1){
                JOptionPane.showMessageDialog(null, "Quantiadade de tentativas: " + contador);
            }
            JOptionPane.showMessageDialog(null, "Numero sorteado: " + numero_sorteado);
            JOptionPane.showMessageDialog(null, "Ultimo numero digitado: " + ult_num);
        }
}
