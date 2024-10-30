import java.util.Locale;
import java.util.Scanner;

public class App {

    // Todo: mostrar nomes na tela filtrados por gênero.

    // System.out.println("Digite o gênero (1) Masculino, (2) Feminino, (3)
    // Retardados para filtrar pessoas: ");
    // int generoFilter = scan.nextInt();
    // List<Pessoa> pessoasFiltradas = listaPessoas.getPessoa().stream()
    // .filter(p -> p.getSexo() == Genero.values()[generoFilter - 1])
    // .collect(Collectors.toList());

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.print("Digite quantas pessoas serão adicionadas: ");
        int qtdPessoas = scan.nextInt();
        ListaPessoas listaPessoas = new ListaPessoas();
        scan.nextLine();
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scan.nextLine();
            System.out.print("Digite a idade: ");
            int idade = scan.nextInt();
            System.out.print("Digite o sexo: [1] Masculino, [2] Feminino");
            int sexo = scan.nextInt();
            Genero generoPessoa = sexo == 1 ? Genero.MASCULINO : Genero.FEMININO;
            Pessoa pessoaCompleta = new Pessoa(nome, generoPessoa, idade);
            scan.nextLine();
            listaPessoas.adicionarPessoa(pessoaCompleta);
            System.out.println(qtdPessoas > 1 ? "Adicionado com sucesso;"
                    : i == qtdPessoas ? "FInalizando lista de pessoas..." : "...");
        }

        System.out.println(listaPessoas);

        scan.close();
    }
}
