package src.ordenacao;

public class InsertionSort {
    public void ordenar(String[][] array, int indice) {
        int tamanhoArray = array.length;
        
        for (int i = 1; i < tamanhoArray; ++i) {
            String[] listaComp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j][indice].compareTo(listaComp[indice]) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = listaComp;
        }
    }
}
