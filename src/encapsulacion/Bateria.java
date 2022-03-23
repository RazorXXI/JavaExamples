package encapsulacion;

public class Bateria {
    private int capacidadBateria;
    private int capacidadMaxima;


    public Bateria(int capacidadBateria, int capacidadMaxima) {
        super();
        this.capacidadBateria = capacidadBateria;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadBateria() {
        return this.capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria){
        if (capacidadBateria > this.capacidadMaxima) {
            this.capacidadBateria = this.capacidadMaxima;
            System.out.println("La capacidad introducida es mayor que la capacidad Máxima: " + this.capacidadMaxima + " KwH Se configura a la capacidad máxima" );
        }
        else this.capacidadBateria = capacidadBateria;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public int autonomiaBateria(){
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
