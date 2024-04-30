import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pelinefilos!!!");

        String nombrePelicula = "Matrix";
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean planBasico = true;
        String sinopsis = """
                
                Una gran película sobre el dominio de las máquinas sobre el hombre
                
                """;

        double notaPromedio=0;

        System.out.println("Película: "+nombrePelicula);
        System.out.println("Fecha de Estreno: "+fechaDeLanzamiento);

        System.out.println("Es plan básico: "+planBasico);
        System.out.println("Descripción: "+sinopsis);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa una nota para la película");
            double notaPeli = teclado.nextDouble();
            notaPromedio=notaPromedio+notaPeli;
        }

        System.out.println("Calificación: "+ notaPromedio/3);
    }
}