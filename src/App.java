
public class App {
    public static void main(String[] args) throws Exception {

        Empleados[] empleados = new Empleados[2];
        empleados[0]=new EmpleadosTiempoCompleto("Juan ", "1301", 40000);
        empleados[1]=new EmpleadosMedioTiempo("José ", "0510", 150, 55);

       for (int i= 0; i < empleados.length; i++) {
        System.out.println("Empleado:"+empleados[i].getnombre()+"salario mensual: $"+empleados[i].calcularSalario());
       }
        
        
       }
        
    }


