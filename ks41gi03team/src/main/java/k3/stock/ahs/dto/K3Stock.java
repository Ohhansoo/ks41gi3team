package k3.stock.ahs.dto;

public class K3Stock {
	private String stockCode;
	private String warehousingCode;  
	private String locationCode;  
	private String categoryCode;  
	private int stockQuantity;  
	private String productFrequency;
	private String pileupManager;  
	private String pileupDate;  
	private String laydownCheckCode;  
	private String laydownGoodsName;  
	private String contractorName;  
	private String largeCategory;  
	private String mediumCategory;  
	private String smallCategory;  
	private String contractorId;   
	private String pileupManagerName;
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getWarehousingCode() {
		return warehousingCode;
	}
	public void setWarehousingCode(String warehousingCode) {
		this.warehousingCode = warehousingCode;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getProductFrequency() {
		return productFrequency;
	}
	public void setProductFrequency(String productFrequency) {
		this.productFrequency = productFrequency;
	}
	public String getPileupManager() {
		return pileupManager;
	}
	public void setPileupManager(String pileupManager) {
		this.pileupManager = pileupManager;
	}
	public String getPileupDate() {
		return pileupDate;
	}
	public void setPileupDate(String pileupDate) {
		this.pileupDate = pileupDate;
	}
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
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getPileupManagerName() {
		return pileupManagerName;
	}
	public void setPileupManagerName(String pileupManagerName) {
		this.pileupManagerName = pileupManagerName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryCode == null) ? 0 : categoryCode.hashCode());
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((largeCategory == null) ? 0 : largeCategory.hashCode());
		result = prime * result + ((laydownCheckCode == null) ? 0 : laydownCheckCode.hashCode());
		result = prime * result + ((laydownGoodsName == null) ? 0 : laydownGoodsName.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((mediumCategory == null) ? 0 : mediumCategory.hashCode());
		result = prime * result + ((pileupDate == null) ? 0 : pileupDate.hashCode());
		result = prime * result + ((pileupManager == null) ? 0 : pileupManager.hashCode());
		result = prime * result + ((pileupManagerName == null) ? 0 : pileupManagerName.hashCode());
		result = prime * result + ((productFrequency == null) ? 0 : productFrequency.hashCode());
		result = prime * result + ((smallCategory == null) ? 0 : smallCategory.hashCode());
		result = prime * result + ((stockCode == null) ? 0 : stockCode.hashCode());
		result = prime * result + stockQuantity;
		result = prime * result + ((warehousingCode == null) ? 0 : warehousingCode.hashCode());
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
		K3Stock other = (K3Stock) obj;
		if (categoryCode == null) {
			if (other.categoryCode != null)
				return false;
		} else if (!categoryCode.equals(other.categoryCode))
			return false;
		if (contractorId == null) {
			if (other.contractorId != null)
				return false;
		} else if (!contractorId.equals(other.contractorId))
			return false;
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (largeCategory == null) {
			if (other.largeCategory != null)
				return false;
		} else if (!largeCategory.equals(other.largeCategory))
			return false;
		if (laydownCheckCode == null) {
			if (other.laydownCheckCode != null)
				return false;
		} else if (!laydownCheckCode.equals(other.laydownCheckCode))
			return false;
		if (laydownGoodsName == null) {
			if (other.laydownGoodsName != null)
				return false;
		} else if (!laydownGoodsName.equals(other.laydownGoodsName))
			return false;
		if (locationCode == null) {
			if (other.locationCode != null)
				return false;
		} else if (!locationCode.equals(other.locationCode))
			return false;
		if (mediumCategory == null) {
			if (other.mediumCategory != null)
				return false;
		} else if (!mediumCategory.equals(other.mediumCategory))
			return false;
		if (pileupDate == null) {
			if (other.pileupDate != null)
				return false;
		} else if (!pileupDate.equals(other.pileupDate))
			return false;
		if (pileupManager == null) {
			if (other.pileupManager != null)
				return false;
		} else if (!pileupManager.equals(other.pileupManager))
			return false;
		if (pileupManagerName == null) {
			if (other.pileupManagerName != null)
				return false;
		} else if (!pileupManagerName.equals(other.pileupManagerName))
			return false;
		if (productFrequency == null) {
			if (other.productFrequency != null)
				return false;
		} else if (!productFrequency.equals(other.productFrequency))
			return false;
		if (smallCategory == null) {
			if (other.smallCategory != null)
				return false;
		} else if (!smallCategory.equals(other.smallCategory))
			return false;
		if (stockCode == null) {
			if (other.stockCode != null)
				return false;
		} else if (!stockCode.equals(other.stockCode))
			return false;
		if (stockQuantity != other.stockQuantity)
			return false;
		if (warehousingCode == null) {
			if (other.warehousingCode != null)
				return false;
		} else if (!warehousingCode.equals(other.warehousingCode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "K3Stock [stockCode=" + stockCode + ", warehousingCode=" + warehousingCode + ", locationCode="
				+ locationCode + ", categoryCode=" + categoryCode + ", stockQuantity=" + stockQuantity
				+ ", productFrequency=" + productFrequency + ", pileupManager=" + pileupManager + ", pileupDate="
				+ pileupDate + ", laydownCheckCode=" + laydownCheckCode + ", laydownGoodsName=" + laydownGoodsName
				+ ", contractorName=" + contractorName + ", largeCategory=" + largeCategory + ", mediumCategory="
				+ mediumCategory + ", smallCategory=" + smallCategory + ", contractorId=" + contractorId
				+ ", pileupManagerName=" + pileupManagerName + "]";
	}

	
	
}
