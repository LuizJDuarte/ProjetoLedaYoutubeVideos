package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UtilCSV {

    public static String[][] lerCSV(String caminhoArquivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha = reader.readLine();
        int numeroLinhas = 0;
        int numeroColunas = linha.split(",").length;

        while (linha != null) {
            numeroLinhas++;
            linha = reader.readLine();
        }
        reader.close();

        String[][] dados = new String[numeroLinhas][numeroColunas];
        reader = new BufferedReader(new FileReader(caminhoArquivo));
        int linhaAtual = 0;
        linha = reader.readLine();
        while (linha != null) {
            dados[linhaAtual] = linha.split(",");
            linhaAtual++;
            linha = reader.readLine();
        }
        reader.close();
        return dados;
    }

    public static void escreverCSV(String caminhoArquivo, String[][] dados) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo));

        for (String[] linha : dados) {
            writer.write(String.join(",", linha));
            writer.newLine();
        }
        writer.close();
    }
}
