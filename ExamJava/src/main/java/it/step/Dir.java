package it.step;

import java.io.File;

public class Dir {
    private String path;

    public Dir(String sp) {
        path = sp;
        this.perform();
    }


    private void perform() {
        File dir = new File(path);
        File[] arrFiles = dir.listFiles();
        String[] res = new String[arrFiles.length];
        String par = dir.getAbsolutePath();
        System.out.println("Список папок текущей директории.");
        for (int i = 0; i < arrFiles.length; i++) {
            res[i] = String.valueOf(arrFiles[i]);

            System.out.println(res[i].replace(par,""));
        }

    }


}
