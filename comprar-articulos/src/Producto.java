public class Producto {
    private int codigo;
    private String nombre;
    private double precio;

    public Producto( int codigo, String nombre, double precio ){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(){

    }
    
    public Producto( int codigo, String nombre ){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // conmutadores
    public String getNombre(){
        return nombre;
    }
    public void setNombre( String nombre ){
        this.nombre =  nombre;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo( int codigo ){
        this.codigo =  codigo;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio( double precio ){
        this.precio =  precio;
    }


    @Override
    public String toString(){
        return "Precio" + precio;
    }
}
