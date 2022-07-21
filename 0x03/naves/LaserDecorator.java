public class LaserDecorator extends NaveEspacialDecorator {
    public LaserDecorator(NaveEspacial naveEspacialdecorada) {
        super(naveEspacialdecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}
