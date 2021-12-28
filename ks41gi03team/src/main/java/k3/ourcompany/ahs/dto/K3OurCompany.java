package k3.ourcompany.ahs.dto;

import java.util.Objects;

public class K3OurCompany {
	private String ourCompanyCode;
	private String ourCompanyBusinessPlaceCode;
	private String ourCompanyBusinessName;
	private String ourCompanyBusinessCheifName;
	private String ourCompanyWorkPlaceAddr;
	private String ourCompanyStatus;
	private String ourCompanyWorkType;
	private String ourCompanyEmail;
	
	public String getOurCompanyCode() {
		return ourCompanyCode;
	}
	public void setOurCompanyCode(String ourCompanyCode) {
		this.ourCompanyCode = ourCompanyCode;
	}
	public String getOurCompanyBusinessPlaceCode() {
		return ourCompanyBusinessPlaceCode;
	}
	public void setOurCompanyBusinessPlaceCode(String ourCompanyBusinessPlaceCode) {
		this.ourCompanyBusinessPlaceCode = ourCompanyBusinessPlaceCode;
	}
	public String getOurCompanyBusinessName() {
		return ourCompanyBusinessName;
	}
	public void setOurCompanyBusinessName(String ourCompanyBusinessName) {
		this.ourCompanyBusinessName = ourCompanyBusinessName;
	}
	public String getOurCompanyBusinessCheifName() {
		return ourCompanyBusinessCheifName;
	}
	public void setOurCompanyBusinessCheifName(String ourCompanyBusinessCheifName) {
		this.ourCompanyBusinessCheifName = ourCompanyBusinessCheifName;
	}
	public String getOurCompanyWorkPlaceAddr() {
		return ourCompanyWorkPlaceAddr;
	}
	public void setOurCompanyWorkPlaceAddr(String ourCompanyWorkPlaceAddr) {
		this.ourCompanyWorkPlaceAddr = ourCompanyWorkPlaceAddr;
	}
	public String getOurCompanyStatus() {
		return ourCompanyStatus;
	}
	public void setOurCompanyStatus(String ourCompanyStatus) {
		this.ourCompanyStatus = ourCompanyStatus;
	}
	public String getOurCompanyWorkType() {
		return ourCompanyWorkType;
	}
	public void setOurCompanyWorkType(String ourCompanyWorkType) {
		this.ourCompanyWorkType = ourCompanyWorkType;
	}
	public String getOurCompanyEmail() {
		return ourCompanyEmail;
	}
	public void setOurCompanyEmail(String ourCompanyEmail) {
		this.ourCompanyEmail = ourCompanyEmail;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ourCompanyBusinessCheifName, ourCompanyBusinessName, ourCompanyBusinessPlaceCode,
				ourCompanyCode, ourCompanyEmail, ourCompanyStatus, ourCompanyWorkPlaceAddr, ourCompanyWorkType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		K3OurCompany other = (K3OurCompany) obj;
		return Objects.equals(ourCompanyBusinessCheifName, other.ourCompanyBusinessCheifName)
				&& Objects.equals(ourCompanyBusinessName, other.ourCompanyBusinessName)
				&& Objects.equals(ourCompanyBusinessPlaceCode, other.ourCompanyBusinessPlaceCode)
				&& Objects.equals(ourCompanyCode, other.ourCompanyCode)
				&& Objects.equals(ourCompanyEmail, other.ourCompanyEmail)
				&& Objects.equals(ourCompanyStatus, other.ourCompanyStatus)
				&& Objects.equals(ourCompanyWorkPlaceAddr, other.ourCompanyWorkPlaceAddr)
				&& Objects.equals(ourCompanyWorkType, other.ourCompanyWorkType);
	}
	@Override
	public String toString() {
		return "K3OurCompany [ourCompanyCode=" + ourCompanyCode + ", ourCompanyBusinessPlaceCode="
				+ ourCompanyBusinessPlaceCode + ", ourCompanyBusinessName=" + ourCompanyBusinessName
				+ ", ourCompanyBusinessCheifName=" + ourCompanyBusinessCheifName + ", ourCompanyWorkPlaceAddr="
				+ ourCompanyWorkPlaceAddr + ", ourCompanyStatus=" + ourCompanyStatus + ", ourCompanyWorkType="
				+ ourCompanyWorkType + ", ourCompanyEmail=" + ourCompanyEmail + "]";
	}
	

}
