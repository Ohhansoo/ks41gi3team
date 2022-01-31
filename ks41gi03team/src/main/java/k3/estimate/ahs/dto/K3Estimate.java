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
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractorCode == null) ? 0 : contractorCode.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((estimateMeasureDate == null) ? 0 : estimateMeasureDate.hashCode());
		result = prime * result + ((estimateMeasureDateEnd == null) ? 0 : estimateMeasureDateEnd.hashCode());
		result = prime * result + ((estimateMeasureDateStrat == null) ? 0 : estimateMeasureDateStrat.hashCode());
		result = prime * result + ((estimateNum == null) ? 0 : estimateNum.hashCode());
		result = prime * result + ((estimatePrice == null) ? 0 : estimatePrice.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
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
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}

	
	

}
