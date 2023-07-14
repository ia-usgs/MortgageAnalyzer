public class MortgageAnalyzer {
    private double loanAmount;
    private double annualInterestRate;
    private int loanDurationInMonths;

    public void enterLoanDetails(double loanAmount, double annualInterestRate, int loanDurationInMonths) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.loanDurationInMonths = loanDurationInMonths;
    }

    public boolean verifyLoanDetails() {
        // Perform verification checks on the entered loan details
        // Return true if the details are reasonable, otherwise false
        // Example verification: Check if loan amount, interest rate, and duration are valid
        // You can add your own validation logic here
        return (loanAmount > 0 && annualInterestRate >= 0 && loanDurationInMonths > 0);
    }

    public void correctLoanDetails() {
        // Allow the user to correct the input data
        // Example correction: Prompt the user to re-enter the loan details
    }

    public void calculateMortgageDetails() {
        double monthlyInterestRate = annualInterestRate / 12.0;
        int numberOfPayments = loanDurationInMonths;

        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        double totalInterestPaid = (monthlyPayment * numberOfPayments) - loanAmount;

        System.out.println("Amount of Loan             - $" + loanAmount);
        System.out.println("Annual Interest Rate      - " + annualInterestRate + "%");
        System.out.println("Duration of loan in months - " + loanDurationInMonths);
        System.out.println("Monthly payment           - $" + monthlyPayment);
        System.out.println("Total interest paid        - $" + totalInterestPaid);
    }

    // Other methods and logic can be added as needed
}




    This is a separate unit test class to test the functionality of the MortgageAnalyzer class. Here's an example unit test using JUnit:



        java code

        import org.junit.Test;

        import static org.junit.Assert.*;

public class MortgageAnalyzerTest {
    @Test
    public void testCalculateMortgageDetails() {
        MortgageAnalyzer mortgageAnalyzer = new MortgageAnalyzer();

        // Set loan details for testing
        double loanAmount = 140000;
        double annualInterestRate = 8.00;
        int loanDurationInMonths = 360;
        mortgageAnalyzer.enterLoanDetails(loanAmount, annualInterestRate, loanDurationInMonths);

        // Verify loan details
        boolean isValid = mortgageAnalyzer.verifyLoanDetails();
        assertTrue(isValid);

        // Calculate mortgage details
        mortgageAnalyzer.calculateMortgageDetails();
    }
}