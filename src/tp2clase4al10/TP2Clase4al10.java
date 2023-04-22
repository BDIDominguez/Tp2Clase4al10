/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2clase4al10;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class TP2Clase4al10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int vResp;
        do {
            System.out.println("*************** Menu ***********");
            System.out.println("Trabajo 1 Numero");
            System.out.println("Trabajo 2 Cuadrilatero");
            System.out.println("Trabajo 3 Circulo");
            System.out.println("Trabajo 4 Conversor de Divisas");
            System.out.println("Trabajo 5 Utilitario");
            System.out.println("Trabajo 6 Triangulo");
            System.out.println("Trabajo 7 Robot");
            System.out.println("Trabajo 8 Calculo");
            System.out.println("Trabajo 9 Fecha");
            System.out.println("Trabajo 10 Pensador");
            System.out.println("Ingrese 0 para terminar");
            vResp = leer.nextInt();
            switch (vResp) {
                case 0:
                    break;
                case 1:
                    /*
                Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
                    a) Crear un objeto Numero con el valor 1459
                Luego utilizando sus métodos:
                    b) Mostrar por consola si es par o no.
                    c) Mostrar por consola si es positivo o no.
                    d) Mostrar por consola si es múltiplo de 3.
                     */
                    Numero vN = new Numero(1459);
                    System.out.println("El Numero es PAR: " + vN.esPar());
                    System.out.println("El Numero es Positivo: " + vN.esPositivo());
                    System.out.println("El Numero es Multiplo de 3: " + vN.esMultiploDe(3));
                    break;

                case 2:
                    /*a) Crear un objeto Cuadrilatero con largo 70 y altura 50;
                    Luego utilizando sus métodos:
                  a) Mostrar por consola su perímetro
                  b) Mostrar por consola su superficie.
                  c) Mostrar por consola si es un cuadrado o no.
                  d) Cambiar el estado de uno de sus atributos para que sea un cuadrado.
                     */
                    Cuadrilatero figura = new Cuadrilatero(70, 50);
                    System.out.println("El perimetro es de " + figura.calcularPerimetro());
                    System.out.println("La superficie de la figura es de " + figura.calcularArea());
                    System.out.println("La figura es un cuadrado? " + figura.esUnCuadrado());
                    figura.setLargo(50);
                    System.out.println("La figura es un cuadrado? " + figura.esUnCuadrado());
                    break;
                case 3:

                    /*  
                    a) Crear un objeto Circulo con radio 5.75 ;
                       Luego utilizando sus métodos:
                    b) Mostrar por consola su perímetro
                    c) Mostrar por consola su superficie.
                     */
                    Circulo fig = new Circulo(5.75);
                    System.out.println("El perimetro del circulo es de " + fig.calcularPerímetro());
                    System.out.println("La superficie del circulo es " + fig.calcularArea());
                    break;
                case 4:
                    /*  
                    a) Convertir 500 dólares a pesos y mostrar por consola lo convertido.
                    b) Convertir 25700 pesos a dólares y mostrar por consola lo convertido.
                     */
                    //Conversor moneda = new Conversor(); Los metodos estaticos se configuran para ser usados sin la creacion del objeto
                    Conversor.convertirAPesos(500, 400);
                    Conversor.convertirADolar(25700, 400);
                    break;
                case 5:
                    /*
                a) Dibujar un cuadrado de 5 elementos.
                b) Mostrar el mayor entre (20,75 y 40)
                c) Mostrar el nombre del día 5.
                     */
                    // Utilitario nuevo = new Utilitario();
                    Utilitario.dibujaCuadrado(5);
                    Utilitario.elMayorEs(20, 75, 40);
                    Utilitario.elMayorEs(20, 20, 20);
                    System.out.println("El dia 5 " + Utilitario.elDiaEs(5));
                    System.out.println("El dia 8 " + Utilitario.elDiaEs(8));
                    break;
                case 6:
                    /*
                a) Crear un objeto Triángulo válido.
                Luego utilizando sus métodos:
                b) Mostrar por consola que tipo de triángulo es.
                c) Crear un objeto Triángulo inválido.
                    Luego utilizando sus métodos:
                 d) Mostrar por consola que tipo de triangulo es.
                     */
                    Triangulo tria = new Triangulo(20, 20, 0);
                    System.out.println("Es un triangulo: " + tria.esUnTriangulo());
                    System.out.println(tria.tipoTriangulo());
                case 7:
                    /*
                Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
                a) Crear un objeto Robot de nombre “Tito”
                    Luego utilizando sus métodos:
                b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
                     */
                    Robot tito = new Robot("Tito");
                    System.out.println("Nivel de Bateria Inicial: " + tito.getBateria());
                    while (!tito.bateriaVacia()) {
                        tito.avanzar(2);
                        // System.out.println("Nivel de Bateria Inicial: " + tito.getBateria());
                    }
                    System.out.println("Nivel de Bateria Final: " + tito.getBateria());
                case 8:
                    /*
                Utilizando los métodos estáticos de la clase Calculo:
                a) Informar por consola si un número escogido por usted es primo o no.
                b) Mostrar por consola el valor absoluto del valor -90;
                c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
                     */
                    //System.out.println("Ingrese un numero: ");
                    //int vNumero = leer.nextInt();
                    System.out.println("El numero ingresado es primo? " + Calculo.esPrimo(10));
                    System.out.println("El valor absoluto de -90 es " + Calculo.valorAbsoluto(-90));
                    Calculo.calcularRices(1, 0, 9);
                    break;
                case 9:
                    /*
                Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
                a) Crear dos objetos de tipo fecha.
                    Utilizando sus métodos:
                b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
                c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
                     */
                    Fecha fec1 = new Fecha(1983, 9, 26);
                    Fecha fec2 = new Fecha(1984, 9, 26);
                    System.out.println("EL año de la fecha 1 es biciesto: " + fec1.esBisiesto());
                    System.out.println("EL año de la fecha 2 es biciesto: " + fec2.esBisiesto());
                    System.out.println("Los años transcurridos entre las fechas 1 y 2 es de: " + fec1.calcularAños(fec2.getAño(), fec2.getMes(), fec2.getAño()));
                    System.out.println("Los años transcurridos entre las fechas 1 y 2 es de: " + fec1.calcularAños1(fec2));
                    break;
                case 10:
                    /*
                Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
                a) Crear una instancia de la clase Pensador.
                b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
                     */

                    Pensador pensante = new Pensador(3916);
                    System.out.println("Creando Objeto con Valor " + pensante.getValor());
                    System.out.println("Invertido " + pensante.invertir());
                    System.out.println("Par Anterior " + pensante.parAntes());
                    System.out.println("Par Posterior " + pensante.parPosterior());
                    System.out.println("Primer Digito " + pensante.primerDigito());
                    System.out.println("Ultimo Digito " + pensante.ultimoDigito());

                    break;

                default:
                    System.out.println("NO EXISTE ESA OPCION CIEGO!!!!");
                    break;
            }

        } while (vResp != 0);
        
        
        
    }
}
