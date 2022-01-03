package k3.release.ahs.dto;

public class K3Release {
	private String releaseCode;
	private String releaseMergeCode;
	private String laydownGoodsName;
	private String releaseGoodsCount;
	private String contractorName;
	private String areaCode;
	private String shippingAddress;
	private String shippingDetailAddress;
	private String recipientName;
	private String recipientPhone;
	private String mainBusinessCode;
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
	public String getLaydownGoodsName() {
		return laydownGoodsName;
	}
	public void setLaydownGoodsName(String laydownGoodsName) {
		this.laydownGoodsName = laydownGoodsName;
	}
	public String getReleaseGoodsCount() {
		return releaseGoodsCount;
	}
	public void setReleaseGoodsCount(String releaseGoodsCount) {
		this.releaseGoodsCount = releaseGoodsCount;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
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
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	@Override
	public String toString() {
		return "K3Release [releaseCode=" + releaseCode + ", releaseMergeCode=" + releaseMergeCode
				+ ", laydownGoodsName=" + laydownGoodsName + ", releaseGoodsCount=" + releaseGoodsCount
				+ ", contractorName=" + contractorName + ", areaCode=" + areaCode + ", shippingAddress="
				+ shippingAddress + ", shippingDetailAddress=" + shippingDetailAddress + ", recipientName="
				+ recipientName + ", recipientPhone=" + recipientPhone + ", mainBusinessCode=" + mainBusinessCode + "]";
	}
	
}
