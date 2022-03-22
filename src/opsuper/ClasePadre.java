package opsuper;

public class ClasePadre {
    private String atributoPadre1;
    private String atributoPadre2;

    public ClasePadre(){
        this.atributoPadre1 = null;
        this.atributoPadre2 = null;
        System.out.println("Ejecutado constructor por defecto de la clase padre");
    }

    public ClasePadre(String atributoPadre1, String atributoPadre2) {
        this.atributoPadre1 = atributoPadre1;
        this.atributoPadre2 = atributoPadre2;
        System.out.println("Ejecutado constructor con parametros de la clase padre");
    }

    @Override
    public String toString() {
        return "ClasePadre [atributoPadre1=" + atributoPadre1 + ", atributoPadre2=" + atributoPadre2 + "]";
    }

    
    
}
