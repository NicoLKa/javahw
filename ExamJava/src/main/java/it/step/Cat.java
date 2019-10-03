package it.step;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cat {
    private String fileName;

    public Cat(String p) {
        fileName = p;
        System.out.println(fileName);
        perform();
    }

    public void perform() {
        String content = "";
        System.out.println(fileName);
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            InputStream str = new FileInputStream(file.getPath());
            Scanner scanner = new Scanner(str);

            String sc;
            try {
                while (true) {
                    sc = scanner.nextLine();
                    content += sc + "\n";
                }

            } catch (NoSuchElementException ex) { }
            str.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
    }
}

