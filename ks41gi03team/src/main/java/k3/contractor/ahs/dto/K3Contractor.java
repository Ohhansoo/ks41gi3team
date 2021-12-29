package k3.contractor.ahs.dto;

public class K3Contractor {

	//거래처 간단조회 (k3_tb_contractor_staff, k3_tb_contractor)
	private String contractorCode;
	private String contractorName;
	private String contractorItem;
	private String contractorStatus;
	private String contractorDevision;
	private String contractorPhone;
	private String contractorRegistrationDate;
	private String contractorId;
	private String contractorState;
	private String memberId;
	
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
	public String getContractorItem() {
		return contractorItem;
	}
	public void setContractorItem(String contractorItem) {
		this.contractorItem = contractorItem;
	}
	public String getContractorStatus() {
		return contractorStatus;
	}
	public void setContractorStatus(String contractorStatus) {
		this.contractorStatus = contractorStatus;
	}
	public String getContractorDevision() {
		return contractorDevision;
	}
	public void setContractorDevision(String contractorDevision) {
		this.contractorDevision = contractorDevision;
	}
	public String getContractorPhone() {
		return contractorPhone;
	}
	public void setContractorPhone(String contractorPhone) {
		this.contractorPhone = contractorPhone;
	}
	public String getContractorRegistrationDate() {
		return contractorRegistrationDate;
	}
	public void setContractorRegistrationDate(String contractorRegistrationDate) {
		this.contractorRegistrationDate = contractorRegistrationDate;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getContractorState() {
		return contractorState;
	}
	public void setContractorState(String contractorState) {
		this.contractorState = contractorState;
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
		builder.append("K3Contractor [contractorCode=");
		builder.append(contractorCode);
		builder.append(", contractorName=");
		builder.append(contractorName);
		builder.append(", contractorItem=");
		builder.append(contractorItem);
		builder.append(", contractorStatus=");
		builder.append(contractorStatus);
		builder.append(", contractorDevision=");
		builder.append(contractorDevision);
		builder.append(", contractorPhone=");
		builder.append(contractorPhone);
		builder.append(", contractorRegistrationDate=");
		builder.append(contractorRegistrationDate);
		builder.append(", contractorId=");
		builder.append(contractorId);
		builder.append(", contractorState=");
		builder.append(contractorState);
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
		result = prime * result + ((contractorDevision == null) ? 0 : contractorDevision.hashCode());
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorItem == null) ? 0 : contractorItem.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((contractorPhone == null) ? 0 : contractorPhone.hashCode());
		result = prime * result + ((contractorRegistrationDate == null) ? 0 : contractorRegistrationDate.hashCode());
		result = prime * result + ((contractorState == null) ? 0 : contractorState.hashCode());
		result = prime * result + ((contractorStatus == null) ? 0 : contractorStatus.hashCode());
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
		K3Contractor other = (K3Contractor) obj;
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
		if (contractorItem == null) {
			if (other.contractorItem != null)
				return false;
		} else if (!contractorItem.equals(other.contractorItem))
			return false;
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (contractorPhone == null) {
			if (other.contractorPhone != null)
				return false;
		} else if (!contractorPhone.equals(other.contractorPhone))
			return false;
		if (contractorRegistrationDate == null) {
			if (other.contractorRegistrationDate != null)
				return false;
		} else if (!contractorRegistrationDate.equals(other.contractorRegistrationDate))
			return false;
		if (contractorState == null) {
			if (other.contractorState != null)
				return false;
		} else if (!contractorState.equals(other.contractorState))
			return false;
		if (contractorStatus == null) {
			if (other.contractorStatus != null)
				return false;
		} else if (!contractorStatus.equals(other.contractorStatus))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	
	
	//거래처(매출) 상세조회 ()
	
	
	//거래처(비용) 상세조회 ()
	
}
