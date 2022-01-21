package k3.check.ahs.dto;

public class K3ShipmentCheck {
	private String releaseCode;
	private String productName;
	private String releaseGoodsCount;
	private String contractorName;
	private String accepDate;
	private String releaseDate;
	private String recipientName;
	private String shipmentCheckManager;
	private String shipmentCheckRegDate;
	private String shipmentCheckResult;
	public String getReleaseCode() {
		return releaseCode;
	}
	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getReleaseGoodsCount() {
		return releaseGoodsCount;
	}
	public void setReleaseGoodsCount(String releaseGoodsCount) {
		this.releaseGoodsCount = releaseGoodsCount;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getAccepDate() {
		return accepDate;
	}
	public void setAccepDate(String accepDate) {
		this.accepDate = accepDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getShipmentCheckManager() {
		return shipmentCheckManager;
	}
	public void setShipmentCheckManager(String shipmentCheckManager) {
		this.shipmentCheckManager = shipmentCheckManager;
	}
	public String getShipmentCheckRegDate() {
		return shipmentCheckRegDate;
	}
	public void setShipmentCheckRegDate(String shipmentCheckRegDate) {
		this.shipmentCheckRegDate = shipmentCheckRegDate;
	}
	public String getShipmentCheckResult() {
		return shipmentCheckResult;
	}
	public void setShipmentCheckResult(String shipmentCheckResult) {
		this.shipmentCheckResult = shipmentCheckResult;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accepDate == null) ? 0 : accepDate.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((recipientName == null) ? 0 : recipientName.hashCode());
		result = prime * result + ((releaseCode == null) ? 0 : releaseCode.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((releaseGoodsCount == null) ? 0 : releaseGoodsCount.hashCode());
		result = prime * result + ((shipmentCheckManager == null) ? 0 : shipmentCheckManager.hashCode());
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
		K3ShipmentCheck other = (K3ShipmentCheck) obj;
		if (accepDate == null) {
			if (other.accepDate != null)
				return false;
		} else if (!accepDate.equals(other.accepDate))
			return false;
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (recipientName == null) {
			if (other.recipientName != null)
				return false;
		} else if (!recipientName.equals(other.recipientName))
			return false;
		if (releaseCode == null) {
			if (other.releaseCode != null)
				return false;
		} else if (!releaseCode.equals(other.releaseCode))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (releaseGoodsCount == null) {
			if (other.releaseGoodsCount != null)
				return false;
		} else if (!releaseGoodsCount.equals(other.releaseGoodsCount))
			return false;
		if (shipmentCheckManager == null) {
			if (other.shipmentCheckManager != null)
				return false;
		} else if (!shipmentCheckManager.equals(other.shipmentCheckManager))
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
	@Override
	public String toString() {
		return "K3ShipmentCheck [releaseCode=" + releaseCode + ", productName=" + productName + ", releaseGoodsCount="
				+ releaseGoodsCount + ", contractorName=" + contractorName + ", accepDate=" + accepDate
				+ ", releaseDate=" + releaseDate + ", recipientName=" + recipientName + ", shipmentCheckManager="
				+ shipmentCheckManager + ", shipmentCheckRegDate=" + shipmentCheckRegDate + ", shipmentCheckResult="
				+ shipmentCheckResult + "]";
	}
	
	
}
