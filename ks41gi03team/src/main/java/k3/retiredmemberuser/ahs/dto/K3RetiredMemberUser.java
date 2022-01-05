package k3.retiredmemberuser.ahs.dto;

public class K3RetiredMemberUser {
	private String memberRetiredCode;
	private String mainBusinessCode;
	private String memberId;
	private String memberRetiredReason;
	private String memberRetiredDate;
	private String memberRetirementSignedDate;
	public String getMemberRetiredCode() {
		return memberRetiredCode;
	}
	public void setMemberRetiredCode(String memberRetiredCode) {
		this.memberRetiredCode = memberRetiredCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberRetiredReason() {
		return memberRetiredReason;
	}
	public void setMemberRetiredReason(String memberRetiredReason) {
		this.memberRetiredReason = memberRetiredReason;
	}
	public String getMemberRetiredDate() {
		return memberRetiredDate;
	}
	public void setMemberRetiredDate(String memberRetiredDate) {
		this.memberRetiredDate = memberRetiredDate;
	}
	public String getMemberRetirementSignedDate() {
		return memberRetirementSignedDate;
	}
	public void setMemberRetirementSignedDate(String memberRetirementSignedDate) {
		this.memberRetirementSignedDate = memberRetirementSignedDate;
	}
	
	
	
	@Override
	public String toString() {
		return "K3RetiredMemberUser [memberRetiredCode=" + memberRetiredCode + ", mainBusinessCode=" + mainBusinessCode
				+ ", memberId=" + memberId + ", memberRetiredReason=" + memberRetiredReason + ", memberRetiredDate="
				+ memberRetiredDate + ", memberRetirementSignedDate=" + memberRetirementSignedDate + "]";
	}

	
}
