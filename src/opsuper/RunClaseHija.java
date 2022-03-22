package opsuper;

public class RunClaseHija {
    public static void main(String[] args) {
        ClaseHija hija1 = new ClaseHija();
        ClaseHija hija2 = new ClaseHija("Hija", "Numero 2");

        System.out.println(hija1);
        System.out.println(hija2);
    }
}