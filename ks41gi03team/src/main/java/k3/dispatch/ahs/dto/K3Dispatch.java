package k3.dispatch.ahs.dto;

public class K3Dispatch {
	private String dispatchCode;
	private String mainBusinessCode;
	private String contractorCode;
	private String releaseCode;
	private String releaseMergeCode;
	private String shippingAddress;
	private String shippingDetailAddress;
	private String driverId;
	private String vehicleCode;
	private String dispatchStartDate;
	private String dispatchDueDate;
	private String memberId;
	private String memberName;
	private String dispatchAcceptDate;
	private String dispatchConsignee;
	public String getDispatchCode() {
		return dispatchCode;
	}
	public void setDispatchCode(String dispatchCode) {
		this.dispatchCode = dispatchCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getContractorCode() {
		return contractorCode;
	}
	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}
	public String getReleaseCode() {
		return releaseCode;
	}
	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}
	public String getReleaseMergeCode() {
		return releaseMergeCode;
	}
	public void setReleaseMergeCode(String releaseMergeCode) {
		this.releaseMergeCode = releaseMergeCode;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingDetailAddress() {
		return shippingDetailAddress;
	}
	public void setShippingDetailAddress(String shippingDetailAddress) {
		this.shippingDetailAddress = shippingDetailAddress;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getVehicleCode() {
		return vehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}
	public String getDispatchStartDate() {
		return dispatchStartDate;
	}
	public void setDispatchStartDate(String dispatchStartDate) {
		this.dispatchStartDate = dispatchStartDate;
	}
	public String getDispatchDueDate() {
		return dispatchDueDate;
	}
	public void setDispatchDueDate(String dispatchDueDate) {
		this.dispatchDueDate = dispatchDueDate;
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
	public String getDispatchAcceptDate() {
		return dispatchAcceptDate;
	}
	public void setDispatchAcceptDate(String dispatchAcceptDate) {
		this.dispatchAcceptDate = dispatchAcceptDate;
	}
	public String getDispatchConsignee() {
		return dispatchConsignee;
	}
	public void setDispatchConsignee(String dispatchConsignee) {
		this.dispatchConsignee = dispatchConsignee;
	}
	@Override
	public String toString() {
		return "K3Dispatch [dispatchCode=" + dispatchCode + ", mainBusinessCode=" + mainBusinessCode
				+ ", contractorCode=" + contractorCode + ", releaseCode=" + releaseCode + ", releaseMergeCode="
				+ releaseMergeCode + ", shippingAddress=" + shippingAddress + ", shippingDetailAddress="
				+ shippingDetailAddress + ", driverId=" + driverId + ", vehicleCode=" + vehicleCode
				+ ", dispatchStartDate=" + dispatchStartDate + ", dispatchDueDate=" + dispatchDueDate + ", memberId="
				+ memberId + ", memberName=" + memberName + ", dispatchAcceptDate=" + dispatchAcceptDate
				+ ", dispatchConsignee=" + dispatchConsignee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractorCode == null) ? 0 : contractorCode.hashCode());
		result = prime * result + ((dispatchAcceptDate == null) ? 0 : dispatchAcceptDate.hashCode());
		result = prime * result + ((dispatchCode == null) ? 0 : dispatchCode.hashCode());
		result = prime * result + ((dispatchConsignee == null) ? 0 : dispatchConsignee.hashCode());
		result = prime * result + ((dispatchDueDate == null) ? 0 : dispatchDueDate.hashCode());
		result = prime * result + ((dispatchStartDate == null) ? 0 : dispatchStartDate.hashCode());
		result = prime * result + ((driverId == null) ? 0 : driverId.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((releaseCode == null) ? 0 : releaseCode.hashCode());
		result = prime * result + ((releaseMergeCode == null) ? 0 : releaseMergeCode.hashCode());
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
		result = prime * result + ((shippingDetailAddress == null) ? 0 : shippingDetailAddress.hashCode());
		result = prime * result + ((vehicleCode == null) ? 0 : vehicleCode.hashCode());
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
		K3Dispatch other = (K3Dispatch) obj;
		if (contractorCode == null) {
			if (other.contractorCode != null)
				return false;
		} else if (!contractorCode.equals(other.contractorCode))
			return false;
		if (dispatchAcceptDate == null) {
			if (other.dispatchAcceptDate != null)
				return false;
		} else if (!dispatchAcceptDate.equals(other.dispatchAcceptDate))
			return false;
		if (dispatchCode == null) {
			if (other.dispatchCode != null)
				return false;
		} else if (!dispatchCode.equals(other.dispatchCode))
			return false;
		if (dispatchConsignee == null) {
			if (other.dispatchConsignee != null)
				return false;
		} else if (!dispatchConsignee.equals(other.dispatchConsignee))
			return false;
		if (dispatchDueDate == null) {
			if (other.dispatchDueDate != null)
				return false;
		} else if (!dispatchDueDate.equals(other.dispatchDueDate))
			return false;
		if (dispatchStartDate == null) {
			if (other.dispatchStartDate != null)
				return false;
		} else if (!dispatchStartDate.equals(other.dispatchStartDate))
			return false;
		if (driverId == null) {
			if (other.driverId != null)
				return false;
		} else if (!driverId.equals(other.driverId))
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
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (releaseCode == null) {
			if (other.releaseCode != null)
				return false;
		} else if (!releaseCode.equals(other.releaseCode))
			return false;
		if (releaseMergeCode == null) {
			if (other.releaseMergeCode != null)
				return false;
		} else if (!releaseMergeCode.equals(other.releaseMergeCode))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		if (shippingDetailAddress == null) {
			if (other.shippingDetailAddress != null)
				return false;
		} else if (!shippingDetailAddress.equals(other.shippingDetailAddress))
			return false;
		if (vehicleCode == null) {
			if (other.vehicleCode != null)
				return false;
		} else if (!vehicleCode.equals(other.vehicleCode))
			return false;
		return true;
	}
	
	
	
	
}
