import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mascota mascota1 = new mascota();
        mascota1.setColor("Cafe");
        mascota1.setNombre("Princesa");
        mascota1.setRaza("Golden Retriever");
        mascota1.setTipo("Perra");

        mascota mascota2 = new mascota();
        mascota2.setColor("Blanco");
        mascota2.setNombre("Mimi");
        mascota2.setRaza("Maine Coon");
        mascota2.setTipo("Gata");

        mascota mascota3 = new mascota();
        mascota3.setColor("Amarillo");
        mascota3.setNombre("Spike");
        mascota3.setRaza("Sirio");
        mascota3.setTipo("Hamster");
        System.out.println("-----------------------------------------------");
        System.out.println(mascota1.getTipo()+" "+mascota1.getNombre());
        System.out.println("Raza : "+mascota1.getRaza());
        System.out.println("Color : "+mascota1.getColor());
        System.out.println("-----------------------------------------------");
        System.out.println(mascota2.getTipo()+" "+mascota2.getNombre());
        System.out.println("Raza : "+mascota2.getRaza());
        System.out.println("Color : "+mascota2.getColor());
        System.out.println("-----------------------------------------------");
        System.out.println(mascota3.getTipo()+" "+mascota3.getNombre());
        System.out.println("Raza : "+mascota3.getRaza());
        System.out.println("Color : "+mascota3.getColor());


    }


}