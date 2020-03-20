package com.wyl.client;

import com.wyl.bank.Bank;
import com.wyl.bankimp.BankImp;
import com.wyl.bankproxy.BankProxy;

public class Client {

	public static void main(String[] args) {
     BankProxy<Bank> bankProxy=new BankProxy();
     Bank bank=bankProxy.bind(new BankImp());
	 bank.saveMoney();
	}

}
