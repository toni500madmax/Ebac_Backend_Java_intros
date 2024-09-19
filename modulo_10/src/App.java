import java.util.List;

public class App {
    public static String isAproved(List<Double> notas) {
        double somaNotas = 0.0d;
        for (int i = 0; i < notas.size(); i++) {
            somaNotas += notas.get(i);
        }
        double media = somaNotas / 4;
        if (media >= 7) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }

    public static void main(String[] args) throws Exception {
        List<Double> listaNotas = List.of(7.8, 6.6, 7.1, 8.5);
        System.out.println("O aluno está: " + isAproved(listaNotas) + ".");
    }
}
