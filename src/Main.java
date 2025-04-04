import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Monoplaza monoplaza = new Monoplaza();
        RallyCar rallyCar = new RallyCar();

        System.out.println("¿Qué clase desea probar?\nA. Monoplaza\nB. Rally Car");
        String clase = sc.nextLine().toUpperCase();

        switch (clase) {
            case "A" -> {
                monoplaza.setTipo();
                monoplaza.setCaballosDeFuerza();
                monoplaza.setEquipo();
                monoplaza.descripcion();
                monoplaza.acelerar();
                monoplaza.frenar();
                monoplaza.sonidoMotor();
            }
            case "B" -> {
                rallyCar.setTipo();
                rallyCar.setCaballosDeFuerza();
                rallyCar.setEquipo();
                rallyCar.descripcion();
                rallyCar.acelerar();
                rallyCar.frenar();
                rallyCar.sonidoMotor();
            }
            default -> System.out.println("Opción inválida.");
        }
    }
}
