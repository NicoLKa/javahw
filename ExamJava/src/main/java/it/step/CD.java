package it.step;

public class CD {
    private String[] path;
    public CD(String[] sp) {
        path = sp;
    }

    public static void main(String[] args) {

    }

    public void perform(){
        for (int i = 1; i < path.length; i++) {
            System.out.println(path[i]);
        }
    }
}
