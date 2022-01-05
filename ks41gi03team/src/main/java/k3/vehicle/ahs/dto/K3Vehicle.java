package k3.vehicle.ahs.dto;

public class K3Vehicle {
	private String vehicleCode;
	private String vehicleTonage;
	private String vehicleType;
	private String vehicleInspectionDate;
	private String memberId;
	private String vehicleManufacturer;
	private String vehicleDriveAvailability;
	
	public String getVehicleCode() {
		return vehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}
	public String getVehicleTonage() {
		return vehicleTonage;
	}
	public void setVehicleTonage(String vehicleTonage) {
		this.vehicleTonage = vehicleTonage;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleInspectionDate() {
		return vehicleInspectionDate;
	}
	public void setVehicleInspectionDate(String vehicleInspectionDate) {
		this.vehicleInspectionDate = vehicleInspectionDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getVehicleManufacturer() {
		return vehicleManufacturer;
	}
	public void setVehicleManufacturer(String vehicleManufacturer) {
		this.vehicleManufacturer = vehicleManufacturer;
	}
	public String getVehicleDriveAvailability() {
		return vehicleDriveAvailability;
	}
	public void setVehicleDriveAvailability(String vehicleDriveAvailability) {
		this.vehicleDriveAvailability = vehicleDriveAvailability;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Vehicle [vehicleCode=");
		builder.append(vehicleCode);
		builder.append(", vehicleTonage=");
		builder.append(vehicleTonage);
		builder.append(", vehicleType=");
		builder.append(vehicleType);
		builder.append(", vehicleInspectionDate=");
		builder.append(vehicleInspectionDate);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", vehicleManufacturer=");
		builder.append(vehicleManufacturer);
		builder.append(", vehicleDriveAvailability=");
		builder.append(vehicleDriveAvailability);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((vehicleCode == null) ? 0 : vehicleCode.hashCode());
		result = prime * result + ((vehicleDriveAvailability == null) ? 0 : vehicleDriveAvailability.hashCode());
		result = prime * result + ((vehicleInspectionDate == null) ? 0 : vehicleInspectionDate.hashCode());
		result = prime * result + ((vehicleManufacturer == null) ? 0 : vehicleManufacturer.hashCode());
		result = prime * result + ((vehicleTonage == null) ? 0 : vehicleTonage.hashCode());
		result = prime * result + ((vehicleType == null) ? 0 : vehicleType.hashCode());
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
		K3Vehicle other = (K3Vehicle) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (vehicleCode == null) {
			if (other.vehicleCode != null)
				return false;
		} else if (!vehicleCode.equals(other.vehicleCode))
			return false;
		if (vehicleDriveAvailability == null) {
			if (other.vehicleDriveAvailability != null)
				return false;
		} else if (!vehicleDriveAvailability.equals(other.vehicleDriveAvailability))
			return false;
		if (vehicleInspectionDate == null) {
			if (other.vehicleInspectionDate != null)
				return false;
		} else if (!vehicleInspectionDate.equals(other.vehicleInspectionDate))
			return false;
		if (vehicleManufacturer == null) {
			if (other.vehicleManufacturer != null)
				return false;
		} else if (!vehicleManufacturer.equals(other.vehicleManufacturer))
			return false;
		if (vehicleTonage == null) {
			if (other.vehicleTonage != null)
				return false;
		} else if (!vehicleTonage.equals(other.vehicleTonage))
			return false;
		if (vehicleType == null) {
			if (other.vehicleType != null)
				return false;
		} else if (!vehicleType.equals(other.vehicleType))
			return false;
		return true;
	}

	
	


}
