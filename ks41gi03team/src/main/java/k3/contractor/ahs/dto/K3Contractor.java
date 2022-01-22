package k3.contractor.ahs.dto;

public class K3Contractor {

	//거래처 등록기간 조회
	private String contractorRegistrationDateStart;
	private String contractorRegistrationDateEnd;
	
	public String getContractorRegistrationDateStart() {
		return contractorRegistrationDateStart;
	}
	public void setContractorRegistrationDateStart(String contractorRegistrationDateStart) {
		this.contractorRegistrationDateStart = contractorRegistrationDateStart;
	}
	public String getContractorRegistrationDateEnd() {
		return contractorRegistrationDateEnd;
	}
	public void setContractorRegistrationDateEnd(String contractorRegistrationDateEnd) {
		this.contractorRegistrationDateEnd = contractorRegistrationDateEnd;
	}

	
	
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
		builder.append("K3Contractor [contractorRegistrationDateStart=");
		builder.append(contractorRegistrationDateStart);
		builder.append(", contractorRegistrationDateEnd=");
		builder.append(contractorRegistrationDateEnd);
		builder.append(", contractorCode=");
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

	

	
	
	//거래처(매출) 상세조회 ()
	
	
	//거래처(비용) 상세조회 ()
	
}
