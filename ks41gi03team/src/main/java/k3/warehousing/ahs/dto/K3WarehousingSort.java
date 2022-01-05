package k3.warehousing.ahs.dto;

public class K3WarehousingSort {
	private String warehousingCode;
	private String laydownGoodsName;
	private String laydownGoodsCount;
	private String contractorName;
	private String largeCategory;
	private String mediumCategory;
	private String smallCategory;
	private String productFrequency;
	private String locationCode;
	private String sortingManager;
	private String sortingDate;
	private String laydownDate;
	private String laydownCheckCode;
	private String memberName;
	public String getWarehousingCode() {
		return warehousingCode;
	}
	public void setWarehousingCode(String warehousingCode) {
		this.warehousingCode = warehousingCode;
	}
	public String getLaydownGoodsName() {
		return laydownGoodsName;
	}
	public void setLaydownGoodsName(String laydownGoodsName) {
		this.laydownGoodsName = laydownGoodsName;
	}
	public String getLaydownGoodsCount() {
		return laydownGoodsCount;
	}
	public void setLaydownGoodsCount(String laydownGoodsCount) {
		this.laydownGoodsCount = laydownGoodsCount;
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
	public String getProductFrequency() {
		return productFrequency;
	}
	public void setProductFrequency(String productFrequency) {
		this.productFrequency = productFrequency;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getSortingManager() {
		return sortingManager;
	}
	public void setSortingManager(String sortingManager) {
		this.sortingManager = sortingManager;
	}
	public String getSortingDate() {
		return sortingDate;
	}
	public void setSortingDate(String sortingDate) {
		this.sortingDate = sortingDate;
	}
	public String getLaydownDate() {
		return laydownDate;
	}
	public void setLaydownDate(String laydownDate) {
		this.laydownDate = laydownDate;
	}
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((largeCategory == null) ? 0 : largeCategory.hashCode());
		result = prime * result + ((laydownCheckCode == null) ? 0 : laydownCheckCode.hashCode());
		result = prime * result + ((laydownDate == null) ? 0 : laydownDate.hashCode());
		result = prime * result + ((laydownGoodsCount == null) ? 0 : laydownGoodsCount.hashCode());
		result = prime * result + ((laydownGoodsName == null) ? 0 : laydownGoodsName.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((mediumCategory == null) ? 0 : mediumCategory.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((productFrequency == null) ? 0 : productFrequency.hashCode());
		result = prime * result + ((smallCategory == null) ? 0 : smallCategory.hashCode());
		result = prime * result + ((sortingDate == null) ? 0 : sortingDate.hashCode());
		result = prime * result + ((sortingManager == null) ? 0 : sortingManager.hashCode());
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
		K3WarehousingSort other = (K3WarehousingSort) obj;
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
		if (laydownDate == null) {
			if (other.laydownDate != null)
				return false;
		} else if (!laydownDate.equals(other.laydownDate))
			return false;
		if (laydownGoodsCount == null) {
			if (other.laydownGoodsCount != null)
				return false;
		} else if (!laydownGoodsCount.equals(other.laydownGoodsCount))
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
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
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
		if (sortingDate == null) {
			if (other.sortingDate != null)
				return false;
		} else if (!sortingDate.equals(other.sortingDate))
			return false;
		if (sortingManager == null) {
			if (other.sortingManager != null)
				return false;
		} else if (!sortingManager.equals(other.sortingManager))
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
		return "K3WarehousingSort [warehousingCode=" + warehousingCode + ", laydownGoodsName=" + laydownGoodsName
				+ ", laydownGoodsCount=" + laydownGoodsCount + ", contractorName=" + contractorName + ", largeCategory="
				+ largeCategory + ", mediumCategory=" + mediumCategory + ", smallCategory=" + smallCategory
				+ ", productFrequency=" + productFrequency + ", locationCode=" + locationCode + ", sortingManager="
				+ sortingManager + ", sortingDate=" + sortingDate + ", laydownDate=" + laydownDate
				+ ", laydownCheckCode=" + laydownCheckCode + ", memberName=" + memberName + "]";
	}
	
	
	
	
}
