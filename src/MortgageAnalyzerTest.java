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