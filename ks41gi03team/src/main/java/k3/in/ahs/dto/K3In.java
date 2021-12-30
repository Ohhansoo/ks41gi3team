package k3.in.ahs.dto;

public class K3In {
	private String subjectName;
	private String regName;
	private String regDate;
	private String subjectCode;
	private String subjectGCode;
	private String isUse;
	private String isCorrect;
	private String applyYear;
	
	
	public String getSubjectGCode() {
		return subjectGCode;
	}
	public void setSubjectGCode(String subjectGCode) {
		this.subjectGCode = subjectGCode;
	}
	public String getIsUse() {
		return isUse;
	}
	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}
	public String getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}
	public String getApplyYear() {
		return applyYear;
	}
	public void setApplyYear(String applyYear) {
		this.applyYear = applyYear;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getRegName() {
		return regName;
	}
	public void setRegName(String regName) {
		this.regName = regName;
	}
	public String getRegDate() {
		return regDate;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Subject [subjectName=");
		builder.append(subjectName);
		builder.append(", regName=");
		builder.append(regName);
		builder.append(", regDate=");
		builder.append(regDate);
		builder.append(", subjectCode=");
		builder.append(subjectCode);
		builder.append(", subjectGCode=");
		builder.append(subjectGCode);
		builder.append(", isUse=");
		builder.append(isUse);
		builder.append(", isCorrect=");
		builder.append(isCorrect);
		builder.append(", applyYear=");
		builder.append(applyYear);
		builder.append("]");
		return builder.toString();
	}
}
