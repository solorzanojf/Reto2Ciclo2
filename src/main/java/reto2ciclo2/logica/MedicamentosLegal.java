package reto2ciclo2.logica;

public class MedicamentosLegal extends Medicamentos{
    private final static String PAIS_FABRICACION="Alemania";
    
    private String pais_fabricacion;

    public MedicamentosLegal(String marca, String tipo, double precioBase, String pais_fabricacion){
        super(marca, tipo, precioBase);
        this.pais_fabricacion = pais_fabricacion;
    }

    public MedicamentosLegal(){
        pais_fabricacion = PAIS_FABRICACION;
    }

    public MedicamentosLegal(String pais_fabricacion){
        this.pais_fabricacion = pais_fabricacion;
    }

    public String getPais_fabricacion() {
        return pais_fabricacion;
    }
    public void setPais_fabricacion(String pais_fabricacion) {
        this.pais_fabricacion = pais_fabricacion;
    }

    public double calcularPrecio(){
        double precioFinal = super.calcularPrecio();
        
        if (pais_fabricacion == PAIS_FABRICACION){
            precioFinal+=7500;
        }

        return precioFinal;

    }

   
    
}
