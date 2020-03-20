package com.wyl.bankimp;

import com.wyl.bank.Bank;

public class BankImp implements Bank {
	@Override
	public void saveMoney() {
    System.out.println("存钱");
	}

	@Override
	public int getMoney() {
		return 10000000;
	}

}
