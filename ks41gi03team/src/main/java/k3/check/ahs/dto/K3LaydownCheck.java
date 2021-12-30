package k3.check.ahs.dto;

public class K3LaydownCheck {
	private String laydownCheckCode;
	private String mainBusinessCode;
	private String contractorName;
	private String contractorId;
	private String laydownGoodsName;
	private int laydownGoodsCount;
	private String manufacturedDate;
	private String expiratonDate;
	private String laydownDate;
	private String laydownCheckResult;
	private String laydownCheckManager;
	private String laydownCheck;
	private String dockName;
	private String memberId;
	private String memberName;
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
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
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String getExpiratonDate() {
		return expiratonDate;
	}
	public void setExpiratonDate(String expiratonDate) {
		this.expiratonDate = expiratonDate;
	}
	public String getLaydownDate() {
		return laydownDate;
	}
	public void setLaydownDate(String laydownDate) {
		this.laydownDate = laydownDate;
	}
	public String getLaydownCheckResult() {
		return laydownCheckResult;
	}
	public void setLaydownCheckResult(String laydownCheckResult) {
		this.laydownCheckResult = laydownCheckResult;
	}
	public String getLaydownCheckManager() {
		return laydownCheckManager;
	}
	public void setLaydownCheckManager(String laydownCheckManager) {
		this.laydownCheckManager = laydownCheckManager;
	}
	public String getLaydownCheck() {
		return laydownCheck;
	}
	public void setLaydownCheck(String laydownCheck) {
		this.laydownCheck = laydownCheck;
	}
	public String getDockName() {
		return dockName;
	}
	public void setDockName(String dockName) {
		this.dockName = dockName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "K3LaydownCheck [laydownCheckCode=" + laydownCheckCode + ", mainBusinessCode=" + mainBusinessCode
				+ ", contractorName=" + contractorName + ", contractorId=" + contractorId + ", laydownGoodsName="
				+ laydownGoodsName + ", laydownGoodsCount=" + laydownGoodsCount + ", manufacturedDate="
				+ manufacturedDate + ", expiratonDate=" + expiratonDate + ", laydownDate=" + laydownDate
				+ ", laydownCheckResult=" + laydownCheckResult + ", laydownCheckManager=" + laydownCheckManager
				+ ", laydownCheck=" + laydownCheck + ", dockName=" + dockName + ", memberId=" + memberId
				+ ", memberName=" + memberName + "]";
	}
	
	

	
}
