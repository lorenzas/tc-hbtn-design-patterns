import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilderItensForaCaixa = new StringBuilder("\tFora da Caixa:\n");
        StringBuilder stringBuilderItensDentroCaixa = new StringBuilder("\tDentro da Caixa:\n");

        itensDentroCaixa.forEach(item -> stringBuilderItensDentroCaixa.append(String.format("\t\t- %s %s\n", item.getTipo(), item.getNome())));
        itensForaCaixa.forEach(item -> stringBuilderItensForaCaixa.append(String.format("\t\t- %s %s\n", item.getTipo(), item.getNome())));

        return stringBuilderItensForaCaixa.append(stringBuilderItensDentroCaixa).toString();
    }
}
