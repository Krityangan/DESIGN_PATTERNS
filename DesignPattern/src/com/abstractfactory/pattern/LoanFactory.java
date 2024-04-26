package com.abstractfactory.pattern;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        throw new UnsupportedOperationException("Unimplemented method 'getBank'");
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("Business")) {
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        return null;
    }

}
