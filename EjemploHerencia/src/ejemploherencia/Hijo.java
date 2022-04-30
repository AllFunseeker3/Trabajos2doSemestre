package ejemploherencia;
public class Hijo extends Padre{
    private int edad;
    private String nombre;
    Hijo(int edad, String nombre){
        super();
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrar_datos_personales(){
        System.out.println("Nombre: " +nombre+
                            "\nEdad: "+edad+
                            "\nAltura: "+altura+
                            "\nConstitucion fisica: "+constitucion_fisica+
                            "\nOjos: "+ojos+ 
                            "\nPiel: "+piel+
                            "\nCabello: "+cabello);    
    
    }
    
}
