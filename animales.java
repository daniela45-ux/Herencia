abstract  class Animal {
    abstract void hacerSonido();
    abstract void moverse();
}
class Perro extends Animal{
      @Override
    void hacerSonido() { System.out.println("El perro ladra: Guau guau"); }
    @Override
    void moverse() { System.out.println("El perro corre"); }
}
class Gato extends Animal {
    @Override
    void hacerSonido() { System.out.println("El gato maulla: Miau miau"); }
    @Override
    void moverse() { System.out.println("El gato camina"); }
}
 class Pajaro extends Animal {
    @Override
    void hacerSonido() { System.out.println("El parajo trina: Pio pio"); }
    @Override
    void moverse() { System.out.println("El pajaro vuela"); }
}
class Serpiente extends Animal {
    @Override
    void hacerSonido() { System.out.println("La serpienta sisea: Ssssss"); }
    @Override
    void moverse() { System.out.println("La serpiente se desliza"); }
}
class Caballo extends Animal {
     @Override
    void hacerSonido() { System.out.println("El caballo relincha: iiihhh"); }
    @Override
    void moverse() { System.out.println("El caballo galopa"); }
}
 class Leon extends Animal{
    @Override
    void hacerSonido() { System.out.println("El leon ruge: roooar"); }
    @Override
    void moverse() { System.out.println("El leon camina majestuoso"); }
}
public class Anmal {
    public static void main(String[] args) {
        // TODO code application logic here
        Animal[] animales = {
            new Perro(), new Gato(), new Pajaro(),
            new Serpiente(), new Caballo(), new Leon()
        };

        for (Animal a : animales) {
            a.hacerSonido();
            a.moverse();
            System.out.println();
        }
    }
    }