package k3.in.ahs.dto;

public class K3In {
	private String inCode;
	private String mainBusinessCode;
	private String memberId;
	private String estimateNum;
	private String estimatePrice;
	private String inPayMethod;
	private String inPayDate;
	private String inPayCheck;
	private String inCheck;
	private String inPayRemain;
	private String inReceipe;
	private String inReceipeDate;
	private String memberName;
	
	
	
	public String getInCode() {
		return inCode;
	}



	public void setInCode(String inCode) {
		this.inCode = inCode;
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



	public String getEstimateNum() {
		return estimateNum;
	}



	public void setEstimateNum(String estimateNum) {
		this.estimateNum = estimateNum;
	}



	public String getEstimatePrice() {
		return estimatePrice;
	}



	public void setEstimatePrice(String estimatePrice) {
		this.estimatePrice = estimatePrice;
	}



	public String getInPayMethod() {
		return inPayMethod;
	}



	public void setInPayMethod(String inPayMethod) {
		this.inPayMethod = inPayMethod;
	}



	public String getInPayDate() {
		return inPayDate;
	}



	public void setInPayDate(String inPayDate) {
		this.inPayDate = inPayDate;
	}



	public String getInPayCheck() {
		return inPayCheck;
	}



	public void setInPayCheck(String inPayCheck) {
		this.inPayCheck = inPayCheck;
	}



	public String getInCheck() {
		return inCheck;
	}



	public void setInCheck(String inCheck) {
		this.inCheck = inCheck;
	}



	public String getInPayRemain() {
		return inPayRemain;
	}



	public void setInPayRemain(String inPayRemain) {
		this.inPayRemain = inPayRemain;
	}



	public String getInReceipe() {
		return inReceipe;
	}



	public void setInReceipe(String inReceipe) {
		this.inReceipe = inReceipe;
	}



	public String getInReceipeDate() {
		return inReceipeDate;
	}



	public void setInReceipeDate(String inReceipeDate) {
		this.inReceipeDate = inReceipeDate;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3In [inCode=");
		builder.append(inCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", estimateNum=");
		builder.append(estimateNum);
		builder.append(", estimatePrice=");
		builder.append(estimatePrice);
		builder.append(", inPayMethod=");
		builder.append(inPayMethod);
		builder.append(", inPayDate=");
		builder.append(inPayDate);
		builder.append(", inPayCheck=");
		builder.append(inPayCheck);
		builder.append(", inCheck=");
		builder.append(inCheck);
		builder.append(", inPayRemain=");
		builder.append(inPayRemain);
		builder.append(", inReceipe=");
		builder.append(inReceipe);
		builder.append(", inReceipeDate=");
		builder.append(inReceipeDate);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
}
