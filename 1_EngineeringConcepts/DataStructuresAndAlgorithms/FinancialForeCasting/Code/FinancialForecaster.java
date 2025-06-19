public class FinancialForecaster {

    public static double calculateProjectedValue(int yearsAhead, double initialAmount, double annualGrowthRate) {
        if (yearsAhead == 0) {
            return initialAmount;
        }
        return calculateProjectedValue(yearsAhead - 1, initialAmount, annualGrowthRate) * (1 + annualGrowthRate);
    }
    public static void main(String[] args) {
        int yearsToForecast = 6;
        double startingAmount = 10000.00;
        double growthRatePerYear = 0.10;

        double predictedAmount = calculateProjectedValue(yearsToForecast, startingAmount, growthRatePerYear);
        System.out.printf("Estimated value after %d years: Rupees %.2f%n", yearsToForecast, predictedAmount);
    }
}
