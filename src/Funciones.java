import java.util.Scanner;

/**
 * Funciones utilizadas en la clase Main
 */
public class Funciones {
    /**
     * Comprueba si el sueldo está entre 1000 y 1750
     *
     * @param sueldo del trabajador
     * @return si está dentro del rango
     */
    public static Boolean obtenerSueldo1750(Double sueldo) {
        if (sueldo > 1000 && sueldo < 1750) {
            return true;
        }
        return false;
    }

    /**
     * Comprueba si el sueldo es menor que mil
     *
     * @param sueldo del trabajador
     * @return si es menor que mil
     */
    public static Boolean obtenerSueldo1000(Double sueldo) {
        if (sueldo > 0 && sueldo < 1000) {
            return true;
        }
        return false;
    }

    /**
     * Alta trabajador
     *
     * @return trabajador creado
     */
    public static Trabajador darAltaTrabajador() {
        Trabajador obxTrabajador = new Trabajador();
        //obxTrabajador.setNombre("Pepe");
        //obxTrabajador.setSueldo(1200d);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre?");
        obxTrabajador.setNombre(sc.nextLine());
        System.out.println("Sueldo?");
        obxTrabajador.setSueldo(sc.nextDouble());

        return obxTrabajador;
    }
}
