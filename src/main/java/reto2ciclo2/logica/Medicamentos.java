package reto2ciclo2.logica;


public class Medicamentos {

    private final static String MARCA="Pfizer";
    private final static String TIPO ="Pastillas";
    private final static double PRECIO_BASE=10000;


    private String marca;
    private String tipo;
    private Double precioBase;

    public Medicamentos(){
        marca = MARCA;
        tipo = TIPO;
        precioBase = PRECIO_BASE;
    }

    public Medicamentos(String marca, String tipo, double precioBase){
        this.marca=marca;
        this.tipo=tipo;
        this.precioBase=precioBase;
    }

    public Medicamentos(String marca){
        this.marca = marca;
        tipo = TIPO;
        precioBase = PRECIO_BASE;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularPrecio(){
        double precioFinal = precioBase;
        if (marca == MARCA){
            
            precioFinal+= (precioFinal*0.4);
        }else{
            precioFinal+= (precioFinal*0.1);
        }

        if (tipo==TIPO){
            if ((precioFinal-550)>0){
                precioFinal-=550;
                return precioFinal;
            }else{
                return precioFinal;
            }

        }else{
            if ((precioFinal-2000)>0){
                precioFinal-=2000;
                return precioFinal;
            }else{
                return precioFinal;
            }
        }
    }

}