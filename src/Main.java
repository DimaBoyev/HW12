import java.util.*;

public class Main {

    public static Collection<String> s = Arrays.asList("loh ","he AA.o", "ty", "platish");



    public static void main(String[] args) {
        Map<String, String> keks = new HashMap<>();
        keks.put("pis", "BO@Y");
        keks.put("chaCHA", "MUCHA<>CHA");
        URL u = new URL.Composer("football.ua").setPath(s).setPath("uf", "fa").compose();
        System.out.println(u);
    }
}
