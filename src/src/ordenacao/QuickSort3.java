package src.ordenacao;

public class QuickSort3 {
    public void ordenar(String[][] array, int indice) {
        quickSort(array, indice, 0, array.length - 1);
    }

    private void quickSort(String[][] array, int indice, int baixo, int alto) {
        if (baixo < alto) {
            int pi = particionar(array, indice, baixo, alto);

            quickSort(array, indice, baixo, pi - 1);
            quickSort(array, indice, pi + 1, alto);
        }
    }

    private int particionar(String[][] array, int indice, int baixo, int alto) {
        String[] pivo = array[baixo + (alto - baixo) / 3]; // Pivô como o terço para a mediana
        int i = baixo - 1;

        for (int j = baixo; j < alto; j++) {
            if (array[j][indice].compareTo(pivo[indice]) <= 0) {
                i++;
                String[] temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String[] temp = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temp;

        return i + 1;
    }
}
