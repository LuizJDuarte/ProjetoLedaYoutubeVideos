package src;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatarData {

    public static void main(String[] args) {
        File arquivoEntrada = new File("videos.csv");
        File arquivoSaida = new File("videos_T1.csv");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))) {

            String cabecalho = leitor.readLine(); 
            escritor.write(cabecalho + ",trending_full_date\n");

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length < 17) {
                    System.err.println("Erro: Linha com formato inválido - " + linha);
                    continue; // Pula a linha com formato inválido pra evitar erro de pegar o campo errado
                }
                String trendingDate = campos[1];
                try {
                    String formattedDate = formatarData(trendingDate);
                    escritor.write(linha + "," + formattedDate + "\n");
                } catch (ParseException e) {
                    System.err.println("Erro: Formato de data inválido - " + trendingDate);
                }
            }

            System.out.println("Arquivo 'videos_T1.csv' criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo 'videos_T1.csv': " + e.getMessage());
        }
    }

    private static String formatarData(String trendingDate) throws ParseException {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yy.dd.MM");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date date = inputFormat.parse(trendingDate);
        return outputFormat.format(date);
    }
}
