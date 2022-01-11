package k3.out.ahs.dto;

public class K3Out {
	private String outCode;
	private String asCode;
	private String asName;
	private String mainBusinessCode;
	private String outName;
	private String memberId;
	private String outRegDate;
	private String outMemo;
	private String outPrice;
	private String outMethod;
	private String outReceipe;

	
	
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getOutCode() {
		return outCode;
	}
	public void setOutCode(String outCode) {
		this.outCode = outCode;
	}
	public String getAsCode() {
		return asCode;
	}
	public void setAsCode(String asCode) {
		this.asCode = asCode;
	}
	public String getAsName() {
		return asName;
	}
	public void setAsName(String asName) {
		this.asName = asName;
	}
	public String getOutName() {
		return outName;
	}
	public void setOutName(String outName) {
		this.outName = outName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getOutRegDate() {
		return outRegDate;
	}
	public void setOutRegDate(String outRegDate) {
		this.outRegDate = outRegDate;
	}
	public String getOutMemo() {
		return outMemo;
	}
	public void setOutMemo(String outMemo) {
		this.outMemo = outMemo;
	}
	public String getOutPrice() {
		return outPrice;
	}
	public void setOutPrice(String outPrice) {
		this.outPrice = outPrice;
	}
	public String getOutMethod() {
		return outMethod;
	}
	public void setOutMethod(String outMethod) {
		this.outMethod = outMethod;
	}
	public String getOutReceipe() {
		return outReceipe;
	}
	public void setOutReceipe(String outReceipe) {
		this.outReceipe = outReceipe;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Out [outCode=");
		builder.append(outCode);
		builder.append(", asCode=");
		builder.append(asCode);
		builder.append(", asName=");
		builder.append(asName);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", outName=");
		builder.append(outName);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", outRegDate=");
		builder.append(outRegDate);
		builder.append(", outMemo=");
		builder.append(outMemo);
		builder.append(", outPrice=");
		builder.append(outPrice);
		builder.append(", outMethod=");
		builder.append(outMethod);
		builder.append(", outReceipe=");
		builder.append(outReceipe);
		builder.append("]");
		return builder.toString();
	}
	
}
