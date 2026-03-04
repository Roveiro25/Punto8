public class objProducto{
    private String nombre;
    private double Peso;
    private char tipo;

    public objProducto() {
    }

    public objProducto(double Peso, char tipo, String nombre) {
        this.Peso = Peso;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }


}