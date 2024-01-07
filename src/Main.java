import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static List<Pessoa> lerListaPessoasDoConsole() {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite os dados das pessoas (digite 'fim' para encerrar):");
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            pessoas.add(new Pessoa(nome, sexo));
        }

        return pessoas;
    }

    public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.sexo.equalsIgnoreCase("F"))
                .collect(Collectors.toList());
    }

    public static void imprimirLista(List<Pessoa> pessoas) {
        System.out.println("\nLista de Pessoas:");
        pessoas.forEach(pessoa -> System.out.println("Nome: " + pessoa.nome + ", Sexo: " + pessoa.sexo));
    }
}
