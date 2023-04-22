/*
 En un nuevo proyecto, crear una clase de nombre Pensador con un atributo
 que almacenará un valor entero; un constructor que permita inicializar 
 dicho atributo; los métodos get y set para dicho atributo y los siguientes 
 métodos adicionales:
 invertir(): Este método retornará el valor guardado en el atributo con 
   sus cifras invertidas. Por ejemplo si el valor guardado es 3915, retornará 5193
 parAntes(): Este método retornará el valor par próximo anterior al valor guar
 parPosterior(): Este método retornará el valor par próximo posterior al valor guardado.
 primerDigito(): Este método retornará el primer dígito del valor guardado.
 ultimoDigito(): Este método retornará el último dígito del valor guardado.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear una instancia de la clase Pensador.
b) Probar todos sus métodos y mostrar por consola los resultados obtenidos.
 */
package tp2clase4al10;

/**
 *
 * @author Dario
 */
public class Pensador {
    private int valor;

    public Pensador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int invertir(){
        int invertido = 0,resto,valor1 = valor;
        while (valor1 > 0){
            resto = valor1 % 10;
            invertido = invertido * 10 + resto;
            valor1 /= 10;
        }
        return invertido;
    }
    
    public int parAntes(){
        boolean bandera = true;
        int  valor1 = valor;
        while (bandera){
            //System.out.println("Valor del indice " + valor1 );
            --valor1;
            if (valor1 % 2 == 0){
                bandera = false;
            }
        }
        return valor1;
    }
    
    public int parPosterior(){
        boolean bandera = true;
        int valor1 = valor;
        while (bandera){
            ++valor1;
            if (valor1 % 2 == 0){
                bandera = false;
            }
        }
        return valor1;
    }
    public int ultimoDigito(){
        int valor1;
        valor1 = valor / 10;
        valor1 = valor1 * 10;
        return valor - valor1;
    }
    public int primerDigito(){
        int valor1 = valor;
        while (valor1>=10){
            valor1 = valor1 / 10;
        }
        return valor1;
    }
}
