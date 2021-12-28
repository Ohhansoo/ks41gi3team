package k3.memberuser.ahs.dto;

public class K3MemberUser {
	private String memberId;
	private String memberPassword;
	private String mainBusinessCode;
	private String memberName;
	private String memberGender;
	private String memberAddr;
	private String memberPhone;
	private String memberResidentRegistrationNumber;
	private String memberState;
	private String memberRegDate;
	private String memberHiredDate;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberResidentRegistrationNumber() {
		return memberResidentRegistrationNumber;
	}
	public void setMemberResidentRegistrationNumber(String memberResidentRegistrationNumber) {
		this.memberResidentRegistrationNumber = memberResidentRegistrationNumber;
	}
	public String getMemberState() {
		return memberState;
	}
	public void setMemberState(String memberState) {
		this.memberState = memberState;
	}
	public String getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public String getMemberHiredDate() {
		return memberHiredDate;
	}
	public void setMemberHiredDate(String memberHiredDate) {
		this.memberHiredDate = memberHiredDate;
	}
	@Override
	public String toString() {
		return "K3MemberUser [memberId=" + memberId + ", memberPassword=" + memberPassword + ", mainBusinessCode="
				+ mainBusinessCode + ", memberName=" + memberName + ", memberGender=" + memberGender + ", memberAddr="
				+ memberAddr + ", memberPhone=" + memberPhone + ", memberResidentRegistrationNumber="
				+ memberResidentRegistrationNumber + ", memberState=" + memberState + ", memberRegDate=" + memberRegDate
				+ ", memberHiredDate=" + memberHiredDate + "]";
	}
	

}
