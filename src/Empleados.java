
abstract class Empleados {
    private String nombre;
    private String numeroIdentificacion;
     
    public Empleados(String nombre, String numeroIdentificacion){
        this.nombre=nombre;
        this.numeroIdentificacion=numeroIdentificacion;
    }
    public String getnombre(){
        return nombre;
    }
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    
    public abstract double calcularSalario();

}
