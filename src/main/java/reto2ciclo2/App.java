package reto2ciclo2;

import reto2ciclo2.logica.Factura3;
import reto2ciclo2.logica.Medicamentos;
import reto2ciclo2.logica.MedicamentosLegal;
import reto2ciclo2.logica.MedicamentosNatural;

public class App {
    
    public static void main( String[] args ){

        Medicamentos medicamentos[]=new Medicamentos[5]; medicamentos[0]=new Medicamentos("Pfizer", "Pastillas", 5000); medicamentos[1]=new MedicamentosLegal("Armeca", "Capsulas", 7500, "Alemania"); medicamentos[2]=new MedicamentosNatural(8); medicamentos[3]=new Medicamentos(); medicamentos[4]=new MedicamentosLegal("Colombina"); Factura3 solucion = new Factura3(medicamentos); solucion.mostrarTotales(); 
    }
    
}
