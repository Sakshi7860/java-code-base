package DesignPatterns.StructualDesignPatterns.Adapter.AdapaterAPI;

import DesignPatterns.StructualDesignPatterns.Adapter.BankAPI.YesBankAPI;

public class YesBankAdapterAPI implements BankApiAdapter {
    YesBankAPI yesBankAPI;
    @Override
    public Double checkBalance() {
       /* String balance=yesBankAPI.getBalance();  //lets assume we have getBalance() method written in yesbankAPI for check Balance
        Double value=Double.parseDouble(balance);
        return value;*/
        return 0.0;
    }

    @Override
    public void transfer() {

    }
}
