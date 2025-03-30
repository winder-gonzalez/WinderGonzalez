import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc ;
        boolean estado=true;
        do{
            menu();
            opc=in.nextInt();


        }while(estado);


    }
    public static void menu(){
        System.out.println("---------------------------------------");
        System.out.println("        $    ZOOLOGICO UNIMINUTO    $ ");
        System.out.println("---------------------------------------");
        System.out.println("Bienvenidos al zoologico uniminito ");
        System.out.println("¿Que quieres empezar a ver ?");
        System.out.println("    1)Animales Domesticos ");
        System.out.println("    2)Animales Exoticos  ");

    }

    public void menuDomestico(){
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("      &    ANIMALES DOMESTICOS   & ");
        System.out.println("---------------------------------------");
        System.out.println("¿Que animales te llaman la atencion  ?");
        System.out.println("    1)Perros");
        System.out.println("    2)Ovejas");
        System.out.println("    3)Gallinas");
        int eleccion;

        eleccion= in.nextInt();

        switch (eleccion){
            case 1 -> {
                System.out.println("");

            }


        }
    }

    public void


}