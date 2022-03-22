package opsuper;

public class ClaseHija extends ClasePadre {
    private String atributoHija1;
    private String atributoHija2;

    

    public ClaseHija() {
        super();
        this.atributoHija1 = null;
        this.atributoHija2 = null;
        System.out.println("Constructor por defecto de ClaseHija");
    }

    public ClaseHija(String atributoHija1, String atributoHija2) {
        super(); //Llamamos al constructor de ClasePadre
        this.atributoHija1 = atributoHija1;
        this.atributoHija2 = atributoHija2;
        System.out.println("Constructor con parámetros de ClaseHija");
    }

    public String getAtributoHija1() {
        return atributoHija1;
    }

    public void setAtributoHija1(String atributoHija1) {
        this.atributoHija1 = atributoHija1;
    }

    public String getAtributoHija2() {
        return atributoHija2;
    }

    public void setAtributoHija2(String atributoHija2) {
        this.atributoHija2 = atributoHija2;
    }

    @Override
    public String getAtributoPadre1() {
        return super.getAtributoPadre1();
    }

    @Override
    public String getAtributoPadre2() {
        return super.getAtributoPadre2();
    }

    @Override
    public void setAtributoPadre1(String atributoPadre1) {
        super.setAtributoPadre1(atributoPadre1);
    }

    @Override
    public void setAtributoPadre2(String atributoPadre2) {
        super.setAtributoPadre2(atributoPadre2);
    }

    @Override
    public String toString() {
        return "ClaseHija [atributoHija1=" + atributoHija1 + ", atributoHija2=" + atributoHija2 + "]";
    }

    
    
}
