package com.abstractfactory.pattern;

public class SBI implements Bank {

    private final String bankName;

    public SBI() {
        bankName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
