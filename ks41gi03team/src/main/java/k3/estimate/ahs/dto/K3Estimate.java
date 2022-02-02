package k3.estimate.ahs.dto;

public class K3Estimate {
	
	//견적서 간단조회
	private String estimateNum;
	private String contractorCode;
	private String contractorName;
	private String estimatePrice;
	private String estimateMeasureDate;
	private String estimateMeasureDateEnd;
	private String estimateMeasureDateStrat;
	private String memberId;
	private String estimateDetailNum;
	private String mainBusinessCode;
	private String UnitPriceCode;
	private String unitContractDevisionAmount;
	private String unitContractWarehouseType;
	private String estimateContractTerm;
	private String estimateUnitPrice;
	private String estimatePricePrepayment;
	private String estimatePriceMonth;
	
	
	public String getEstimateNum() {
		return estimateNum;
	}
	public void setEstimateNum(String estimateNum) {
		this.estimateNum = estimateNum;
	}
	public String getContractorCode() {
		return contractorCode;
	}
	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getEstimatePrice() {
		return estimatePrice;
	}
	public void setEstimatePrice(String estimatePrice) {
		this.estimatePrice = estimatePrice;
	}
	public String getEstimateMeasureDate() {
		return estimateMeasureDate;
	}
	public void setEstimateMeasureDate(String estimateMeasureDate) {
		this.estimateMeasureDate = estimateMeasureDate;
	}
	public String getEstimateMeasureDateEnd() {
		return estimateMeasureDateEnd;
	}
	public void setEstimateMeasureDateEnd(String estimateMeasureDateEnd) {
		this.estimateMeasureDateEnd = estimateMeasureDateEnd;
	}
	public String getEstimateMeasureDateStrat() {
		return estimateMeasureDateStrat;
	}
	public void setEstimateMeasureDateStrat(String estimateMeasureDateStrat) {
		this.estimateMeasureDateStrat = estimateMeasureDateStrat;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getEstimateDetailNum() {
		return estimateDetailNum;
	}
	public void setEstimateDetailNum(String estimateDetailNum) {
		this.estimateDetailNum = estimateDetailNum;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getUnitPriceCode() {
		return UnitPriceCode;
	}
	public void setUnitPriceCode(String unitPriceCode) {
		UnitPriceCode = unitPriceCode;
	}
	public String getUnitContractDevisionAmount() {
		return unitContractDevisionAmount;
	}
	public void setUnitContractDevisionAmount(String unitContractDevisionAmount) {
		this.unitContractDevisionAmount = unitContractDevisionAmount;
	}
	public String getUnitContractWarehouseType() {
		return unitContractWarehouseType;
	}
	public void setUnitContractWarehouseType(String unitContractWarehouseType) {
		this.unitContractWarehouseType = unitContractWarehouseType;
	}
	public String getEstimateContractTerm() {
		return estimateContractTerm;
	}
	public void setEstimateContractTerm(String estimateContractTerm) {
		this.estimateContractTerm = estimateContractTerm;
	}
	public String getEstimateUnitPrice() {
		return estimateUnitPrice;
	}
	public void setEstimateUnitPrice(String estimateUnitPrice) {
		this.estimateUnitPrice = estimateUnitPrice;
	}
	public String getEstimatePricePrepayment() {
		return estimatePricePrepayment;
	}
	public void setEstimatePricePrepayment(String estimatePricePrepayment) {
		this.estimatePricePrepayment = estimatePricePrepayment;
	}
	public String getEstimatePriceMonth() {
		return estimatePriceMonth;
	}
	public void setEstimatePriceMonth(String estimatePriceMonth) {
		this.estimatePriceMonth = estimatePriceMonth;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Estimate [estimateNum=");
		builder.append(estimateNum);
		builder.append(", contractorCode=");
		builder.append(contractorCode);
		builder.append(", contractorName=");
		builder.append(contractorName);
		builder.append(", estimatePrice=");
		builder.append(estimatePrice);
		builder.append(", estimateMeasureDate=");
		builder.append(estimateMeasureDate);
		builder.append(", estimateMeasureDateEnd=");
		builder.append(estimateMeasureDateEnd);
		builder.append(", estimateMeasureDateStrat=");
		builder.append(estimateMeasureDateStrat);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", estimateDetailNum=");
		builder.append(estimateDetailNum);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", UnitPriceCode=");
		builder.append(UnitPriceCode);
		builder.append(", unitContractDevisionAmount=");
		builder.append(unitContractDevisionAmount);
		builder.append(", unitContractWarehouseType=");
		builder.append(unitContractWarehouseType);
		builder.append(", estimateContractTerm=");
		builder.append(estimateContractTerm);
		builder.append(", estimateUnitPrice=");
		builder.append(estimateUnitPrice);
		builder.append(", estimatePricePrepayment=");
		builder.append(estimatePricePrepayment);
		builder.append(", estimatePriceMonth=");
		builder.append(estimatePriceMonth);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UnitPriceCode == null) ? 0 : UnitPriceCode.hashCode());
		result = prime * result + ((contractorCode == null) ? 0 : contractorCode.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((estimateContractTerm == null) ? 0 : estimateContractTerm.hashCode());
		result = prime * result + ((estimateDetailNum == null) ? 0 : estimateDetailNum.hashCode());
		result = prime * result + ((estimateMeasureDate == null) ? 0 : estimateMeasureDate.hashCode());
		result = prime * result + ((estimateMeasureDateEnd == null) ? 0 : estimateMeasureDateEnd.hashCode());
		result = prime * result + ((estimateMeasureDateStrat == null) ? 0 : estimateMeasureDateStrat.hashCode());
		result = prime * result + ((estimateNum == null) ? 0 : estimateNum.hashCode());
		result = prime * result + ((estimatePrice == null) ? 0 : estimatePrice.hashCode());
		result = prime * result + ((estimatePriceMonth == null) ? 0 : estimatePriceMonth.hashCode());
		result = prime * result + ((estimatePricePrepayment == null) ? 0 : estimatePricePrepayment.hashCode());
		result = prime * result + ((estimateUnitPrice == null) ? 0 : estimateUnitPrice.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((unitContractDevisionAmount == null) ? 0 : unitContractDevisionAmount.hashCode());
		result = prime * result + ((unitContractWarehouseType == null) ? 0 : unitContractWarehouseType.hashCode());
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
		K3Estimate other = (K3Estimate) obj;
		if (UnitPriceCode == null) {
			if (other.UnitPriceCode != null)
				return false;
		} else if (!UnitPriceCode.equals(other.UnitPriceCode))
			return false;
		if (contractorCode == null) {
			if (other.contractorCode != null)
				return false;
		} else if (!contractorCode.equals(other.contractorCode))
			return false;
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (estimateContractTerm == null) {
			if (other.estimateContractTerm != null)
				return false;
		} else if (!estimateContractTerm.equals(other.estimateContractTerm))
			return false;
		if (estimateDetailNum == null) {
			if (other.estimateDetailNum != null)
				return false;
		} else if (!estimateDetailNum.equals(other.estimateDetailNum))
			return false;
		if (estimateMeasureDate == null) {
			if (other.estimateMeasureDate != null)
				return false;
		} else if (!estimateMeasureDate.equals(other.estimateMeasureDate))
			return false;
		if (estimateMeasureDateEnd == null) {
			if (other.estimateMeasureDateEnd != null)
				return false;
		} else if (!estimateMeasureDateEnd.equals(other.estimateMeasureDateEnd))
			return false;
		if (estimateMeasureDateStrat == null) {
			if (other.estimateMeasureDateStrat != null)
				return false;
		} else if (!estimateMeasureDateStrat.equals(other.estimateMeasureDateStrat))
			return false;
		if (estimateNum == null) {
			if (other.estimateNum != null)
				return false;
		} else if (!estimateNum.equals(other.estimateNum))
			return false;
		if (estimatePrice == null) {
			if (other.estimatePrice != null)
				return false;
		} else if (!estimatePrice.equals(other.estimatePrice))
			return false;
		if (estimatePriceMonth == null) {
			if (other.estimatePriceMonth != null)
				return false;
		} else if (!estimatePriceMonth.equals(other.estimatePriceMonth))
			return false;
		if (estimatePricePrepayment == null) {
			if (other.estimatePricePrepayment != null)
				return false;
		} else if (!estimatePricePrepayment.equals(other.estimatePricePrepayment))
			return false;
		if (estimateUnitPrice == null) {
			if (other.estimateUnitPrice != null)
				return false;
		} else if (!estimateUnitPrice.equals(other.estimateUnitPrice))
			return false;
		if (mainBusinessCode == null) {
			if (other.mainBusinessCode != null)
				return false;
		} else if (!mainBusinessCode.equals(other.mainBusinessCode))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (unitContractDevisionAmount == null) {
			if (other.unitContractDevisionAmount != null)
				return false;
		} else if (!unitContractDevisionAmount.equals(other.unitContractDevisionAmount))
			return false;
		if (unitContractWarehouseType == null) {
			if (other.unitContractWarehouseType != null)
				return false;
		} else if (!unitContractWarehouseType.equals(other.unitContractWarehouseType))
			return false;
		return true;
	}

	
	

}
