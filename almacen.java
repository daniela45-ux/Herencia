// Archivo: Almacen.java
// Cátedra: Paradigmas de Programación I - UAEMex
public class almacen<T> {
    private T elemento;

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return this.elemento;
    }

    public static void main(String[] args) {
        almacen<Integer> almacenEntero = new almacen<>();
        almacenEntero.setElemento(2026);
        System.out.println("Entero: " + almacenEntero.getElemento());

        almacen<String> almacenTexto = new almacen<>();
        almacenTexto.setElemento("UAEMex Computacion");
        System.out.println("Texto: " + almacenTexto.getElemento());
    }
}