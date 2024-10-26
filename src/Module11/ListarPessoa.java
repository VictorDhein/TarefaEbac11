package Module11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListarPessoa {
    private static void listarPessoas() {
        System.out.println("**** Lista de Pessoas ****");

        List<Pessoa> lista = new ArrayList<>();

        // Adicionando pessoas à lista
        lista.add(new Pessoa("Douglas", 25, 'M'));
        lista.add(new Pessoa("Fernanda", 24, 'F'));
        lista.add(new Pessoa("Felipe", 21, 'M'));
        lista.add(new Pessoa("Fernando", 28, 'M'));
        lista.add(new Pessoa("Diego", 32, 'M'));
        lista.add(new Pessoa("Fabiana", 23, 'F'));
        lista.add(new Pessoa("Amanda", 27, 'F'));
        lista.add(new Pessoa("Gregorio", 19, 'M'));
        lista.add(new Pessoa("Matthias", 33, 'M'));
        lista.add(new Pessoa("Magda", 39, 'F'));

        // Criando listas separadas por sexo
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        // Separando as pessoas por sexo
        for (Pessoa pessoa : lista) {
            if (pessoa.getSexo() == 'M') {
                masculino.add(pessoa);
            } else if (pessoa.getSexo() == 'F') {
                feminino.add(pessoa);
            }
        }

        // Ordenando ambas as listas por nome em ordem alfabética
        Comparator<Pessoa> comparator = Comparator.comparing(Pessoa::getNome);
        Collections.sort(masculino, comparator);
        Collections.sort(feminino, comparator);

        // Exibindo as listas separadas e ordenadas
        System.out.println("\n--- Pessoas do Sexo Masculino (Ordem Alfabética) ---");
        for (Pessoa pessoa : masculino) {
            System.out.println(pessoa);
        }

        System.out.println("\n--- Pessoas do Sexo Feminino (Ordem Alfabética) ---");
        for (Pessoa pessoa : feminino) {
            System.out.println(pessoa);
        }
    }

    public static void main(String[] args) {
        listarPessoas();
    }
}
