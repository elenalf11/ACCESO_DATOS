package ejemplo4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EjemploBufferedWriter_2 {
	public static void main(String[] args) {
        Path path = Path.of("miejemplo.txt"); //Toma la ruta para crear el fichero
        if (!Files.exists(path)) {
            try {
                Files.createFile(path); //Le tienes que pasar un objeto Path, si añades la ruta no funcionará
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String content = "hola, que tal? \n";
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) { //Es un método estático, es un método de clase
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
