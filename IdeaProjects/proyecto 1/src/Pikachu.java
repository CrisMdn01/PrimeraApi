public class Pikachu extends Pokemon implements Electrico {


    public Pikachu() {} // esto es un constructor vacio

    //me agrega los ataques metodos usandos en mi clase de Pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu atacando");
    }

    @Override
    protected void aranaso() {
        System.out.println("Pikachu aranaso");
    }

    @Override
    protected void defensa() {
        System.out.println("Pikachu defensa");
    }

    //me agrega los ataques de tipo electrcio con Implements
    @Override
    public void atacarTrueno() {
        System.out.println("Pikachu atacando con trueno");
    }

    @Override
    public void acelerarTrueno() {
        System.out.println("Pikachu acelerando con trueno acelerado");
    }
}
