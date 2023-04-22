/*
En un nuevo proyecto, crear una clase de nombre Conversor con los siguientes métodos
estáticos:
 convertirAPesos(): recibe un valor en dólares y retorna convertido a pesos argentinos.
 convertirADolar(): recibe un valor en pesos argentinos y retorna convertido a dólar.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Conversor.
a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */
public class Conversor {
   

    public static void convertirAPesos(double valor,double dolar){
        System.out.println("La converson de " + valor + " dolares a pesos es de " + valor * dolar);
    }
    public static void convertirADolar(double valor,double dolar){
        System.out.println("La converson de " + valor + " pesos a dolares es de " + valor / dolar);
    }
}
