import java.util.Scanner;

/**
 * Classe para calcular a área superficial de um Tubo (Cilindro)
 * Fórmula: Área = 2πr² + 2πrh = 2πr(r + h)
 * onde r é o raio e h é a altura
 */
public class Tubo {
    private double raio;
    private double altura;
    private static final double PI = Math.PI;

    /**
     * Construtor do Tubo
     * @param raio o raio do tubo
     * @param altura a altura do tubo
     */
    public Tubo(double raio, double altura) {
        if (raio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Raio e altura devem ser valores positivos!");
        }
        this.raio = raio;
        this.altura = altura;
    }

    /**
     * Calcula a área das bases (2 círculos)
     * @return a área das bases
     */
    public double calcularAreaBases() {
        return 2 * PI * raio * raio;
    }

    /**
     * Calcula a área lateral do tubo
     * @return a área lateral
     */
    public double calcularAreaLateral() {
        return 2 * PI * raio * altura;
    }

    /**
     * Calcula a área superficial total do tubo
     * @return a área superficial total
     */
    public double calcularArea() {
        return calcularAreaBases() + calcularAreaLateral();
    }

    /**
     * Calcula o volume do tubo
     * @return o volume do tubo
     */
    public double calcularVolume() {
        return PI * raio * raio * altura;
    }

    @Override
    public String toString() {
        return String.format("Tubo: Raio = %.2f, Altura = %.2f, Área Bases = %.2f, Área Lateral = %.2f, Área Total = %.2f, Volume = %.2f",
                raio, altura, calcularAreaBases(), calcularAreaLateral(), calcularArea(), calcularVolume());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial do Tubo ===");
            System.out.print("Digite o raio: ");
            double raio = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            Tubo tubo = new Tubo(raio, altura);
            System.out.println("\n" + tubo);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
