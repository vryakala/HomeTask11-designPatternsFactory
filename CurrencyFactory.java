package designPatternsFactory;

class CurrencyFactory {

	public static Currency createCurrency(String country) {
		if (country.equalsIgnoreCase("India")) {
			return new Rupee();
		} else if (country.equalsIgnoreCase("Singapore")) {
			return new SGDDollar();
		} else if (country.equalsIgnoreCase("US")) {
			return new USDollar();
		}
		throw new IllegalArgumentException("No such currency");
	}

	// Factory client code
	public static class Factory {
		public static void main(String args[]) {
			String country = "India";
			Currency rupee = CurrencyFactory.createCurrency(country);
			System.out.println(rupee.getSymbol());
		}
	}
}
