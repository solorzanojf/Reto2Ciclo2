package reto2ciclo2.logica;

public class Factura3 {
    Medicamentos [] listaMedicamentos;

    public Factura3(Medicamentos listaMedicamentos []){

        this.listaMedicamentos = listaMedicamentos;
        
    }

    public void mostratTotales(){
        double totalMedicamentos = 0;
        double totalMedicamentosLegal = 0;
        double totalMedicamentosNatural = 0;

        for (Medicamentos medicamentos:listaMedicamentos){
            double precio = medicamentos.calcularPrecio();
            totalMedicamentos+=precio;
            if (medicamentos.getClass() == MedicamentosLegal.class){
                totalMedicamentosLegal+= precio;
            }else if (medicamentos.getClass()== MedicamentosNatural.class){
                totalMedicamentosNatural+=precio;
            }
        }

        System.out.println("El precio total de los medicamentos es de " + totalMedicamentos);
        System.out.println("La suma del precio de los MedicamentosLegal es de " + totalMedicamentosLegal);
        System.out.print("La suma del precio de los MedicamentosNatural es de " + totalMedicamentosNatural);

    }

}
