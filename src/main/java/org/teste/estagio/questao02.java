package org.teste.estagio;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicita ao usuário para informar um número
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            // Chama o método para verificar se o número pertence à sequência de Fibonacci
            if (pertenceAFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }

            scanner.close();
        }

        // Método para verificar se um número pertence à sequência de Fibonacci
        public static boolean pertenceAFibonacci(int numero) {
            if (numero == 0 || numero == 1) {
                return true;
            }

            int a = 0;
            int b = 1;
            int fibonacci = a + b;

            while (fibonacci <= numero) {
                if (fibonacci == numero) {
                    return true;
                }
                a = b;
                b = fibonacci;
                fibonacci = a + b;
            }

            return false;
        }
    }
