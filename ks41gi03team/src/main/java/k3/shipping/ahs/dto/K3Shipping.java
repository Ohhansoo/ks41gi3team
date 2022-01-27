package k3.shipping.ahs.dto;

public class K3Shipping {
	private String shippingCode;
	private String mainBusinessCode;
	private String releaseCode;
	private String releaseMergeCode;
	private String shippingAddress;
	private String shippingDetailAddress;
	private String memberId;
	private String shippingDetail;
	private String driverId;
	private String shippingTracking;
	public String getShippingCode() {
		return shippingCode;
	}
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getShippingDetail() {
		return shippingDetail;
	}
	public void setShippingDetail(String shippingDetail) {
		this.shippingDetail = shippingDetail;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getShippingTracking() {
		return shippingTracking;
	}
	public void setShippingTracking(String shippingTracking) {
		this.shippingTracking = shippingTracking;
	}
	@Override
	public String toString() {
		return "K3Shipping [shippingCode=" + shippingCode + ", mainBusinessCode=" + mainBusinessCode + ", releaseCode="
				+ releaseCode + ", releaseMergeCode=" + releaseMergeCode + ", shippingAddress=" + shippingAddress
				+ ", shippingDetailAddress=" + shippingDetailAddress + ", memberId=" + memberId + ", shippingDetail="
				+ shippingDetail + ", driverId=" + driverId + ", shippingTracking=" + shippingTracking + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driverId == null) ? 0 : driverId.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((releaseCode == null) ? 0 : releaseCode.hashCode());
		result = prime * result + ((releaseMergeCode == null) ? 0 : releaseMergeCode.hashCode());
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
		result = prime * result + ((shippingCode == null) ? 0 : shippingCode.hashCode());
		result = prime * result + ((shippingDetail == null) ? 0 : shippingDetail.hashCode());
		result = prime * result + ((shippingDetailAddress == null) ? 0 : shippingDetailAddress.hashCode());
		result = prime * result + ((shippingTracking == null) ? 0 : shippingTracking.hashCode());
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
		K3Shipping other = (K3Shipping) obj;
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
		if (shippingCode == null) {
			if (other.shippingCode != null)
				return false;
		} else if (!shippingCode.equals(other.shippingCode))
			return false;
		if (shippingDetail == null) {
			if (other.shippingDetail != null)
				return false;
		} else if (!shippingDetail.equals(other.shippingDetail))
			return false;
		if (shippingDetailAddress == null) {
			if (other.shippingDetailAddress != null)
				return false;
		} else if (!shippingDetailAddress.equals(other.shippingDetailAddress))
			return false;
		if (shippingTracking == null) {
			if (other.shippingTracking != null)
				return false;
		} else if (!shippingTracking.equals(other.shippingTracking))
			return false;
		return true;
	}
	
	
	

}
