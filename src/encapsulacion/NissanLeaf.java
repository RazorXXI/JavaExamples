package encapsulacion;

public class NissanLeaf implements CocheElectrico {
    private int capacidadBateria;
    private boolean estado;
    private static final int CAPACIDAD_MAX = 100;


    public NissanLeaf(int capacidadBateria, boolean estado) {
        super();
        this.capacidadBateria = capacidadBateria;
        this.estado = estado;
    }

    @Override
    public int getCapacidadBateria() {
        return this.capacidadBateria;
    }

    @Override
    public void setCapacidadBateria(int capacidadBateria) {        
        if (capacidadBateria > CAPACIDAD_MAX) {
            this.capacidadBateria = CAPACIDAD_MAX;
            System.out.println("La capacidad introducida es mayor que la capacidad Máxima: " + CAPACIDAD_MAX + " KwH Se configura a la capacidad máxima" );
        }
        else this.capacidadBateria = capacidadBateria;
    }

    @Override
    public boolean getEstado() {       
        return this.estado;
    }

    @Override
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int autonomiaBateria() {
        int autonomiaKm;

        if (capacidadBateria < 10) {
            autonomiaKm = 100;
        } else if (capacidadBateria > 10 && capacidadBateria <50){
            autonomiaKm = 300;
        }
        else autonomiaKm = 500;
        return autonomiaKm;
    }
    
}
