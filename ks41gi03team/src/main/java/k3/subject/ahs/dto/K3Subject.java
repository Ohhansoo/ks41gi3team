package k3.subject.ahs.dto;

public class K3Subject {
	
	private String asName;
	private String memberId;
	private String asRegDate;
	private int asCode;
	private int asGCode;
	private String asUse;
	private String asCorrect;
	private String asYear;
	
	
	public String getAsName() {
		return asName;
	}
	public void setAsName(String asName) {
		this.asName = asName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getAsRegDate() {
		return asRegDate;
	}
	public void setAsRegDate(String asRegDate) {
		this.asRegDate = asRegDate;
	}
	public int getAsCode() {
		return asCode;
	}
	public void setAsCode(int asCode) {
		this.asCode = asCode;
	}
	public int getAsGCode() {
		return asGCode;
	}
	public void setAsGCode(int asGCode) {
		this.asGCode = asGCode;
	}
	public String getAsUse() {
		return asUse;
	}
	public void setAsUse(String asUse) {
		this.asUse = asUse;
	}
	public String getAsCorrect() {
		return asCorrect;
	}
	public void setAsCorrect(String asCorrect) {
		this.asCorrect = asCorrect;
	}
	public String getAsYear() {
		return asYear;
	}
	public void setAsYear(String asYear) {
		this.asYear = asYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Subject [asName=");
		builder.append(asName);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", asRegDate=");
		builder.append(asRegDate);
		builder.append(", asCode=");
		builder.append(asCode);
		builder.append(", asGCode=");
		builder.append(asGCode);
		builder.append(", asUse=");
		builder.append(asUse);
		builder.append(", asCorrect=");
		builder.append(asCorrect);
		builder.append(", asYear=");
		builder.append(asYear);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
