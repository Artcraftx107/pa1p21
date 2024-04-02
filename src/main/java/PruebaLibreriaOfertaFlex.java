import libreria.*;
public class PruebaLibreriaOfertaFlex {
    public static void main(String[] args){
        OfertaAutor autoresEnOferta;
        LibreriaOfertaFlex libreriaOfertaFlex;
        autoresEnOferta = new OfertaAutor(20.0, new String[]{"George Orwell", "Isaac Asimov"});
        libreriaOfertaFlex=new LibreriaOfertaFlex(autoresEnOferta);
        libreriaOfertaFlex.addLibro("george orwell", "1984", 8.20);
        libreriaOfertaFlex.addLibro("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
        libreriaOfertaFlex.addLibro("Isaac Asimov", "Fundación e Imperio", 9.40);
        libreriaOfertaFlex.addLibro("Ray Bradbury", "Fahrenheit 451", 7.40);
        libreriaOfertaFlex.addLibro("Aldous Huxley", "Un Mundo Feliz", 6.50);
        libreriaOfertaFlex.addLibro("Isaac Asimov", "La Fundación", 7.30);
        libreriaOfertaFlex.addLibro("William Gibson", "Neuromante", 8.30);
        libreriaOfertaFlex.addLibro("Isaac Asimov", "Segunda Fundación", 8.10);
        libreriaOfertaFlex.addLibro("Isaac Newton", "arithmetica universalis", 7.50);
        libreriaOfertaFlex.addLibro("George Orwell", "1984", 6.20);
        libreriaOfertaFlex.addLibro("Isaac Newton", "Arithmetica Universalis", 10.50);
        System.out.println(libreriaOfertaFlex);
        libreriaOfertaFlex.remLibro("George Orwell", "1984");
        libreriaOfertaFlex.remLibro("Aldous Huxley", "Un Mundo Feliz");
        libreriaOfertaFlex.remLibro("Isaac Newton", "Arithmetica Universalis");
        System.out.println(libreriaOfertaFlex);
        System.out.println("PrecioFinal(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?): "+libreriaOfertaFlex.getPrecioFinal("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
        System.out.println("PrecioFinal(isaac asimov, fundación e imperio): "+libreriaOfertaFlex.getPrecioFinal("isaac asimov", "fundación e imperio"));
        System.out.println("PrecioFinal(Ray Bradbury, Fahrenheit 451): "+libreriaOfertaFlex.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
        System.out.println("PrecioFinal(Isaac Asimov, La Fundación): "+libreriaOfertaFlex.getPrecioFinal("Isaac Asimov", "La Fundación"));
        System.out.println("PrecioFinal(william gibson, neuromante): "+libreriaOfertaFlex.getPrecioFinal("william gibson", "neuromante"));
        System.out.println("PrecioFinal(Isaac Asimov, Segunda Fundación): "+libreriaOfertaFlex.getPrecioFinal("Isaac Asimov", "Segunda Fundación"));
        System.out.println("Isaac Newton, Arithmetica Universalis): "+libreriaOfertaFlex.getPrecioFinal("Isaac Newton", "Arithmetica Universalis"));
    }
}
