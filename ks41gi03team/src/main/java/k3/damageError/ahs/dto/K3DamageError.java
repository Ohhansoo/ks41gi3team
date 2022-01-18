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
	private String memberName;
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
		builder.append(", memberName=");
		builder.append(memberName);
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actionDate == null) ? 0 : actionDate.hashCode());
		result = prime * result + ((actionDetails == null) ? 0 : actionDetails.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((laydownCheckDate == null) ? 0 : laydownCheckDate.hashCode());
		result = prime * result + ((laydownCheckResult == null) ? 0 : laydownCheckResult.hashCode());
		result = prime * result + laydownGoodsCount;
		result = prime * result + ((laydownGoodsName == null) ? 0 : laydownGoodsName.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((receiptNumber == null) ? 0 : receiptNumber.hashCode());
		result = prime * result + ((repairCost == null) ? 0 : repairCost.hashCode());
		result = prime * result + ((repairState == null) ? 0 : repairState.hashCode());
		result = prime * result + ((shipmentCheckRegDate == null) ? 0 : shipmentCheckRegDate.hashCode());
		result = prime * result + ((shipmentCheckResult == null) ? 0 : shipmentCheckResult.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		K3DamageError other = (K3DamageError) obj;
		if (actionDate == null) {
			if (other.actionDate != null)
				return false;
		} else if (!actionDate.equals(other.actionDate))
			return false;
		if (actionDetails == null) {
			if (other.actionDetails != null)
				return false;
		} else if (!actionDetails.equals(other.actionDetails))
			return false;
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (laydownCheckDate == null) {
			if (other.laydownCheckDate != null)
				return false;
		} else if (!laydownCheckDate.equals(other.laydownCheckDate))
			return false;
		if (laydownCheckResult == null) {
			if (other.laydownCheckResult != null)
				return false;
		} else if (!laydownCheckResult.equals(other.laydownCheckResult))
			return false;
		if (laydownGoodsCount != other.laydownGoodsCount)
			return false;
		if (laydownGoodsName == null) {
			if (other.laydownGoodsName != null)
				return false;
		} else if (!laydownGoodsName.equals(other.laydownGoodsName))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (receiptNumber == null) {
			if (other.receiptNumber != null)
				return false;
		} else if (!receiptNumber.equals(other.receiptNumber))
			return false;
		if (repairCost == null) {
			if (other.repairCost != null)
				return false;
		} else if (!repairCost.equals(other.repairCost))
			return false;
		if (repairState == null) {
			if (other.repairState != null)
				return false;
		} else if (!repairState.equals(other.repairState))
			return false;
		if (shipmentCheckRegDate == null) {
			if (other.shipmentCheckRegDate != null)
				return false;
		} else if (!shipmentCheckRegDate.equals(other.shipmentCheckRegDate))
			return false;
		if (shipmentCheckResult == null) {
			if (other.shipmentCheckResult != null)
				return false;
		} else if (!shipmentCheckResult.equals(other.shipmentCheckResult))
			return false;
		return true;
	}
	
}