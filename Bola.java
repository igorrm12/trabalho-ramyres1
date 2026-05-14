import java.util.Scanner;

/**
 * Classe para calcular a área superficial de uma Bola (Esfera)
 * Fórmula: Área = 4πr²
 * onde r é o raio
 */
public class Bola {
    private double raio;
    private static final double PI = Math.PI;

    /**
     * Construtor da Bola
     * @param raio o raio da bola
     */
    public Bola(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser um valor positivo!");
        }
        this.raio = raio;
    }

    /**
     * Calcula a área superficial da bola
     * @return a área superficial da bola
     */
    public double calcularArea() {
        return 4 * PI * raio * raio;
    }

    /**
     * Calcula o volume da bola
     * @return o volume da bola
     */
    public double calcularVolume() {
        return (4.0 / 3.0) * PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Bola: Raio = %.2f, Área Superficial = %.2f, Volume = %.2f",
                raio, calcularArea(), calcularVolume());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial da Bola ===");
            System.out.print("Digite o raio: ");
            double raio = scanner.nextDouble();

            Bola bola = new Bola(raio);
            System.out.println("\n" + bola);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
