package k3.warehouse.ahs.dto;

public class K3Warehouses {
	private String warehouseCode;
	private String warehouseName;
	private String floorNumber;
	private String warehouseNumber;
	private int warehouseArea;
	private int warehouseFlat;
	private String warehouseType;
	private String warehouseDockNumber;
	private String warehouseOperation;
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
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
	public String getWarehouseDockNumber() {
		return warehouseDockNumber;
	}
	public void setWarehouseDockNumber(String warehouseDockNumber) {
		this.warehouseDockNumber = warehouseDockNumber;
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
		builder.append(", warehouseName=");
		builder.append(warehouseName);
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
		builder.append(", warehouseDockNumber=");
		builder.append(warehouseDockNumber);
		builder.append(", warehouseOperation=");
		builder.append(warehouseOperation);
		builder.append("]");
		return builder.toString();
	}

}