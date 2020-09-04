package proxy.client;


import proxy.bank.Bank;
import proxy.bankimp.ICBC;
import proxy.bankproxy.BankProxy;

/**
 * @author Wyl
 */
public class Client {

    public static void main(String[] args) {
        BankProxy<Bank> bankProxy = new BankProxy();
        Bank bank = bankProxy.bind(new ICBC());
        System.out.println(bank);
        bank.saveMoney();
        bank.getMoney();
    }

}
