package libreria;
public class LibreriaOfertaFlex extends Libreria {
    private OfertaFlex flexed;
    public LibreriaOfertaFlex(OfertaFlex ofertaFlex){
        super();
        this.flexed=ofertaFlex;
    }
    public void setOferta(OfertaFlex flex){
        this.flexed=flex;
    }
    public OfertaFlex getOferta(){
        return flexed;
    }

    @Override
    public void addLibro(String a, String t, double p) {
        Libro aux = new Libro(a, t, p);
        double descuento = flexed.getDescuento(aux);
        if(descuento!=0){
            LibroOferta libroOferta = new LibroOferta(a, t, p, descuento);
            anyadirLibro(libroOferta);
        }else{
            anyadirLibro(aux);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(flexed.toString());

        // Obtener la representación textual de la lista de libros utilizando el método toString() de Libreria
        String librosTexto = super.toString();

        // Agregar la representación textual de la lista de libros a la salida final
        builder.append(librosTexto);

        return builder.toString();
    }
}
