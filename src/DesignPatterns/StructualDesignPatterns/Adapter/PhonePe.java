package DesignPatterns.StructualDesignPatterns.Adapter;

import DesignPatterns.StructualDesignPatterns.Adapter.AdapaterAPI.BankApiAdapter;

public class PhonePe {
    BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter)
    {
        this.bankApiAdapter=bankApiAdapter;
    }

    Double doSomething()
    {
        Double currentBalance=bankApiAdapter.checkBalance();
        return currentBalance;
    }
}
