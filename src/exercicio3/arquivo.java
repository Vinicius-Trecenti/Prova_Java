package exercicio3;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class arquivo {

    //escolha do arquivo de leitura dos alunos
    JFileChooser escolha = new JFileChooser();

    //onde vai salvar o arquivo com os dados dos alunos 
    File caminho_pasta;

    //caminho do arquivo com os dados dos alunos
    String caminho_arquivo = "";

    public File caminho_pasta() {
        JFileChooser arquivo = new JFileChooser();
        arquivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        arquivo.showSaveDialog(null);

        caminho_pasta = arquivo.getSelectedFile();

        return caminho_pasta;
    }

    public String caminho_arquivo_leitura() {
        int valor_retorno;

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(null, "txt");
        escolha.addChoosableFileFilter(filtro);
        valor_retorno = escolha.showOpenDialog(escolha);

        if(valor_retorno == JFileChooser.APPROVE_OPTION){
            caminho_arquivo = escolha.getSelectedFile().getAbsolutePath();
        }

        JOptionPane.showMessageDialog(null, "Lendo arquivo: " + caminho_arquivo);
        return caminho_arquivo;
    }

    //b) Salve estes dados em um arquivo. 
    public void escrever_arquivo(String nome, String pront, double nota) {
        try {
            FileWriter escritor = new FileWriter(caminho_arquivo + "");
            BufferedWriter bufferEscritor = new BufferedWriter(escritor);

            File file = new File(caminho_arquivo);
            escritor.write(nome);
            escritor.write(pront);
            

            // b) calcular e mostrar: quais alunos foram aprovados (média maior que 6.0),
            // quais foram para exame (média entre 4.0 e 6.0), quais foram reprovados
            // (média menor que 4.0).

            escritor.write("");

            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    //a) ler os dados contidos no arquivo gerado pelo programa anterior
    public void ler_arquivo() {
        try {
            FileReader leitor = new FileReader(caminho_arquivo);
            BufferedReader bufferLeitor = new BufferedReader(leitor);
            String linha = "";
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    public static void main(String[] args) {
        arquivo teste = new arquivo();
        
        JOptionPane.showMessageDialog(null,  "Escolha o caminho que deseja salvar o arquivo");
        teste.caminho_pasta();

        String pront1, pront2, pront3;
        String nome1, nome2, nome3;
        Double nota1, nota2, nota3;

        
        // Receba o prontuário, o nome e as duas notas de 3 alunos para uma
        // determinada disciplina.
        pront1 = JOptionPane. showInputDialog(null, "Digite o prontuario do aluno 1: ");
        // pront2 = JOptionPane. showInputDialog(null, "Digite o prontuario do aluno 2: ");
        // pront3 = JOptionPane. showInputDialog(null, "Digite o prontuario do aluno 3: ");

        nome1 = JOptionPane. showInputDialog(null, "Digite o nome do aluno 1: ");
        // nome2 = JOptionPane. showInputDialog(null, "Digite o nome do aluno 2: ");
        // nome3 = JOptionPane. showInputDialog(null, "Digite o nome do aluno 3: ");

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno 1: "));
        // nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno 2: "));
        // nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno 3: "));
        teste.escrever_arquivo(nome1, pront1, nota1);
        
        JOptionPane.showMessageDialog(null,  "Escolha o arquivo com os dados dos alunos");
        teste.caminho_arquivo_leitura();
    }
}