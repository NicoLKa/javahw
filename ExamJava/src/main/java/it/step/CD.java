package it.step;

import java.io.File;

public class CD {
    private String path;
    public CD(String sp) {
        path = sp;
        perform();
    }

    private String perform(){
        if(!new File(path).isDirectory()){
            System.out.println("Этот путь не верный");
            return path = null;
        }
        return path;
    }

    public String getPath(){
        return path;
    }
}
