import java.io.*;
import java.util.ArrayList;

public class BubbleSort {

    public static void main(String[] args) {

        String archivoEntrada = "C:\\archivos\\numeros.txt";
        String archivoSalida = "C:\\archivos\\ordenados.txt";

        try {
            int[] numeros = leerNumeros(archivoEntrada);

            System.out.println("Números originales:");
            imprimir(numeros);

            bubbleSort(numeros);

            System.out.println("\nNúmeros ordenados:");
            imprimir(numeros);

            guardarNumeros(archivoSalida, numeros);
            System.out.println("\nArchivo guardado en: " + archivoSalida);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    // ---- Bubble Sort ----
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        int n = arr.length;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
        // ---- Leer archivo ----
    public static int[] leerNumeros(String ruta) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        ArrayList<Integer> lista = new ArrayList<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            lista.add(Integer.parseInt(linea.trim()));
        }
        br.close();

        int[] nums = new int[lista.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = lista.get(i);
        }
        return nums;
    }
