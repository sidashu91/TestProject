package infosys_Code;

public class UnitOfMeasure {
	String code;
	String name;
	double price;
	double quantity;
	boolean isOrderable;

	// Generate Getters and Setters
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public boolean isOrderable() {
		return isOrderable;
	}
	public void setOrderable(boolean isOrderable) {
		this.isOrderable = isOrderable;
	}

}


