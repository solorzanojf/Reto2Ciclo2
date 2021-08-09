package reto2ciclo2.logica;

public class MedicamentosNatural extends Medicamentos{
    private final static int NUMERO_UNIDADES= 8;
    
    private int numero_unidades;

    public MedicamentosNatural(String marca, String tipo, double precioBase, int numero_unidades){
        super(marca, tipo, precioBase);
        this.numero_unidades = numero_unidades;
    }

    public MedicamentosNatural(){
        this.numero_unidades = NUMERO_UNIDADES;
    }

    MedicamentosNatural(int numero_unidades){
        this.numero_unidades = numero_unidades;
    }

    public static int getNumeroUnidades() {
        return NUMERO_UNIDADES;
    }

    public void setNumero_unidades(int numero_unidades) {
        this.numero_unidades = numero_unidades;
    }

    public double calcularPrecio(){
        double precioFinal = super.calcularPrecio();
        
        if (numero_unidades<10){
            precioFinal+=11000;
        }else{
            precioFinal+=15000;
        }

        return precioFinal;

    }

   
    
}
