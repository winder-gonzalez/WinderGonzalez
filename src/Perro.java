import java.sql.SQLOutput;

public class Perro extends Domesticos {

    public Perro(String color, String nombre, int edad, String raza) {
        super(color, nombre, edad, raza, "Perro", 4, Alimentacion.Omnivoro, "piel y pelaje","Olfato Agudo");
    }

}
