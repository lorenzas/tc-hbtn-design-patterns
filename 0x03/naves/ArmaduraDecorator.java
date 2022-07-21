public class ArmaduraDecorator extends NaveEspacialDecorator {
    public ArmaduraDecorator(NaveEspacial naveEspacialdecorada) {
        super(naveEspacialdecorada);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }
}
