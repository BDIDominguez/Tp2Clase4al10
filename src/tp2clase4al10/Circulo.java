/*
 En un nuevo proyecto, crear una clase de nombre Circulo, con los atributos PI que es una
constante con el valor 3.14 y radio; un constructor que permita inicializar el radio del círculo; los
métodos “get” y “set” para radio y los siguientes métodos adicionales:
 calcularArea(): este método retornará la superficie del círculo.
 calcularPerímetro(): este método retornará el perímetro del círculo.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

a) Crear un objeto Circulo con radio 5.75 ;
Luego utilizando sus métodos:
b) Mostrar por consola su perímetro
c) Mostrar por consola su superficie.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */
public class Circulo {
    private double pi = 3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return pi * (radio*radio);
    }
    public double calcularPerímetro(){
        return 2*pi*radio;
    }
}
