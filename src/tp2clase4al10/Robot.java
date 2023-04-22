/*
    En un nuevo proyecto, crear una clase de nombre Robot con los atributos: 
    batería inicializado en 500 unidades de energía y nombre; un constructor 
    que permita inicializar únicamente a su atributo nombre; los métodos 
    getter y setter para sus atributos y los siguientes métodos adicionales:
     avanzar(): Este método recibirá la cantidad de pasos que deberá dar el
       robot, sabiendo que por cada 100 pasos consume 10 unidades de energía 
       y que sólo avanzará si hay batería suficiente.
     bateriaVacia(): Este método retornará true, sólo cuando la batería 
       quede con un valor menor o igual a cero.
    Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
    a) Crear un objeto Robot de nombre “Tito”
       Luego utilizando sus métodos:
    b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */

public class Robot {
    private double bateria = 500;
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanzar(double pasos){
        if ((bateria*10)<pasos){
            System.out.println("No se tiene suficiente energia para avanzar " + pasos + " pasos");
        }else{
            System.out.println("Avanzado " + pasos + " Pasos ....");
            bateria = bateria - (pasos/10);
            if (bateria<1.0){
                bateria = 0;
            }
        }
    }
    public boolean bateriaVacia(){
        return bateria <= 0;
        
    }
}
