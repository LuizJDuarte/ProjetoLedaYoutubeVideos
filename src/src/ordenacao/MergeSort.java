package src.ordenacao;

public class MergeSort {
    public void ordenar(String[][] array, int indice) {
        mergeSort(array, indice, 0, array.length - 1);
    }

    private void mergeSort(String[][] array, int indice, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;

            mergeSort(array, indice, esquerda, meio);
            mergeSort(array, indice, meio + 1, direita);

            merge(array, indice, esquerda, meio, direita);
        }
    }

    private void merge(String[][] array, int indice, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        String[][] esquerdaArray = new String[n1][];
        String[][] direitaArray = new String[n2][];

        for (int i = 0; i < n1; ++i)
            esquerdaArray[i] = array[esquerda + i];
        for (int j = 0; j < n2; ++j)
            direitaArray[j] = array[meio + 1 + j];

        int i = 0, j = 0;
        int k = esquerda;
        while (i < n1 && j < n2) {
            if (esquerdaArray[i][indice].compareTo(direitaArray[j][indice]) <= 0) {
                array[k] = esquerdaArray[i];
                i++;
            } else {
                array[k] = direitaArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = esquerdaArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = direitaArray[j];
            j++;
            k++;
        }
    }
}
