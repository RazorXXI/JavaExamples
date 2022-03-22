package encapsulacion;

public class NissanLeaf implements CocheElectrico {
    private Bateria bateria;
    private boolean estado;
    private static final int CAPACIDAD_MAX = 100;


    public NissanLeaf(int capacidadBateria, boolean estado) {
        super();
        this.bateria = new Bateria(capacidadBateria, CAPACIDAD_MAX);
        this.estado = estado;
    }

    @Override
    public int getCapacidadBateria() {
        return bateria.getCapacidadBateria();
    }

    @Override
    public void setCapacidadBateria(int capacidadBateria) {        
        bateria.setCapacidadBateria(capacidadBateria);
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
        return bateria.autonomiaBateria();
    }
    
}
