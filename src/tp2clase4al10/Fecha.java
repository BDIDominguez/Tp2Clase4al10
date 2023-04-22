/*
 En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes atributos:
dia, mes, año; un constructor que permita inicializar a todos sus atributos; 
los métodos getter y setter para sus atributos y los siguientes métodos adicionales:
 esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto;
caso contrario retornará false.
 calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un 
entero que será la cantidad de años transcurridos entre esta Fecha y la que 
recibe por parámetro.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear dos objetos de tipo fecha.
Utilizando sus métodos:
b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */
public class Fecha {
    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public boolean esBisiesto(){
        if(año % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public int calcularAños(int año,int mes,int dia){
        if (this.mes > mes){
            return año - this.año;
        }else{
            if (this.mes == mes){
                if (this.dia >= dia){
                    return año - this.año ;
                }else{
                    return año - 1 - this.año ;
                }
            }else{
                return año - this.año - 1;
            }
        }
            
    }
    public int calcularAños1(Fecha nueva){
        if (this.mes > nueva.mes){
            return nueva.año - this.año;
        }else{
            if (this.mes == nueva.mes){
                if (this.dia >= nueva.dia){
                    return nueva.año - this.año ;
                }else{
                    return nueva.año - 1 - this.año ;
                }
            }else{
                return nueva.año - this.año - 1;
            }
        }
            
    }
}
