package encapsulacion;

public class RunCocheElectrico {
    public static void main(String[] args) {
        NissanLeaf nuevoLeaf = new NissanLeaf(150, true);

        System.out.println("Autonomia del Vehiculo: " + nuevoLeaf.autonomiaBateria() + " Km");
        System.out.println("Capacidad Actual de Bateria: " + nuevoLeaf.getCapacidadBateria() + " KwH");
        nuevoLeaf.setCapacidadBateria(45);
        nuevoLeaf.setEstado(true);
        System.out.println("Autonomia del Vehiculo: " + nuevoLeaf.autonomiaBateria() + " Km");
        System.out.println("Capacidad Actual de Bateria: " + nuevoLeaf.getCapacidadBateria() + " KwH");
    }
}
