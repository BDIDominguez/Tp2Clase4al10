/*
 En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
 esPrimo(): Este método recibe un número entero y retorna true si el número recibido es primo, caso contrario retornará false.
 valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
 calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo grado y mostrará por consola sus raíces y si no las tiene también lo informará.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Calculo:
a) Informar por consola si un número escogido por usted es primo o no.
b) Mostrar por consola el valor absoluto del valor -90;
c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */
public class Calculo {
    
    
    public static boolean esPrimo(int numero){
        int contador = 0;
        for (int i = 2;i<numero;++i){
            if (numero % i == 0)
                ++contador;
        }
        return (contador <= 1);
    }
    public static double valorAbsoluto(double numero){
        if (numero<0){
            return numero*(-1);
        }else{
            return numero;
        }
    } 
    public static void calcularRices(double a, double b, double c) {
        System.out.println("La ecuacion cuadratica " + a + "^2 + " + b + " + " + c + " = X");
        if (a == 0) {
            double discriminante = (Math.pow(b, 2)) - (4 * a * c);
            if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones en el campo de los numeros reales");
            } else {
                if (discriminante == 0) {
                    System.out.println("Raiz unica x1 = " + (-b / (2 * a)));
                } else {
                    System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 * a));
                    System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 * a));
                }
            }
        } else {
            System.out.println("La ecuacion no tiene solucion por a = 0");
        }
    }
}
