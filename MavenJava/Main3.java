public class Main3 {

    public static void main(String[] args) {

        String frase = "Olá mundo!";

        // Separar pontuação final (se houver)
        String pontuacao = "";
        char ultimoChar = frase.charAt(frase.length() - 1);

        if (!Character.isLetterOrDigit(ultimoChar)) {
            pontuacao = String.valueOf(ultimoChar);
            frase = frase.substring(0, frase.length() - 1);
        }

        // Verificar se a primeira letra era maiúscula
        boolean primeiraMaiuscula = Character.isUpperCase(frase.charAt(0));

        // Separar palavras
        String[] palavras = frase.split("\\s+");

        // Inverter palavras
        StringBuilder invertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            invertida.append(palavras[i].toLowerCase());
            if (i != 0) {
                invertida.append(" ");
            }
        }

        String fraseFinal = invertida.toString();

        // Ajustar capitalização da primeira letra
        if (primeiraMaiuscula) {
            fraseFinal = Character.toUpperCase(fraseFinal.charAt(0)) 
                       + fraseFinal.substring(1);
        }

        // Recolocar pontuação
        fraseFinal += pontuacao;

        System.out.println(fraseFinal);
    }
}