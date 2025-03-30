public abstract class Animal {
    protected String color;
    protected String nombre;
    protected int edad;
    protected String raza;
    protected String tipo;
    protected int nPatas;
    protected Alimentacion alimentacion;
    protected String cubiertaCorporal;
    protected String habilidad;
    protected String comida;

    public Animal(String color, String nombre, int edad, String raza, String tipo, int nPatas, Alimentacion alimentacion, String cubiertaCorporal, String habilidad) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
        this.nPatas = nPatas;
        this.alimentacion = alimentacion;
        this.cubiertaCorporal = cubiertaCorporal;
        this.habilidad = habilidad;
    }

    enum Alimentacion{
        Herviboro,Carnivoro,Omnivoro;
    }


    public abstract String ejemploAlimentacion(Alimentacion tipo);

    public String getColor() {
        return color;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }


    public String getCubiertaCorporal() {
        return cubiertaCorporal;
    }

    public void setCubiertaCorporal(String cubiertaCorporal) {
        this.cubiertaCorporal = cubiertaCorporal;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
