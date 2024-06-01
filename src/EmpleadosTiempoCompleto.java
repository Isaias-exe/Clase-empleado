
public class EmpleadosTiempoCompleto extends Empleados {
    private double salarioAnual;
    
    public EmpleadosTiempoCompleto(String nombre, String numeroIdentificacion, double salarioAnual){
        super(nombre, numeroIdentificacion);
        this.salarioAnual=salarioAnual;
    }
    @Override
    public double calcularSalario(){
        return salarioAnual;
    }

}