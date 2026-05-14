import java.util.Scanner;

/**
 * Classe para calcular a área superficial de uma Pirâmide de base quadrada
 * Fórmula: Área = área_base + área_lateral
 * área_base = lado²
 * área_lateral = 2 × lado × apótema
 */
public class Piramide {
    private double ladoBase;
    private double apotema;

    /**
     * Construtor da Pirâmide
     * @param ladoBase o lado da base quadrada
     * @param apotema a apótema da pirâmide (altura da face triangular)
     */
    public Piramide(double ladoBase, double apotema) {
        if (ladoBase <= 0 || apotema <= 0) {
            throw new IllegalArgumentException("Lado e apótema devem ser valores positivos!");
        }
        this.ladoBase = ladoBase;
        this.apotema = apotema;
    }

    /**
     * Calcula a área da base
     * @return a área da base
     */
    public double calcularAreaBase() {
        return ladoBase * ladoBase;
    }

    /**
     * Calcula a área lateral (4 triângulos)
     * @return a área lateral
     */
    public double calcularAreaLateral() {
        return 2 * ladoBase * apotema;
    }

    /**
     * Calcula a área superficial total
     * @return a área superficial total
     */
    public double calcularArea() {
        return calcularAreaBase() + calcularAreaLateral();
    }

    @Override
    public String toString() {
        return String.format("Pirâmide: Lado Base = %.2f, Apótema = %.2f, Área Base = %.2f, Área Lateral = %.2f, Área Total = %.2f",
                ladoBase, apotema, calcularAreaBase(), calcularAreaLateral(), calcularArea());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Cálculo de Área Superficial da Pirâmide ===");
            System.out.print("Digite o lado da base: ");
            double ladoBase = scanner.nextDouble();
            System.out.print("Digite a apótema (altura da face triangular): ");
            double apotema = scanner.nextDouble();

            Piramide piramide = new Piramide(ladoBase, apotema);
            System.out.println("\n" + piramide);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
