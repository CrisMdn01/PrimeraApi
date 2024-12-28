import java.io.Serializable;

public class Squitle extends Pokemon implements Agua {

    public Squitle() {}// constructor vacio

    //metodos tomados de la clase de Java
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squitle atacar placaje");
    }

    @Override
    protected void aranaso() {
        System.out.println("Squitle aranaso aranaso");
    }

    @Override
    protected void defensa() {
        System.out.println("Squitle defensa defensa");
    }

//metodos implementos desde la interfaz de Agua
    @Override
    public void atacarChorro() {
        System.out.println("Squitle atacar chorro");
    }

    @Override
    public void atacarBola() {
        System.out.println("Squitle atacar bola");
    }
}
