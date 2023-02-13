package DesignPatterns.StructualDesignPatterns.Adapter;

import DesignPatterns.StructualDesignPatterns.Adapter.AdapaterAPI.BankApiAdapter;
import DesignPatterns.StructualDesignPatterns.Adapter.AdapaterAPI.YesBankAdapterAPI;

public class Client {
    public static void main(String[] args) {
        BankApiAdapter bankApiAdapter=new YesBankAdapterAPI();
        PhonePe phonePe=new PhonePe(bankApiAdapter);
        System.out.println(phonePe.doSomething());
    }
}
