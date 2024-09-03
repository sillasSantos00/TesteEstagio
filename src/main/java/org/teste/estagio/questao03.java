package org.teste.estagio;

public class questao03 {

    public static void main(String[] args) {
        // Definição do vetor com valores de faturamento diário (pode ser ajustado conforme necessário)
        double[] faturamentoDiario = {15000.0, 20000.0, 18000.0, 21000.0, 0.0, 0.0, 17000.0, 22000.0, 0.0, 19000.0,
                16000.0, 0.0, 0.0, 23000.0, 24000.0, 0.0, 25000.0, 0.0, 0.0, 26000.0,
                27000.0, 28000.0, 29000.0, 30000.0, 31000.0, 32000.0, 33000.0, 34000.0, 35000.0};

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Calcula o menor e maior valor de faturamento e a soma total dos faturamentos
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        // Calcula a média mensal, se houver dias com faturamento
        double mediaMensal = (diasComFaturamento > 0) ? somaFaturamento / diasComFaturamento : 0;

        // Conta o número de dias com faturamento superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}
