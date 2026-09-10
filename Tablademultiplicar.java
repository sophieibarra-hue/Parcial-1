import java.util.Scanner;

public class Tablademultiplicar {

    public static void main(String[] args) {
        try (Scanner lol = new Scanner(System.in)) {
            System.out.println("--- Bienvenido a la tabla de multiplicar --- Ingrese el numero que del 1 al 10");
            int numero = lol.nextInt();
            
            System.out.println(" --- Tabla de multiplicar del número: ---" + numero );
            
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " * " + i +  " = " + resultado);
            }   }
}
}