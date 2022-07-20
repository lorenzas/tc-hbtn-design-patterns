import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes() {
        return Stream.of("cafe").collect(Collectors.toList());
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
