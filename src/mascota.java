public class mascota {

    private String color;
    private String nombre;
    private String edad;
    private String raza;
    private String tipo;
    private String nPatas;
    private String alimentacion;
    private String cubiertaCorporal;
    public mascota(){

    }
    public mascota(String color, String nombre, String edad, String raza, String tipo, String nPatas, String alimentacion, String cubiertaCorporal) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.nPatas = nPatas;
        this.alimentacion = alimentacion;
        this.cubiertaCorporal = cubiertaCorporal;
    }


    public String getColor() {
        return color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getnPatas() {
        return nPatas;
    }

    public void setnPatas(String nPatas) {
        this.nPatas = nPatas;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getCubiertaCorporal() {
        return cubiertaCorporal;
    }

    public void setCubiertaCorporal(String cubiertaCorporal) {
        this.cubiertaCorporal = cubiertaCorporal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
