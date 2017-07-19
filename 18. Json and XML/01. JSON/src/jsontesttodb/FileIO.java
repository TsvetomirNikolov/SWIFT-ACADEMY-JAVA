package jsontesttodb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileIO {

    public void write(String content, String fileName) throws FileNotFoundException, FileNotFoundException, IOException {
        OutputStream output = new FileOutputStream(fileName);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        writer.write(content);
    }

    public void read(String fileName) {
      InputStream str = getClass().getResourceAsStream(fileName);
      BufferedReader bfr = new BufferedReader(new InputStreamReader(str));
    }
}
