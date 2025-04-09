import java.util.Scanner;

// Clase RallyCar
class Rallycar extends Auto {
    private final Scanner sc = new Scanner(System.in);

    public void setTipo() {
        System.out.println("Ingrese tipo de Rally:\nA. WRC (World Rally Car)\nB. Rally 2");
        String opcion = sc.nextLine().toUpperCase();
        this.tipo = switch (opcion) {
            case "A" -> "WRC";
            case "B" -> "Rally 2";
            default -> "Desconocido";
        };
    }

    public void setCaballosDeFuerza() {
        this.caballosDeFuerza = switch (this.tipo) {
            case "WRC" -> "500 HP";
            case "Rally 2" -> "190 HP";
            default -> "Desconocido";
        };
        System.out.println("Caballos: " + this.caballosDeFuerza);
    }

    public void setEquipo() {
        String[] opcionesWRC = {"Toyota GR", "M-Sport Ford", "Hyundai"};
        String[] opcionesRally2 = {"RedBull Skoda", "Scuderia Lancia", "Monster World Rally Team"};

        if (this.tipo.equals("WRC")) {
            this.equipoPropietario = seleccionarEquipo(opcionesWRC);
        } else if (this.tipo.equals("Rally 2")) {
            this.equipoPropietario = seleccionarEquipo(opcionesRally2);
        } else {
            System.out.println("Tipo de rally desconocido. No se puede asignar un equipo.");
            this.equipoPropietario = "Equipo Desconocido";
        }
    }

    private String seleccionarEquipo(String[] opciones) {
        System.out.println("Selecciona tu equipo de " + this.tipo + ":");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((char) ('A' + i) + ". " + opciones[i]);
        }
        String opcion = sc.nextLine().toUpperCase();
        int index = opcion.charAt(0) - 'A';

        return (index >= 0 && index < opciones.length) ? opciones[index] : "Equipo Desconocido";
    }

    @Override
    public void acelerar() {
        System.out.println("Su Auto de Rally acelera a gran velocidad y con precisión.");
    }

    @Override
    public void frenar() {
        System.out.println("Su " + this.tipo + " frena con gran precisión.");
    }

    @Override
    public void sonidoMotor() {
        System.out.println("El motor ruge como un " + this.tipo + ".");
    }
}