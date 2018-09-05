package designPatternsFactory;

interface Currency {
	String getSymbol();
}

class Rupee implements Currency {
	public String getSymbol() {
		return "Rs";
	}
}

class SGDDollar implements Currency {
	public String getSymbol() {
		return "SGD";
	}
}

class USDollar implements Currency {
	public String getSymbol() {
		return "USD";
	}
}
