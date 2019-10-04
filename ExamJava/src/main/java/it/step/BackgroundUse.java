package it.step;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BackgroundUse {
    private String path;
    private boolean check = false;
    private String[] sp;
    private String consScan;

    public BackgroundUse(String p) {
        path = p;
        perform();
    }

    private void perform() {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Scanner scanner = new Scanner(System.in);

        b:
        while (true) {
            consScan = scanner.nextLine();
            if ("break".equals(consScan)) {
                service.shutdownNow();
                break b;
            }
            sp = consScan.split(" ");



            service.submit(() -> {
                switch (sp[0]) {
                    case "dir":
                        if (!check) {
                            new Dir(Main.pathFile(sp));
                        } else {
                            new Dir(path);
                        }
                        printComand();
                        break;
                    case "cd":
                        path = new CD(Main.pathFile(sp)).getPath();
                        check = true;
                        break;
                    case "pwd":
                        if (!check) {
                            new PWD(Main.pathFile(sp));
                        } else {
                            new PWD(path);
                        }
                        printComand();
                        break;
                    case "cat":
                        new Cat(Main.pathFile(sp));
                        printComand();
                        break;
                    case "download":
                        printComand();
                        if(path.equals("")){
                            new Download(Main.pathFile(sp));
                        }else {
                            new Download(Main.pathFile(sp), path);
                        }
                        break;
                }
            });
        }
    }

    static void printComand(){
        System.out.println("\n" + "Фоновый режим:\n" +
                "Команды консоли: \n" +
                "dir — выводит список файлов в текущей директории\n" +
                "cd «путь» — перейти в директорию, путь к которой задан первым аргументом\n" +
                "pwd — вывести полный путь до текущей директории\n" +
                "cat «имя_файла» - выводит содержимое текстового файла «имя_файла»\n" +
                "download - download «url» «имя_файла» загружает файл\n" +
                "break - завершить работу програмы в многопоточном режиме" +
                "(переходит в последовательный режим роботы)\n");

    }
}