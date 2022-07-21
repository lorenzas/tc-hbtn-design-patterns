public class NaveEspacialDecorator extends NaveEspacial {
    private NaveEspacial naveEspacialdecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacialdecorada) {
        super(naveEspacialdecorada.getSaude(), naveEspacialdecorada.getAtaque());
        this.naveEspacialdecorada = naveEspacialdecorada;
    }

    @Override
    public int getSaude() {
        return naveEspacialdecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveEspacialdecorada.getAtaque();
    }
}
