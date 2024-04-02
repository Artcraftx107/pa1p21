package libreria;

public class OfertaPrecio implements OfertaFlex{
    private double porcDescuento;
    private double umbralPrecio;
    public OfertaPrecio(double disc, double pbase){
        this.porcDescuento=disc;
        this.umbralPrecio=pbase;
    }

    @Override
    public double getDescuento(Libro l) {
        double descuento;
        if(l.getPrecioBase()<umbralPrecio){
            descuento=0;
        }else{
            descuento=porcDescuento;
        }
        return descuento;
    }

    @Override
    public String toString() {
        return porcDescuento+"%"+"("+umbralPrecio+")";
    }
}
