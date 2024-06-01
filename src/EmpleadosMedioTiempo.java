
public class EmpleadosMedioTiempo extends Empleados {
    private double salarioporHora;
    private int horasTrabajadasporSemana;

    public EmpleadosMedioTiempo(String nombre, String numeroIdentificacion, double salarioporHora, int horasTrabajadasporSemana){
        super(nombre, numeroIdentificacion);
        this.salarioporHora= salarioporHora;
        this.horasTrabajadasporSemana=horasTrabajadasporSemana;
    }
     @Override
     public double calcularSalario(){
        return salarioporHora*horasTrabajadasporSemana*4;
     }


}
