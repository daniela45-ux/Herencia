// Clase base
public class Vehiculo {
     protected String modelo;
    protected int anio;
    protected double velocidad;

    public Vehiculo(String modelo, int anio) {
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0;
    }

    public void acelerar(double incremento) {
        velocidad += incremento;
        System.out.println(modelo + " acelera a " + velocidad + " km/h");
    }

    public void frenar(double decremento) {
        velocidad -= decremento;
        if (velocidad < 0) velocidad = 0;
        System.out.println(modelo + " frena a " + velocidad + " km/h");
    }

    public void mostrarDetalles() {
        System.out.println("Modelo: " + modelo + ", Anio: " + anio + ", Velocidad: " + velocidad + " km/h");
    }
}
// Subclase Auto

public class Auto extends Vehiculo{
    private int puertas;

    public Auto(String modelo, int anio, int puertas) {
        super(modelo, anio);
        this.puertas = puertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Puertas: " + puertas);
    }
}
// Subclase AutoDeportivo
public class Auto_deportivo extends Auto{
    private double velocidadMaxima;

    public Auto_deportivo(String modelo, int anio, int puertas, double velocidadMaxima) {
        super(modelo, anio, puertas);
        this.velocidadMaxima = velocidadMaxima;
    }

    public void turbo() {
        velocidad = velocidadMaxima;
        System.out.println(modelo + " activa turbo y alcanza " + velocidadMaxima + " km/h");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
// Subclase Moto

public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto(String modelo, int anio, boolean tieneSidecar) {
        super(modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public void agregarSidecar() {
        tieneSidecar = true;
        System.out.println(modelo + " ahora tiene sidecar.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar?: " + tieneSidecar);
    }
}
// Subclase Camion
public class Camion extends Vehiculo{

     private double cargaMaxima;

    public Camion(String modelo, int anio, double cargaMaxima) {
        super(modelo, anio);
        this.cargaMaxima = cargaMaxima;
    }

    public void cargar(double peso) {
        if (peso <= cargaMaxima) {
            System.out.println(modelo + " carga " + peso + " toneladas.");
        } else {
            System.out.println("Carga excedida. Máximo permitido: " + cargaMaxima + " toneladas.");
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Carga maxima: " + cargaMaxima + " toneladas");
    }
}
// Clase principal
public class JerarquiaVeiculo {
    public static void main(String[] args) {
    Vehiculo[] vehiculos = {
            new Auto("Toyota Corolla", 2020, 4),
            new Auto_deportivo("Ferrari F8", 2022, 2, 340),
            new Moto("Harley Davidson", 2019, false),
            new Camion("Volvo FH", 2021, 18)
        };

        for (Vehiculo v : vehiculos) {
            v.mostrarDetalles();
            v.acelerar(50);
            v.frenar(20);
            System.out.println("-------------------");
        }

        // Ejemplo de métodos específicos
        Auto_deportivo ferrari = new Auto_deportivo("Ferrari F8", 2022, 2, 340);
        ferrari.turbo();

        Moto moto = new Moto("Harley Davidson", 2019, false);
        moto.agregarSidecar();

        Camion camion = new Camion("Volvo FH", 2021, 18);
        camion.cargar(15);
        camion.cargar(20);
    }
}
