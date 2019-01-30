package documentacion;
/**
 * Contiene información de cada empleado
 * @author David
 * @version 1.0
 */
public class Empleado {
    /**
     * Nombre del empleado
     */
    private String  nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;
    
    public boolean plus(double sueldoPlus){
        boolean aumento=false;
        if(edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
    
    //Metodos plublicos
    
    /**
     * Suma un plus al salario del empleado si este tiene mas de 40 años
     * @param sueldoPlus
     * @return <ul>
     *          <li>true: el nombre es una cadena vacia</li>
     *          <li>false: el nombre no es una cadena vacía</li>
     *         </ul>
     */
    
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
    
    public Empleado(){
        this ("","",0,0);
    }
    /**
     * Constructor con cuatro parametros
     * @param nombre nombre del empleado
     * @param apellido apellidos del empleado
     * @param edad eddad del empleado
     * @param salario salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
}
