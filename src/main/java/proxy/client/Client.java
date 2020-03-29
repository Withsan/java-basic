package proxy.client;


import proxy.bank.Bank;
import proxy.bankimp.BankImp;
import proxy.bankproxy.BankProxy;

public class Client {

	public static void main(String[] args) {
     BankProxy<Bank> bankProxy=new BankProxy();
     Bank bank=bankProxy.bind(new BankImp());
	 bank.saveMoney();
	}

}
