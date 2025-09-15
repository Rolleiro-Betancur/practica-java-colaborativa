public class Producto {

    private int id;
    private String nombre;
    private float precio;
    private String tipo;

    public Producto(int id, String nombre, float precio, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    //Metodo para calcular descuento Juan Buitrago
    public double calcularDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("El porcentaje de descuento no es válido.");
            return precio;
        }
        double descuento = precio * (porcentaje / 100);
        return precio - descuento;
    }

}
