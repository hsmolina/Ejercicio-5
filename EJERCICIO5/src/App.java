
/*Importamos el java.util.Scanner */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio Propuesto #17");
        System.out.println(
                "Algoritmo que dado el radio de un c\u00EDrculo enseña el \u00E1rea del c\u00EDrculo y la longitud de la circunferencia.");
        /*
         * Definimos la variable scanner de tipo Scanner para que registre las entradas
         */
        Scanner scanner = new Scanner(System.in);
        /* Pedimos al usuario digitar el radio */
        System.out.print("Ingrese el radio del círculo: ");
        /*
         * Definimos una variable entrada de tipo String que almacenará el dato de
         * entrada, en este caso el área
         */
        String entrada = scanner.nextLine();

        /*
         * Convertimos nuestra variable entrada de tipo String a double para realizar
         * las operaciones aritméticas
         */
        double radio = Double.parseDouble(entrada);

        /*
         * Definimos las variables de tipo double para el área = PI*(RADIO**2) y
         * longitud = 2*PI*RADIO
         */
        double area = Math.PI * (Math.pow(radio, 2)), longitud = 2 * Math.PI * radio;

        /* Damos al usuario los valores de área y longitud de la circunferencia */
        System.out.println("El área del círculo es = " + area);
        System.out.println("La longitud de la circunferencia del círculo es = " + longitud);

    }
}