import br.eu.com.Livro;
import br.eu.com.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Livro ola = new Livro();
        ola.calcularPrecoFinal(10.40);

        ProdutoFisico ola2 = new ProdutoFisico();
        ola2.calcularPrecoFinal(20.40);
    }
}