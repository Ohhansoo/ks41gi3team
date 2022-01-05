package k3.stock.ahs.dto;

public class K3Stock {
	private String laydownCheckCode;  
	private String laydownGoodsName;  
	private String contractorName;  
	private int stockQuantity;  
	private String largeCategory;  
	private String mediumCategory;  
	private String smallCategory;  
	private String locationCode;  
	private String sortingDate;  
	private String sortingManagerName;  
	private String warehousingCode;  
	private String contractorId;  
	private String assortCode;  
	private String categoryCode;  
	private String memberId;
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
	}
	public String getLaydownGoodsName() {
		return laydownGoodsName;
	}
	public void setLaydownGoodsName(String laydownGoodsName) {
		this.laydownGoodsName = laydownGoodsName;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getLargeCategory() {
		return largeCategory;
	}
	public void setLargeCategory(String largeCategory) {
		this.largeCategory = largeCategory;
	}
	public String getMediumCategory() {
		return mediumCategory;
	}
	public void setMediumCategory(String mediumCategory) {
		this.mediumCategory = mediumCategory;
	}
	public String getSmallCategory() {
		return smallCategory;
	}
	public void setSmallCategory(String smallCategory) {
		this.smallCategory = smallCategory;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getSortingDate() {
		return sortingDate;
	}
	public void setSortingDate(String sortingDate) {
		this.sortingDate = sortingDate;
	}
	public String getSortingManagerName() {
		return sortingManagerName;
	}
	public void setSortingManagerName(String sortingManagerName) {
		this.sortingManagerName = sortingManagerName;
	}
	public String getWarehousingCode() {
		return warehousingCode;
	}
	public void setWarehousingCode(String warehousingCode) {
		this.warehousingCode = warehousingCode;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getAssortCode() {
		return assortCode;
	}
	public void setAssortCode(String assortCode) {
		this.assortCode = assortCode;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "K3Stock [laydownCheckCode=" + laydownCheckCode + ", laydownGoodsName=" + laydownGoodsName
				+ ", contractorName=" + contractorName + ", stockQuantity=" + stockQuantity + ", largeCategory="
				+ largeCategory + ", mediumCategory=" + mediumCategory + ", smallCategory=" + smallCategory
				+ ", locationCode=" + locationCode + ", sortingDate=" + sortingDate + ", sortingManagerName="
				+ sortingManagerName + ", warehousingCode=" + warehousingCode + ", contractorId=" + contractorId
				+ ", assortCode=" + assortCode + ", categoryCode=" + categoryCode + ", memberId=" + memberId + "]";
	}
	
	
	
}
