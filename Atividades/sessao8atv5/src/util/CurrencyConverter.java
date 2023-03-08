package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double currencyConverter(double valueCotacao, double valueDollar) {
		double valueReal = valueCotacao * valueDollar;
		return valueReal-= valueReal * IOF;
	}
}
