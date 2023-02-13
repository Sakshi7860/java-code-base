package DesignPatterns.StructualDesignPatterns.Adapter.AdapaterAPI;

import DesignPatterns.StructualDesignPatterns.Adapter.BankAPI.ICICIBankAPI;

public class IciciBankAdapterAPI implements BankApiAdapter {
    ICICIBankAPI iciciBankAPI;
    @Override
    public Double checkBalance() {
        return null;
    }

    @Override
    public void transfer() {

    }
}
