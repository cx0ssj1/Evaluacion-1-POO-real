import java.util.Scanner;

// Clase Monoplaza
class Monoplaza extends Auto {
    private final Scanner sc = new Scanner(System.in);

    public void setTipo() {
        System.out.println("Ingrese tipo de Monoplaza de Fórmula:\nA. Fórmula 1\nB. Fórmula 2");
        String opcion = sc.nextLine().toUpperCase();
        this.tipo = switch (opcion) {
            case "A" -> "Fórmula 1";
            case "B" -> "Fórmula 2";
            default -> "Desconocido";
        };
    }

    public void setCaballosDeFuerza() {
        this.caballosDeFuerza = "1000 HP";
        System.out.println("Caballos: " + this.caballosDeFuerza);
    }

    public void setEquipo() {
        String[] equipos = {"RedBull Racing", "Scuderia Ferrari", "Aston Martin"};
        this.equipoPropietario = seleccionarEquipo(equipos);
    }

    private String seleccionarEquipo(String[] opciones) {
        System.out.println("Selecciona tu equipo:");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((char) ('A' + i) + ". " + opciones[i]);
        }
        String opcion = sc.nextLine().toUpperCase();
        int index = opcion.charAt(0) - 'A';

        return (index >= 0 && index < opciones.length) ? opciones[index] : "Equipo Desconocido";
    }

    @Override
    public void acelerar() {
        System.out.println("El monoplaza acelera a gran velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("El monoplaza " + this.tipo + " frena con gran precisión.");
    }

    @Override
    public void sonidoMotor() {
        System.out.println("El motor ruge como un " + this.tipo + ".");
    }
}