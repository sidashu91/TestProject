package infosys_Code;

public class Item {

	int itemNumber;
	String name;
	boolean isFrozen;
	int departmentNumber;
	String departmentName;
	UnitOfMeasure[] uoms;
	boolean isCrafted;

	// Generate Getters and Setters

	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFrozen() {
		return isFrozen;
	}
	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public UnitOfMeasure[] getUoms() {
		return uoms;
	}
	public void setUoms(UnitOfMeasure[] uoms) {
		this.uoms = uoms;
	}
	public boolean isCrafted() {
		return isCrafted;
	}
	public void setCrafted(boolean isCrafted) {
		this.isCrafted = isCrafted;
	}

}
