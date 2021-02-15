package msa.language.unnamed.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileUtils {
    public static String readString(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(path);
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)
        ) {

            String str;
            while ((str = reader.readLine()) != null) {
                stringBuilder.append(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
