import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        List<Integer> resultado = new ArrayList<>();

        int numero = 1;

        // Se for ímpar, adiciona zero
        if (N % 2 != 0) {
            resultado.add(0);
        }

        // Adiciona pares positivos e negativos
        while (resultado.size() < N) {
            resultado.add(numero);
            if (resultado.size() < N) {
                resultado.add(-numero);
            }
            numero++;
        }

        System.out.println(resultado);
    }
}