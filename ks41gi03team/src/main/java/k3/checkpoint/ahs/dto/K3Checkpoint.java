package k3.checkpoint.ahs.dto;

public class K3Checkpoint {
	private String vehicleCheckpointCode;
	private String driverId;
	private String vehicleCode;
	private String vehicleArrivalDate;
	private String vehicleShipmentDate;
	
	
	public String getVehicleCheckpointCode() {
		return vehicleCheckpointCode;
	}
	public void setVehicleCheckpointCode(String vehicleCheckpointCode) {
		this.vehicleCheckpointCode = vehicleCheckpointCode;
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
	public String getVehicleArrivalDate() {
		return vehicleArrivalDate;
	}
	public void setVehicleArrivalDate(String vehicleArrivalDate) {
		this.vehicleArrivalDate = vehicleArrivalDate;
	}
	public String getVehicleShipmentDate() {
		return vehicleShipmentDate;
	}
	public void setVehicleShipmentDate(String vehicleShipmentDate) {
		this.vehicleShipmentDate = vehicleShipmentDate;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Checkpoint [vehicleCheckpointCode=");
		builder.append(vehicleCheckpointCode);
		builder.append(", driverId=");
		builder.append(driverId);
		builder.append(", vehicleCode=");
		builder.append(vehicleCode);
		builder.append(", vehicleArrivalDate=");
		builder.append(vehicleArrivalDate);
		builder.append(", vehicleShipmentDate=");
		builder.append(vehicleShipmentDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driverId == null) ? 0 : driverId.hashCode());
		result = prime * result + ((vehicleArrivalDate == null) ? 0 : vehicleArrivalDate.hashCode());
		result = prime * result + ((vehicleCheckpointCode == null) ? 0 : vehicleCheckpointCode.hashCode());
		result = prime * result + ((vehicleCode == null) ? 0 : vehicleCode.hashCode());
		result = prime * result + ((vehicleShipmentDate == null) ? 0 : vehicleShipmentDate.hashCode());
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
		K3Checkpoint other = (K3Checkpoint) obj;
		if (driverId == null) {
			if (other.driverId != null)
				return false;
		} else if (!driverId.equals(other.driverId))
			return false;
		if (vehicleArrivalDate == null) {
			if (other.vehicleArrivalDate != null)
				return false;
		} else if (!vehicleArrivalDate.equals(other.vehicleArrivalDate))
			return false;
		if (vehicleCheckpointCode == null) {
			if (other.vehicleCheckpointCode != null)
				return false;
		} else if (!vehicleCheckpointCode.equals(other.vehicleCheckpointCode))
			return false;
		if (vehicleCode == null) {
			if (other.vehicleCode != null)
				return false;
		} else if (!vehicleCode.equals(other.vehicleCode))
			return false;
		if (vehicleShipmentDate == null) {
			if (other.vehicleShipmentDate != null)
				return false;
		} else if (!vehicleShipmentDate.equals(other.vehicleShipmentDate))
			return false;
		return true;
	}
	
	
	
	
	
}
