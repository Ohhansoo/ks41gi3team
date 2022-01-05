package k3.loginstate.ahs.dto;

public class K3LoginState {
	private String loginCode;
	private String mainBusinessCode;
	private String memberId;
	private String loginDate;
	private String loginFailCount;
	private String loginLatestTryDate;
	private String loginAccessState;
	private String loginLogoutDate;
	private String loginIpAddress;
	private String loginMacAddress;
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
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
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
	public String getLoginFailCount() {
		return loginFailCount;
	}
	public void setLoginFailCount(String loginFailCount) {
		this.loginFailCount = loginFailCount;
	}
	public String getLoginLatestTryDate() {
		return loginLatestTryDate;
	}
	public void setLoginLatestTryDate(String loginLatestTryDate) {
		this.loginLatestTryDate = loginLatestTryDate;
	}
	public String getLoginAccessState() {
		return loginAccessState;
	}
	public void setLoginAccessState(String loginAccessState) {
		this.loginAccessState = loginAccessState;
	}
	public String getLoginLogoutDate() {
		return loginLogoutDate;
	}
	public void setLoginLogoutDate(String loginLogoutDate) {
		this.loginLogoutDate = loginLogoutDate;
	}
	public String getLoginIpAddress() {
		return loginIpAddress;
	}
	public void setLoginIpAddress(String loginIpAddress) {
		this.loginIpAddress = loginIpAddress;
	}
	public String getLoginMacAddress() {
		return loginMacAddress;
	}
	public void setLoginMacAddress(String loginMacAddress) {
		this.loginMacAddress = loginMacAddress;
	}
	@Override
	public String toString() {
		return "K3LoginState [loginCode=" + loginCode + ", mainBusinessCode=" + mainBusinessCode + ", memberId="
				+ memberId + ", loginDate=" + loginDate + ", loginFailCount=" + loginFailCount + ", loginLatestTryDate="
				+ loginLatestTryDate + ", loginAccessState=" + loginAccessState + ", loginLogoutDate=" + loginLogoutDate
				+ ", loginIpAddress=" + loginIpAddress + ", loginMacAddress=" + loginMacAddress + "]";
	}
	
	
}
