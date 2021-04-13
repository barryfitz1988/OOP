package main.com.company;

public class Main {

    private static Worker worker = new Worker();
    private static String lang[] = {"Angular", "Groovy", "Java"};

    public static void main(String[] args) {
        worker.output(lang);
    }
}
