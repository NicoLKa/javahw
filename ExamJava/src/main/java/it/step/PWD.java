package it.step;

public class PWD {
    private String path;
    public PWD(String sp) {
        path = sp;
        perform();
    }


    private void perform() {
        System.out.println("Полный путь до текущей директории:");
        System.out.println(path);
    }
}
