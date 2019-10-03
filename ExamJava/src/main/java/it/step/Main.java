package it.step;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consScan;
        String[] sp;
        String path;
        a:while (true){
            consScan = scanner.nextLine();
            sp = consScan.split(" ");
            path = sp[1];

            switch (sp[0]){
                case "dir":
                    Dir dir = new Dir(path);

                    break;
                case "cd":
                    CD cd = new CD(sp);
                    cd.perform();
                    break;

                case "pwd":

                    break;

                case "cat":

                    break;
                case "break":

                    break a;
            }
        }
    }
}
