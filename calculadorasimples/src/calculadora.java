public class calculadora {
    public static void main(String[] args) {
        // Definindo os números diretamente
        double numero1 = 10.5;
        double numero2 = 5.2;

        // Calculando e exibindo os resultados
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        // tratamento de erro 
        double divisao = 0;
        if (numero2 != 0) {
            divisao = numero1 / numero2;
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if (numero2 != 0) {
            System.out.println("Divisão: " + divisao);
        }
    }
}

