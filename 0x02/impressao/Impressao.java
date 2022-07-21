public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private int paginasPretoEBranco;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(TamanhoImpressao tamanho, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso){
        this.valorPretoBrancoFrenteApenas = tamanho.getValorUmLadoPretoEBranco();
        this.valorPretoBrancoFrenteVerso = tamanho.getValorFrenteEVersoPretoEBranco();
        this.valorColoridasFrenteApenas = tamanho.getValorUmLadoColorida();
        this.valorColoridasFrenteVerso = tamanho.getValorFrenteEVersoColorida();
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.paginasPretoEBranco = paginasTotais - paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal() {
        double totalPretoEBranco = 0.0;
        double totalColorida = 0.0;

        if (ehFrenteVerso) {
            totalPretoEBranco = paginasPretoEBranco * valorPretoBrancoFrenteVerso;
            totalColorida = paginasColoridas * valorColoridasFrenteVerso;
        } else {
            totalPretoEBranco = paginasPretoEBranco * valorPretoBrancoFrenteApenas;
            totalColorida = paginasColoridas * valorColoridasFrenteApenas;
        }

        return totalPretoEBranco + totalColorida;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, " +
                        "total preto e branco: %d, %s. total: R$ %.2f",
                this.paginasTotais,
                this.paginasColoridas,
                this.paginasPretoEBranco,
                this.ehFrenteVerso ? "frente e verso" : "frente apenas",
                this.calcularTotal());
    }
}
