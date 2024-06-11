package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiltraDislikes {
    public static void main(String[] args) {
        String inputFilePath = "videos_T1.csv";
        String outputFilePath = "videos_T2.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

            String header = br.readLine();
            
            if (header != null) {
                bw.write(header);
                bw.newLine();
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = parseCSVLine(line);
                if (columns.length > 9) {
                    try {
                        int likes = Integer.parseInt(columns[8]);
                        int dislikes = Integer.parseInt(columns[9]);
                        
                        if (dislikes > likes) {
                            bw.write(line);
                            bw.newLine();
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Erro ao converter likes ou dislikes para número: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] parseCSVLine(String line) {
        // Esta função divide uma linha CSV em colunas corretamente (aspas e vírgulas dentro das aspas_)
        boolean inQuotes = false;
        StringBuilder sb = new StringBuilder();
        int len = line.length();
        for (int i = 0; i < len; i++) {
            char c = line.charAt(i);
            if (c == '"') {
                inQuotes = !inQuotes; // muda o estado de inQuotes
            } else if (c == ',' && !inQuotes) {
                sb.append(';'); // Substitui vírgulas fora das aspas por ponto e vírgula
            } else {
                sb.append(c);
            }
        }
        return sb.toString().split(";");
    }
}
