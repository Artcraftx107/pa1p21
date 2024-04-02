package libreria;

import java.util.Arrays;

public class OfertaAutor implements OfertaFlex{
    private double porcDescuento;
    private String[] autoresOferta;
    public OfertaAutor(double discount, String[] args){
        this.autoresOferta=args;
        this.porcDescuento=discount;
    }

    @Override
    public double getDescuento(Libro l) {
        double descuento;
        int found = buscarAutorOfertas(l.getAutor());
        if(found != -1){
            descuento=porcDescuento;
        }else{
            descuento=0;
        }
        return descuento;
    }
    private int buscarAutorOfertas(String author){
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

    @Override
    public String toString() {
        return porcDescuento+"%"+ Arrays.toString(autoresOferta);
    }
}
