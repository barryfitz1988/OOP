package main.com.company;

public class Worker {
    private Languages languages = new Languages();

    public String[] output(String[] lang){
        String[] list = languages.setLanguages(lang);
        for (String s : list) {
            System.out.println(s);
        }
        return lang;
    }
}
