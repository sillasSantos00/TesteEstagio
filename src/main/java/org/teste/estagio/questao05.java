package org.teste.estagio;
    import java.util.Scanner;

    public class questao05 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a string a ser invertida:");
            String input = scanner.nextLine();
            scanner.close();

            String invertida = inverterString(input);
            System.out.println("String invertida: " + invertida);
        }

        public static String inverterString(String str) {
            char[] caracteres = str.toCharArray();
            int esquerda = 0;
            int direita = caracteres.length - 1;

            while (esquerda < direita) {
                char temp = caracteres[esquerda];
                caracteres[esquerda] = caracteres[direita];
                caracteres[direita] = temp;
                esquerda++;
                direita--;
            }

            return new String(caracteres);
        }
    }


