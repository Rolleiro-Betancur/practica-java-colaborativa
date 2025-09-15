public class Producto {

    private int id;
    private String nombre;
    private float precio;
    private String tipo;
    private  String stock;

    public Producto(int id, String nombre, float precio, String tipo, String stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.stock=stock;
    }
    public void actualizarstock (String stock){
        this.stock=stock;
    }
    public int getId() {
        return id;
    }

}
