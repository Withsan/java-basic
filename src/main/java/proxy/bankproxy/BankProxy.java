package proxy.bankproxy;


import proxy.bank.Bank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BankProxy<E extends Bank> implements InvocationHandler {
	private Object tar;

	public E bind(E tar) {
		this.tar = tar;
		return (E) Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		Log();
		Object res = method.invoke(tar, arg2);
		Log();
		return res;
	}

	private void Log() {
		System.out.println("资金流动");
	}
}
