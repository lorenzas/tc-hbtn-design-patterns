public class CanhaoExtraDecorator extends NaveEspacialDecorator {
    public CanhaoExtraDecorator(NaveEspacial naveEspacialdecorada) {
        super(naveEspacialdecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }
}
