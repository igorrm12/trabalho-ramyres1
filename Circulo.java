import java.util.Scanner;

/**
 * Classe para calcular a área de um Círculo
 * Fórmula: Área = π × r²
 */
public class Circulo {
    private double raio;
    private static final double PI = Math.PI;

    /**
     * Construtor do Círculo
     * @param raio o raio do círculo
     */
    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser um valor positivo!");
        }
        this.raio = raio;
    }

    /**
     * Calcula a área do círculo
     * @return a área do círculo
     */
    public double calcularArea() {
        return PI * raio * raio;
    }

    /**
     * Calcula o perímetro (circunferência) do círculo
     * @return o perímetro do círculo
     */
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo: Raio = %.2f, Área = %.2f, Perímetro = %.2f",
                raio, calcularArea(), calcularPerimetro());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área do Círculo ===");
            System.out.print("Digite o raio: ");
            double raio = scanner.nextDouble();

            Circulo circulo = new Circulo(raio);
            System.out.println("\n" + circulo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
