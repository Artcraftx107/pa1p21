package libreria;

import java.util.Arrays;

public class LibreriaOferta extends Libreria{

    private double porcDescuento;
    String[] autoresOferta;
    public LibreriaOferta(double t, String[] offers){
        super();
        this.porcDescuento=t;
        this.autoresOferta= offers;
    }
    public void setOferta(double oferta, String[] listaOfertas){
        this.porcDescuento = oferta;
        this.autoresOferta = listaOfertas;
    }
    public String[] getOferta(){
        return autoresOferta;
    }
    public double getDescuento(){
        return porcDescuento;
    }
    public void addLibro(String a, String t, double p){
        int encontrado = buscarAutorOferta(a);
        if(encontrado != -1){
            LibroOferta nuevaOferta = new LibroOferta(a, t, p, porcDescuento);
            anyadirLibro(nuevaOferta);
        }else{
            super.addLibro(a, t, p);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(porcDescuento+"%");
        builder.append(Arrays.toString(autoresOferta));

        // Obtener la representación textual de la lista de libros utilizando el método toString() de Libreria
        String librosTexto = super.toString();

        // Agregar la representación textual de la lista de libros a la salida final
        builder.append(librosTexto);

        return builder.toString();
    }
    private int buscarAutorOferta(String author){
        int found = 0;
        boolean encontrado = false;
        while(found<autoresOferta.length && !encontrado){
            String aux = this.autoresOferta[found];
            if(aux.equalsIgnoreCase(author)){
                encontrado = true;
            }else{
                found++;
            }
        }
        if(!encontrado){
            found = -1;
        }
        return found;
    }
}

