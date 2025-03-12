package Ficheros.EjSorpresa;

import java.io.IOException;

public class Main extends GestorFicheros{
    public Main(String inputFile, String outputFile) {
        super(inputFile, outputFile);
    }

    public static void main(String[] args) throws IOException {
        Main a1 = new Main("src/Ficheros/EjSorpresa/entrada.txt","src/Ficheros/EjSorpresa/salida.txt");

        a1.processFile();
    }

    @Override
    public void processFile() throws IOException {
        writeFile(readFile().toUpperCase()+"DAVID ROMERO");

    }
}