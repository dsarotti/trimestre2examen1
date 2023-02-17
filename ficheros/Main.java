package codigo_fuente.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Este código solo es de ayuda para el ejercicio. No es necesario utilizarlo.
public class Main {

    public static void insertaPrimeraLinea(String nombreFichero, String texto) {
        String textoAnterior = "";
        String linea;
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            do {
                linea = reader.readLine();
                if (linea != null)
                    textoAnterior = textoAnterior + linea+"\n";
            } while (linea != null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter archivo = new FileWriter(nombreFichero);
                BufferedWriter writer = new BufferedWriter(archivo);) {

            writer.write(texto + "\n" + textoAnterior);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void insertaPrimeraLineaBinario(String nombreFichero, String texto) {
        byte[] textoAnteriorBinario=null;

        try (InputStream input = new FileInputStream(nombreFichero)) {
            textoAnteriorBinario = input.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] textoFinalBinario=(texto + "\n" + new String(textoAnteriorBinario)).getBytes();

        try (OutputStream out = new FileOutputStream(nombreFichero)) {
            out.write(textoFinalBinario, 0, textoFinalBinario.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        insertaPrimeraLinea("texto.txt", "¡Hola mundo!");
        insertaPrimeraLineaBinario("texto.txt", "Hola mundo binario");
    }
}
