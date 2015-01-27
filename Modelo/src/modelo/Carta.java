package modelo;

import java.io.Serializable;

public class Carta implements Serializable{
    
    //<editor-fold defaultstate="collapsed" desc=" Constructor">

    public Carta(String DIRECCION_CARTA, String tipo, int numero) {
        this.DIRECCION_CARTA = DIRECCION_CARTA;
        this.tipo = tipo;
        this.numero = numero;
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos">

    public String getDIRECCION_CARTA() {
        return DIRECCION_CARTA;
    }

    public int getNumero() {
        return numero;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    // Este set solo tiene utilidad para el As
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        return s.append(numero).append(" de ").append(tipo).toString();
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Atributos">
    
    private String DIRECCION_CARTA;
    private String tipo;
    private int numero;
    // </editor-fold>
}
