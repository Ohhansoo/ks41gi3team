package k3.warehouse.ahs.dto;

public class K3Warehouses {
	private String bildingName;
	private String floorNumber;
	private String warehouseNumber;
	private int warehouseArea;
	private double warehouseFlat;
	private String warehouseType;
	private String warehouseOperation;
	
	public String getBildingName() {
		return bildingName;
	}
	public void setBildingName(String bildingName) {
		this.bildingName = bildingName;
	}

	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getWarehouseNumber() {
		return warehouseNumber;
	}
	public void setWarehouseNumber(String warehouseNumber) {
		this.warehouseNumber = warehouseNumber;
	}
	public int getWarehouseArea() {
		return warehouseArea;
	}
	public void setWarehouseArea(int warehouseArea) {
		this.warehouseArea = warehouseArea;
	}
	public double getWarehouseFlat() {
		return warehouseFlat;
	}
	public void setWarehouseFlat(double warehouseFlat) {
		this.warehouseFlat = warehouseFlat;
	}
	public String getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}
	public String getWarehouseOperation() {
		return warehouseOperation;
	}
	public void setWarehouseOperation(String warehouseOperation) {
		this.warehouseOperation = warehouseOperation;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Warehouses [bildingName=");
		builder.append(bildingName);
		builder.append(", underFloorNumber=");
		builder.append(", floorNumber=");
		builder.append(floorNumber);
		builder.append(", warehouseNumber=");
		builder.append(warehouseNumber);
		builder.append(", warehouseArea=");
		builder.append(warehouseArea);
		builder.append(", warehouseFlat=");
		builder.append(warehouseFlat);
		builder.append(", warehouseType=");
		builder.append(warehouseType);
		builder.append(", warehouseOperation=");
		builder.append(warehouseOperation);
		builder.append("]");
		return builder.toString();
	}
}
