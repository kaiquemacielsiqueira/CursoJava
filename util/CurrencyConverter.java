package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double realToDollar(double dollarPrice, double numberDollar) {
		double payInReais = dollarPrice * numberDollar;
		double addIof = payInReais + (payInReais * IOF);
		return addIof;

	}

}
