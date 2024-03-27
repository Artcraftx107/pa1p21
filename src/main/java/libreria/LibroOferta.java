package libreria;

public class LibroOferta extends Libro{
    private double porcDescuento;

    public LibroOferta(String a, String b, double p, double desc){
        super(a, b, p);
        if(a==""||b==""){
            throw new IllegalArgumentException("Ninguno de los dos espacios (autor o titulo) puede estar vacio.");
        }
        if(p<0){
            throw new IllegalArgumentException("El precio no puede ser inferior a 0.");
        }
        this.porcDescuento=desc;
    }

    public double getDescuento() {
        return porcDescuento;
    }

    @Override
    protected double getBaseImponible() {
        return super.getBaseImponible()-super.getBaseImponible()*(porcDescuento/100);
    }

    @Override
    public String toString() {
        return "("+super.getAutor()+"; "+super.getTitulo()+"; "+super.getPrecioBase()+"; "+ getDescuento()+"%; "+getBaseImponible()+"; "+super.getIVA()+"%; "+super.getPrecioFinal()+")";
    }
}
