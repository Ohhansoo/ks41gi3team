package k3.location.ahs.dto;

public class K3Location {
	private String locationCode;
	private String locationNote;
	private String locationState;
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLocationNote() {
		return locationNote;
	}
	public void setLocationNote(String locationNote) {
		this.locationNote = locationNote;
	}
	public String getLocationState() {
		return locationState;
	}
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Location [locationCode=");
		builder.append(locationCode);
		builder.append(", locationNote=");
		builder.append(locationNote);
		builder.append(", locationState=");
		builder.append(locationState);
		builder.append("]");
		return builder.toString();
	}
	
}
