public class Caja<T> {

    private T dato;

    public void guardar(T dato) {
        this.dato = dato;
    }

    public T obtener() {
        return dato;
    }

    public static void main(String[] args) {

        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hello Java");

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(25);

        System.out.println("Text: " + cajaTexto.obtener());
        System.out.println("Number: " + cajaNumero.obtener());
    }
}