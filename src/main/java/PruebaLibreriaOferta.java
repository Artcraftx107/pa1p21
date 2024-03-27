import libreria.*;
public class PruebaLibreriaOferta {
    public static void main(String[] args){
        LibreriaOferta autoresOferta;
        autoresOferta = new LibreriaOferta(20.0, new String[]{"George Orwell", "Isaac Asimov"});
        autoresOferta.addLibro("george orwell", "1984", 8.20);
        autoresOferta.addLibro("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?", 3.50);
        autoresOferta.addLibro("Isaac Asimov", "Fundación e Imperio", 9.40);
        autoresOferta.addLibro("Ray Bradbury", "Fahrenheit 451", 7.40);
        autoresOferta.addLibro("Aldous Huxley", "Un Mundo Feliz", 6.50);
        autoresOferta.addLibro("Isaac Asimov", "La Fundación", 7.30);
        autoresOferta.addLibro("William Gibson", "Neuromante", 8.30);
        autoresOferta.addLibro("Isaac Asimov", "Segunda Fundación", 8.10);
        autoresOferta.addLibro("Isaac Newton", "arithmetica universalis", 7.50);
        autoresOferta.addLibro("George Orwell", "1984", 6.20);
        autoresOferta.addLibro("Isaac Newton", "Arithmetica Universalis", 10.50);
        System.out.println(autoresOferta);
        autoresOferta.remLibro("George Orwell", "1984");
        autoresOferta.remLibro("Aldous Huxley", "Un Mundo Feliz");
        autoresOferta.remLibro("Isaac Newton", "Arithmetica Universalis");
        System.out.println(autoresOferta);
        System.out.println("PrecioFinal(Philip K. Dick, ¿Sueñan los androides con ovejas eléctricas?): "+autoresOferta.getPrecioFinal("Philip K. Dick", "¿Sueñan los androides con ovejas eléctricas?"));
        System.out.println("PrecioFinal(isaac asimov, fundación e imperio): "+autoresOferta.getPrecioFinal("isaac asimov", "fundación e imperio"));
        System.out.println("PrecioFinal(Ray Bradbury, Fahrenheit 451): "+autoresOferta.getPrecioFinal("Ray Bradbury", "Fahrenheit 451"));
        System.out.println("PrecioFinal(Isaac Asimov, La Fundación): "+autoresOferta.getPrecioFinal("Isaac Asimov", "La Fundación"));
        System.out.println("PrecioFinal(william gibson, neuromante): "+autoresOferta.getPrecioFinal("william gibson", "neuromante"));
        System.out.println("PrecioFinal(Isaac Asimov, Segunda Fundación): "+autoresOferta.getPrecioFinal("Isaac Asimov", "Segunda Fundación"));
        System.out.println("PrecioFinal(Isaac Newton, Arithmetica Universalis): "+autoresOferta.getPrecioFinal("Isaac Newton", "Arithmetica Universalis"));
    }
}
