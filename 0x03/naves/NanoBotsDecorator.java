public class NanoBotsDecorator extends NaveEspacialDecorator {
    public NanoBotsDecorator(NaveEspacial naveEspacialdecorada) {
        super(naveEspacialdecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
}
