package com.abstractfactory.pattern;

public class ICICI implements Bank {
    private final String bankName;

    public ICICI() {
        bankName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }

}
