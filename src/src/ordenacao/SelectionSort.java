package src.ordenacao;

public class SelectionSort {
    public void ordenar(String[][] array, int indice) {
        int tamanhoArr = array.length;
        for (int i = 0; i < tamanhoArr - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanhoArr; j++) {
                if (array[j][indice].compareTo(array[minIndex][indice]) < 0) { //comparar string array
                    minIndex = j;
                }
            }
            String[] temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
