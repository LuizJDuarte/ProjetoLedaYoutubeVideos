package src;

import java.io.*;

public class FiltrarVideos {

    public static void main(String[] args) {
        File arquivoEntrada = new File("videos_T1.csv");
        File arquivoSaida = new File("videos_TSS.csv");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))) {

            String cabecalho = leitor.readLine(); 
            escritor.write(cabecalho + "\n");

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",", -1); 
                String titulo = campos[2].toLowerCase();
                
                // Verifica se o título contém "trailer", "show" ou "short" no nome dele
                if (titulo.contains("trailer") || titulo.contains("show") || titulo.contains("short")) {
                    escritor.write(linha + "\n");
                }
            }

            System.out.println("Arquivo 'videos_TSS.csv' criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo 'videos_TSS.csv': " + e.getMessage());
        }
    }
}
