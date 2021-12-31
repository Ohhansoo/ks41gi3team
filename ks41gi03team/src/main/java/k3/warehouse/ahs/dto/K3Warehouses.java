package k3.warehouse.ahs.dto;

public class K3Warehouses {
	private int warehouseCode;
	private String bildingName;
	private String floorNumber;
	private String warehouseName;
	private int warehouseArea;
	private int warehouseFlat;
	private String warehouseType;
	private String warehouseOperation;
	public int getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(int warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
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
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public int getWarehouseArea() {
		return warehouseArea;
	}
	public void setWarehouseArea(int warehouseArea) {
		this.warehouseArea = warehouseArea;
	}
	public int getWarehouseFlat() {
		return warehouseFlat;
	}
	public void setWarehouseFlat(int warehouseFlat) {
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
		builder.append("K3Warehouses [warehouseCode=");
		builder.append(warehouseCode);
		builder.append(", bildingName=");
		builder.append(bildingName);
		builder.append(", floorNumber=");
		builder.append(floorNumber);
		builder.append(", warehouseName=");
		builder.append(warehouseName);
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