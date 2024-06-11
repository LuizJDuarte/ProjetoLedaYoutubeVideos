package src;

import src.ordenacao.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivoEntrada = "C:/Users/Luiz José/eclipse_projeto_leda/ProjetoLeda/videos_T1.csv"; //No caso, aqui você vai informar o lugar onde o videos_T1.csv, está no seu computador

        
        // Ordenações por título do canal ou channel title
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "melhor", "QuickSort", new QuickSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "medio", "QuickSort", new QuickSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "pior", "QuickSort", new QuickSort());

        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "melhor", "QuickSort3", new QuickSort3());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "medio", "QuickSort3", new QuickSort3());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "pior", "QuickSort3", new QuickSort3());

        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "melhor", "MergeSort", new MergeSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "medio", "MergeSort", new MergeSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "pior", "MergeSort", new MergeSort());

        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "melhor", "HeapSort", new HeapSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "medio", "HeapSort", new HeapSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "pior", "HeapSort", new HeapSort());

        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "melhor", "SelectionSort", new SelectionSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "medio", "SelectionSort", new SelectionSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "pior", "SelectionSort", new SelectionSort());

        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "melhor", "InsertionSort", new InsertionSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "medio", "InsertionSort", new InsertionSort());
        executarOrdenacao(caminhoArquivoEntrada, "channel_title", "pior", "InsertionSort", new InsertionSort());

        
        // Ordenações por número de comentários ou comment count
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "melhor", "SelectionSort", new SelectionSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "medio", "SelectionSort", new SelectionSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "pior", "SelectionSort", new SelectionSort());

        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "melhor", "InsertionSort", new InsertionSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "medio", "InsertionSort", new InsertionSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "pior", "InsertionSort", new InsertionSort());
        
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "melhor", "QuickSort", new QuickSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "medio", "QuickSort", new QuickSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "pior", "QuickSort", new QuickSort());

        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "melhor", "QuickSort3", new QuickSort3());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "medio", "QuickSort3", new QuickSort3());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "pior", "QuickSort3", new QuickSort3());

        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "melhor", "MergeSort", new MergeSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "medio", "MergeSort", new MergeSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "pior", "MergeSort", new MergeSort());

        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "melhor", "HeapSort", new HeapSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "medio", "HeapSort", new HeapSort());
        executarOrdenacao(caminhoArquivoEntrada, "comment_count", "pior", "HeapSort", new HeapSort());
        
        // Ordenações por trending full date
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "melhor", "QuickSort", new QuickSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "medio", "QuickSort", new QuickSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "pior", "QuickSort", new QuickSort());

        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "melhor", "QuickSort3", new QuickSort3());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "medio", "QuickSort3", new QuickSort3());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "pior", "QuickSort3", new QuickSort3());

        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "melhor", "MergeSort", new MergeSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "medio", "MergeSort", new MergeSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "pior", "MergeSort", new MergeSort());

        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "melhor", "HeapSort", new HeapSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "medio", "HeapSort", new HeapSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "pior", "HeapSort", new HeapSort());

        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "melhor", "SelectionSort", new SelectionSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "medio", "SelectionSort", new SelectionSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "pior", "SelectionSort", new SelectionSort());

        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "melhor", "InsertionSort", new InsertionSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "medio", "InsertionSort", new InsertionSort());
        executarOrdenacao(caminhoArquivoEntrada, "trending_full_date", "pior", "InsertionSort", new InsertionSort());
       


        
    }

    private static void executarOrdenacao(String caminhoArquivoEntrada, String campoOrdenacao, String caso, String algoritmo, Object algoritmoOrdenacao) {
        
    	System.out.println("Lendo dados do arquivo: " + caminhoArquivoEntrada);
        String[][] dados = lerCSV(caminhoArquivoEntrada);
        

        System.out.println("Preparando dados para o caso: " + caso);
        
        String[][] dadosCaso = prepararCaso(dados, campoOrdenacao, caso);

        long inicio = System.currentTimeMillis();
        
        System.out.println("Ordenando dados pelo campo: " + campoOrdenacao + " usando " + algoritmo);
        
        if (algoritmoOrdenacao instanceof QuickSort) {
            ((QuickSort) algoritmoOrdenacao).ordenar(dadosCaso, getIndiceCampo(campoOrdenacao));
        } else if (algoritmoOrdenacao instanceof QuickSort3) {
            ((QuickSort3) algoritmoOrdenacao).ordenar(dadosCaso, getIndiceCampo(campoOrdenacao));
        } else if (algoritmoOrdenacao instanceof MergeSort) {
            ((MergeSort) algoritmoOrdenacao).ordenar(dadosCaso, getIndiceCampo(campoOrdenacao));
        } else if (algoritmoOrdenacao instanceof HeapSort) {
            ((HeapSort) algoritmoOrdenacao).ordenar(dadosCaso, getIndiceCampo(campoOrdenacao));
        } else if (algoritmoOrdenacao instanceof SelectionSort) {
            ((SelectionSort) algoritmoOrdenacao).ordenar(dadosCaso, getIndiceCampo(campoOrdenacao));
        } else if (algoritmoOrdenacao instanceof InsertionSort) {
            ((InsertionSort) algoritmoOrdenacao).ordenar(dadosCaso, getIndiceCampo(campoOrdenacao));
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução para " + algoritmo + " no caso " + caso + ": " + (fim - inicio) + "ms");

        String nomeArquivoSaida = "videos_T1_" + campoOrdenacao + "_" + algoritmo + "_" + caso + "Caso.csv";
        escreverCSV(nomeArquivoSaida, dadosCaso);
        System.out.println("Dados ordenados salvos em: " + nomeArquivoSaida);
    }

    private static String[][] lerCSV(String caminho) {
        String[][] dados = new String[375942][16]; // coloquei o tamanho conforme o que eu usei
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            int i = 0;
            
            
            while ((linha = br.readLine()) != null) {
                dados[i++] = linha.split(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dados;
    }

    private static String[][] prepararCaso(String[][] dados, String campoOrdenacao, String caso) {
        //
        return dados;
    }

    private static void escreverCSV(String caminho, String[][] dados) {
        
    	try (FileWriter writer = new FileWriter(caminho)) {
            for (String[] linha : dados) {
                writer.write(String.join(",", linha) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getIndiceCampo(String campo) {
    	
        switch (campo) {
            case "video_id":
                return 0;
            case "trending_date":
                return 1;
            case "title":
                return 2;
            case "channel_title":
                return 3;
            case "category_id":
                return 4;
            case "publish_time":
                return 5;
            case "tags":
                return 6;
            case "views":
                return 7;
            case "likes":
                return 8;
            case "dislikes":
                return 9;
            case "comment_count":
                return 10;
            case "thumbnail_link":
                return 11;
            case "comments_disabled":
                return 12;
            case "ratings_disabled":
                return 13;
            case "video_error_or_removed":
                return 14;
            case "description":
                return 15;
            case "countries":
                return 16;
            case "trending_full_date":
                return 17;
            default:
                throw new IllegalArgumentException("Campo de ordenação inválido: " + campo); 
        }
    }
}
