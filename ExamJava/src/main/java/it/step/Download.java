package it.step;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Download {
    private String urlP;
    private String path;
    private byte data[];
    public Download(String sp, String path) {
        this.urlP = sp;
        this.path = path;
        perform();
    }

    public Download(String sp) {
        this.urlP = sp;
        this.path = System.getProperty("user.dir");
        perform();
    }

    private void perform() {
        try {
            URL url = new URL(urlP);
            BufferedInputStream in = new BufferedInputStream(url.openStream());
            String nameFile = url.getFile().replaceAll("/.+/", "");
            File f = new File(path + "\\" + nameFile);
            FileOutputStream out = new FileOutputStream(f);

            data = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                out.write(data, 0, count);
            }
            System.out.println("Файл скачан.\n" + "Файл был сохранен по этому пути: "
                    + f.getAbsolutePath());
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}

