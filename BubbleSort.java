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
