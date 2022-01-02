package k3.stock.ahs.dto;

public class K3Stock {
	private String laydownCheckCode;  
	private String laydownGoodsName;  
	private int COUNT;  
	private String contractorName;  
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
	public int getCOUNT() {
		return COUNT;
	}
	public void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + COUNT;
		result = prime * result + ((assortCode == null) ? 0 : assortCode.hashCode());
		result = prime * result + ((categoryCode == null) ? 0 : categoryCode.hashCode());
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((largeCategory == null) ? 0 : largeCategory.hashCode());
		result = prime * result + ((laydownCheckCode == null) ? 0 : laydownCheckCode.hashCode());
		result = prime * result + ((laydownGoodsName == null) ? 0 : laydownGoodsName.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((mediumCategory == null) ? 0 : mediumCategory.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((smallCategory == null) ? 0 : smallCategory.hashCode());
		result = prime * result + ((sortingDate == null) ? 0 : sortingDate.hashCode());
		result = prime * result + ((sortingManagerName == null) ? 0 : sortingManagerName.hashCode());
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
		if (COUNT != other.COUNT)
			return false;
		if (assortCode == null) {
			if (other.assortCode != null)
				return false;
		} else if (!assortCode.equals(other.assortCode))
			return false;
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
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
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
		if (sortingManagerName == null) {
			if (other.sortingManagerName != null)
				return false;
		} else if (!sortingManagerName.equals(other.sortingManagerName))
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
		return "K3Stock [laydownCheckCode=" + laydownCheckCode + ", laydownGoodsName=" + laydownGoodsName + ", COUNT="
				+ COUNT + ", contractorName=" + contractorName + ", largeCategory=" + largeCategory
				+ ", mediumCategory=" + mediumCategory + ", smallCategory=" + smallCategory + ", locationCode="
				+ locationCode + ", sortingDate=" + sortingDate + ", sortingManagerName=" + sortingManagerName
				+ ", warehousingCode=" + warehousingCode + ", contractorId=" + contractorId + ", assortCode="
				+ assortCode + ", categoryCode=" + categoryCode + ", memberId=" + memberId + "]";
	} 
	
}
