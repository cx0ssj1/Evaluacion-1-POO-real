public class Auto {
    protected String tipo;
    protected String equipoPropietario;
    protected String caballosDeFuerza;

    public Auto() {
    }

    public void descripcion() {
        System.out.println("\n\ud83d\ude97 Descripción de su Auto \ud83d\ude97");
        System.out.println("Tipo de Auto: " + this.tipo);
        System.out.println("Equipo propietario: " + this.equipoPropietario);
        System.out.println("Caballos De Fuerza: " + this.caballosDeFuerza);
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    public void sonidoMotor() {
        System.out.println("El motor hace un sonido genérico.");
    }
}
