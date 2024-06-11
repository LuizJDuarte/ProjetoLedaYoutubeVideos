package src;

import java.io.*;

public class SepararVideos {

    public static void main(String[] args) {
        String[] arquivos = {"GBvideos.csv", "CAvideos.csv", "MXvideos.csv", "INvideos.csv","DEvideos.csv", "RUvideos.csv", "JPvideos.csv", "FRvideos.csv","USvideos.csv", "KRvideos.csv"};
        String[] codigosPaises = {"GB", "CA", "MX", "IN", "DE", "RU", "JP", "FR", "US", "KR"};

        String novoArquivo = "videos.csv";

        try (PrintWriter pw = new PrintWriter(new File(novoArquivo))) {
            boolean cabecalhoEscrito = false;

            for (int i = 0; i < arquivos.length; i++) {
            	
                try (BufferedReader br = new BufferedReader(new FileReader(arquivos[i]))) {
                    String linha = br.readLine();
                    if (!cabecalhoEscrito) {
                        pw.println(linha + ",countries");
                        cabecalhoEscrito = true;
                    }
                    while ((linha = br.readLine()) != null) {
                        pw.println(linha + "," + codigosPaises[i]);
                    }
                    
                    
                } catch (FileNotFoundException e) {
                    System.out.println("Arquivo não encontrado: " + arquivos[i]);
                } catch (IOException e) {
                    System.out.println("Erro ao ler o arquivo: " + arquivos[i]);
                }//trataento de erros
            }
            
            System.out.println("Arquivo 'videos.csv' criado com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo de saída.");
        }
    }
}
