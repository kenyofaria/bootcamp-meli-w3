package br.com.meli.exemplo.unit.test;

import java.math.BigDecimal;

public class CartaoDeCreditoChecker {

	
	public boolean paga(BigDecimal total) {
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
