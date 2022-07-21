public enum TamanhoImpressao {
    A2(0.22, 0.18, 0.32, 0.28),
    A3(0.20, 0.15, 0.30, 0.25),
    A4(0.15, 0.10, 0.25, 0.20);

    public final double valorUmLadoPretoEBranco;
    public final double valorFrenteEVersoPretoEBranco;
    public final double valorUmLadoColorida;
    public final double valorFrenteEVersoColorida;

    TamanhoImpressao(double valorUmLadoPretoEBranco,
                     double valorFrenteEVersoPretoEBranco,
                     double valorUmLadoColorida,
                     double valorFrenteEVersoColorida) {
        this.valorUmLadoPretoEBranco = valorUmLadoPretoEBranco;
        this.valorFrenteEVersoPretoEBranco = valorFrenteEVersoPretoEBranco;
        this.valorUmLadoColorida = valorUmLadoColorida;
        this.valorFrenteEVersoColorida = valorFrenteEVersoColorida;
    }

    public Double getValorUmLadoPretoEBranco() {
        return valorUmLadoPretoEBranco;
    }

    public Double getValorFrenteEVersoPretoEBranco() {
        return valorFrenteEVersoPretoEBranco;
    }

    public Double getValorUmLadoColorida() {
        return valorUmLadoColorida;
    }

    public Double getValorFrenteEVersoColorida() {
        return valorFrenteEVersoColorida;
    }
}
