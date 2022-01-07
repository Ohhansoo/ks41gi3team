package k3.contract.ahs.dto;

public class K3Contract {
	//hs 거래처명 찾아오기
	private String contractorType;
	private String contractorRepresentative;
	
	//계약 간단조회(k3_tb_contract_simple)
	private String contractCode;
	private String contractorName;
	private String contractorCode;
	private String contractorDevision;
	private String contractState;
	private String contractSingningDate;
	private String contractorId;
	private String memberId;
	public String getContractorType() {
		return contractorType;
	}
	public void setContractorType(String contractorType) {
		this.contractorType = contractorType;
	}
	public String getContractorRepresentative() {
		return contractorRepresentative;
	}
	public void setContractorRepresentative(String contractorRepresentative) {
		this.contractorRepresentative = contractorRepresentative;
	}
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getContractorCode() {
		return contractorCode;
	}
	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}
	public String getContractorDevision() {
		return contractorDevision;
	}
	public void setContractorDevision(String contractorDevision) {
		this.contractorDevision = contractorDevision;
	}
	public String getContractState() {
		return contractState;
	}
	public void setContractState(String contractState) {
		this.contractState = contractState;
	}
	public String getContractSingningDate() {
		return contractSingningDate;
	}
	public void setContractSingningDate(String contractSingningDate) {
		this.contractSingningDate = contractSingningDate;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "K3Contract [contractorType=" + contractorType + ", contractorRepresentative=" + contractorRepresentative
				+ ", contractCode=" + contractCode + ", contractorName=" + contractorName + ", contractorCode="
				+ contractorCode + ", contractorDevision=" + contractorDevision + ", contractState=" + contractState
				+ ", contractSingningDate=" + contractSingningDate + ", contractorId=" + contractorId + ", memberId="
				+ memberId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractCode == null) ? 0 : contractCode.hashCode());
		result = prime * result + ((contractSingningDate == null) ? 0 : contractSingningDate.hashCode());
		result = prime * result + ((contractState == null) ? 0 : contractState.hashCode());
		result = prime * result + ((contractorCode == null) ? 0 : contractorCode.hashCode());
		result = prime * result + ((contractorDevision == null) ? 0 : contractorDevision.hashCode());
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((contractorRepresentative == null) ? 0 : contractorRepresentative.hashCode());
		result = prime * result + ((contractorType == null) ? 0 : contractorType.hashCode());
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
		K3Contract other = (K3Contract) obj;
		if (contractCode == null) {
			if (other.contractCode != null)
				return false;
		} else if (!contractCode.equals(other.contractCode))
			return false;
		if (contractSingningDate == null) {
			if (other.contractSingningDate != null)
				return false;
		} else if (!contractSingningDate.equals(other.contractSingningDate))
			return false;
		if (contractState == null) {
			if (other.contractState != null)
				return false;
		} else if (!contractState.equals(other.contractState))
			return false;
		if (contractorCode == null) {
			if (other.contractorCode != null)
				return false;
		} else if (!contractorCode.equals(other.contractorCode))
			return false;
		if (contractorDevision == null) {
			if (other.contractorDevision != null)
				return false;
		} else if (!contractorDevision.equals(other.contractorDevision))
			return false;
		if (contractorId == null) {
			if (other.contractorId != null)
				return false;
		} else if (!contractorId.equals(other.contractorId))
			return false;
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (contractorRepresentative == null) {
			if (other.contractorRepresentative != null)
				return false;
		} else if (!contractorRepresentative.equals(other.contractorRepresentative))
			return false;
		if (contractorType == null) {
			if (other.contractorType != null)
				return false;
		} else if (!contractorType.equals(other.contractorType))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	

}
