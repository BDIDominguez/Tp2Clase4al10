/*
 En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
 dibujaCuadrado(): Este método recibe un número entero N, y dibujará un
cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*     *
*     *
* * * *

 elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el
mayor. En caso de ser iguales lo deberá informar.
 elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que
corresponderá a un día de la semana, retornando el nombre que le corresponda, por
ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7
Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

Utilizando los métodos estáticos de Utilitario:
a) Dibujar un cuadrado de 5 elementos.
b) Mostrar el mayor entre (20,75 y 40)
c) Mostrar el nombre del día 5.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */
public class Utilitario {
    
    public static void dibujaCuadrado(int vNumero){
        System.out.println("Dibujando un Cuadrado");
        for (int i=1;i<=vNumero; ++i){
            for (int b=1;b<=vNumero; ++b){
                if (i!=1 && i!= vNumero) {
                    if (b==1 || b == vNumero ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print("*");
                }
                
                if (b == vNumero){
                    System.out.println(" ");
                }
            }
        }
    }
    public static void elMayorEs(int n1, int n2, int n3){
        if (n1 == n2 && n2 == n3) {
            System.out.println("de los numero ingresador (" + n1 + "," + n2 + "," + n3 + ") son iguales");
        } else {

            if (n1 > n2) {
                if (n1 > n3) {
                    System.out.println("de los numero ingresador (" + n1 + "," + n2 + "," + n3 + ") el mator es " + n1);
                } else {
                    System.out.println("de los numero ingresador (" + n1 + "," + n2 + "," + n3 + ") el mator es " + n3);
                }
            } else {
                if (n2 > n3) {
                    System.out.println("de los numero ingresador (" + n1 + "," + n2 + "," + n3 + ") el mator es " + n2);
                } else {
                    System.out.println("de los numero ingresador (" + n1 + "," + n2 + "," + n3 + ") el mator es " + n3);
                }
            }
        }
    }
    public static String elDiaEs(int numero) {
        String[] dia = {"lunes","martes","miercoles","Jueves","Viernes","Sabado","Domingo"};
        /* switch (numero) {   
            case 1:
                return "es Lunes";
            case 2:
                return "es Martes";
            case 3:
                return "es Miercoles";
            case 4:
                return "es Jueves";
            case 5:
                return "es Viernes";
            case 6:
                return "es Sabado";
            case 7:
                return "es Domingo";
            default:
                return "no existe";
        }*/
        if (numero>= 1 && numero <=7){
            return dia[numero-1];
        }else{
            return "No existe ese día!!!";
        }
    }
}