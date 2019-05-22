
public class SoftwareSales {
	
	
	// Returns the total price of the software package
	public double calculatePrice(int quantity) {
		
		if(quantity >= 10 && quantity <= 19) {
			//20%
			double subTotal = 99 * quantity;
			double discount = subTotal * 0.20;
			double finalTotal = subTotal - discount;
			return finalTotal;
		}
		
		else if(quantity >= 19 && quantity <= 49) {
			//20%
			double subTotal = 99 * quantity;
			double discount = subTotal * 0.30;
			double finalTotal = subTotal - discount;
			return finalTotal;
		}
		return 99.0 * quantity;
	}

}
