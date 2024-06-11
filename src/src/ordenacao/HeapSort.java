package src.ordenacao;

public class HeapSort {
    public void ordenar(String[][] array, int indice) {
        int tamanhoArrayL = array.length;

        for (int i = tamanhoArrayL / 2 - 1; i >= 0; i--)
            heapify(array, tamanhoArrayL, i, indice);

        for (int i = tamanhoArrayL - 1; i >= 0; i--) {
            String[] temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0, indice);
        }
    }

    private void heapify(String[][] array, int tamanhoArrayL, int i, int indice) {
        int maiorT = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tamanhoArrayL && array[esquerda][indice].compareTo(array[maiorT][indice]) > 0)
            maiorT = esquerda;

        if (direita < tamanhoArrayL && array[direita][indice].compareTo(array[maiorT][indice]) > 0)
            maiorT = direita;

        if (maiorT != i) {
            String[] swap = array[i];
            array[i] = array[maiorT];
            array[maiorT] = swap;

            heapify(array, tamanhoArrayL, maiorT, indice);
        }
    }
}
