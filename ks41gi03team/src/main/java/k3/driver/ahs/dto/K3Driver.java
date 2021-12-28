package k3.driver.ahs.dto;

public class K3Driver {
	private String driverId;
	private String driverName;
	private String driverAddr;
	private String driverPhone;
	private String driverRegDate;
	private String driverPerformanceGrade;
	private String driverLicenseType;
	private String driverQualificationType;
	
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverAddr() {
		return driverAddr;
	}
	public void setDriverAddr(String driverAddr) {
		this.driverAddr = driverAddr;
	}
	public String getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public String getDriverRegDate() {
		return driverRegDate;
	}
	public void setDriverRegDate(String driverRegDate) {
		this.driverRegDate = driverRegDate;
	}
	public String getDriverPerformanceGrade() {
		return driverPerformanceGrade;
	}
	public void setDriverPerformanceGrade(String driverPerformanceGrade) {
		this.driverPerformanceGrade = driverPerformanceGrade;
	}
	public String getDriverLicenseType() {
		return driverLicenseType;
	}
	public void setDriverLicenseType(String driverLicenseType) {
		this.driverLicenseType = driverLicenseType;
	}
	public String getDriverQualificationType() {
		return driverQualificationType;
	}
	public void setDriverQualificationType(String driverQualificationType) {
		this.driverQualificationType = driverQualificationType;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Driver [driverId=");
		builder.append(driverId);
		builder.append(", driverName=");
		builder.append(driverName);
		builder.append(", driverAddr=");
		builder.append(driverAddr);
		builder.append(", driverPhone=");
		builder.append(driverPhone);
		builder.append(", driverRegDate=");
		builder.append(driverRegDate);
		builder.append(", driverPerformanceGrade=");
		builder.append(driverPerformanceGrade);
		builder.append(", driverLicenseType=");
		builder.append(driverLicenseType);
		builder.append(", driverQualificationType=");
		builder.append(driverQualificationType);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driverAddr == null) ? 0 : driverAddr.hashCode());
		result = prime * result + ((driverId == null) ? 0 : driverId.hashCode());
		result = prime * result + ((driverLicenseType == null) ? 0 : driverLicenseType.hashCode());
		result = prime * result + ((driverName == null) ? 0 : driverName.hashCode());
		result = prime * result + ((driverPerformanceGrade == null) ? 0 : driverPerformanceGrade.hashCode());
		result = prime * result + ((driverPhone == null) ? 0 : driverPhone.hashCode());
		result = prime * result + ((driverQualificationType == null) ? 0 : driverQualificationType.hashCode());
		result = prime * result + ((driverRegDate == null) ? 0 : driverRegDate.hashCode());
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
		K3Driver other = (K3Driver) obj;
		if (driverAddr == null) {
			if (other.driverAddr != null)
				return false;
		} else if (!driverAddr.equals(other.driverAddr))
			return false;
		if (driverId == null) {
			if (other.driverId != null)
				return false;
		} else if (!driverId.equals(other.driverId))
			return false;
		if (driverLicenseType == null) {
			if (other.driverLicenseType != null)
				return false;
		} else if (!driverLicenseType.equals(other.driverLicenseType))
			return false;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		if (driverPerformanceGrade == null) {
			if (other.driverPerformanceGrade != null)
				return false;
		} else if (!driverPerformanceGrade.equals(other.driverPerformanceGrade))
			return false;
		if (driverPhone == null) {
			if (other.driverPhone != null)
				return false;
		} else if (!driverPhone.equals(other.driverPhone))
			return false;
		if (driverQualificationType == null) {
			if (other.driverQualificationType != null)
				return false;
		} else if (!driverQualificationType.equals(other.driverQualificationType))
			return false;
		if (driverRegDate == null) {
			if (other.driverRegDate != null)
				return false;
		} else if (!driverRegDate.equals(other.driverRegDate))
			return false;
		return true;
	}
	
	
	

	
}

