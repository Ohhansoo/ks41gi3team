package k3.damageError.ahs.dto;

public class K3DamageError {
	private String receiptNumber;
	private String laydownCheckDate;
	private String shipmentCheckRegDate;
	private String contractorName;
	private String laydownGoodsName;
	private int laydownGoodsCount;
	private String laydownCheckResult;
	private String shipmentCheckResult;
	private String laydownCheckManager;
	private String releaseManager;
	private String actionDetails;
	private String actionDate;
	private String repairCost;
	private String repairState;
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public String getLaydownCheckDate() {
		return laydownCheckDate;
	}
	public void setLaydownCheckDate(String laydownCheckDate) {
		this.laydownCheckDate = laydownCheckDate;
	}
	public String getShipmentCheckRegDate() {
		return shipmentCheckRegDate;
	}
	public void setShipmentCheckRegDate(String shipmentCheckRegDate) {
		this.shipmentCheckRegDate = shipmentCheckRegDate;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getLaydownGoodsName() {
		return laydownGoodsName;
	}
	public void setLaydownGoodsName(String laydownGoodsName) {
		this.laydownGoodsName = laydownGoodsName;
	}
	public int getLaydownGoodsCount() {
		return laydownGoodsCount;
	}
	public void setLaydownGoodsCount(int laydownGoodsCount) {
		this.laydownGoodsCount = laydownGoodsCount;
	}
	public String getLaydownCheckResult() {
		return laydownCheckResult;
	}
	public void setLaydownCheckResult(String laydownCheckResult) {
		this.laydownCheckResult = laydownCheckResult;
	}
	public String getShipmentCheckResult() {
		return shipmentCheckResult;
	}
	public void setShipmentCheckResult(String shipmentCheckResult) {
		this.shipmentCheckResult = shipmentCheckResult;
	}
	public String getLaydownCheckManager() {
		return laydownCheckManager;
	}
	public void setLaydownCheckManager(String laydownCheckManager) {
		this.laydownCheckManager = laydownCheckManager;
	}
	public String getReleaseManager() {
		return releaseManager;
	}
	public void setReleaseManager(String releaseManager) {
		this.releaseManager = releaseManager;
	}
	public String getActionDetails() {
		return actionDetails;
	}
	public void setActionDetails(String actionDetails) {
		this.actionDetails = actionDetails;
	}
	public String getActionDate() {
		return actionDate;
	}
	public void setActionDate(String actionDate) {
		this.actionDate = actionDate;
	}
	public String getRepairCost() {
		return repairCost;
	}
	public void setRepairCost(String repairCost) {
		this.repairCost = repairCost;
	}
	public String getRepairState() {
		return repairState;
	}
	public void setRepairState(String repairState) {
		this.repairState = repairState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3DamageError [receiptNumber=");
		builder.append(receiptNumber);
		builder.append(", laydownCheckDate=");
		builder.append(laydownCheckDate);
		builder.append(", shipmentCheckRegDate=");
		builder.append(shipmentCheckRegDate);
		builder.append(", contractorName=");
		builder.append(contractorName);
		builder.append(", laydownGoodsName=");
		builder.append(laydownGoodsName);
		builder.append(", laydownGoodsCount=");
		builder.append(laydownGoodsCount);
		builder.append(", laydownCheckResult=");
		builder.append(laydownCheckResult);
		builder.append(", shipmentCheckResult=");
		builder.append(shipmentCheckResult);
		builder.append(", laydownCheckManager=");
		builder.append(laydownCheckManager);
		builder.append(", releaseManager=");
		builder.append(releaseManager);
		builder.append(", actionDetails=");
		builder.append(actionDetails);
		builder.append(", actionDate=");
		builder.append(actionDate);
		builder.append(", repairCost=");
		builder.append(repairCost);
		builder.append(", repairState=");
		builder.append(repairState);
		builder.append("]");
		return builder.toString();
	}
}