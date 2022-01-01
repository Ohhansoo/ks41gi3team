package k3.warehousing.ahs.dto;

public class K3WarehousingSort {
	private String assortCode;
	private String laydownGoodsName;
	private String laydownGoodsCount;
	private String contractorName;
	private String largeCategory;
	private String mediumCategory;
	private String smallCategory;
	private String productFrequency;
	private String locationCode;
	private String memberId;
	private String sortingDate;
	public String getAssortCode() {
		return assortCode;
	}
	public void setAssortCode(String assortCode) {
		this.assortCode = assortCode;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getSortingDate() {
		return sortingDate;
	}
	public void setSortingDate(String sortingDate) {
		this.sortingDate = sortingDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assortCode == null) ? 0 : assortCode.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((largeCategory == null) ? 0 : largeCategory.hashCode());
		result = prime * result + ((laydownGoodsCount == null) ? 0 : laydownGoodsCount.hashCode());
		result = prime * result + ((laydownGoodsName == null) ? 0 : laydownGoodsName.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((mediumCategory == null) ? 0 : mediumCategory.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((productFrequency == null) ? 0 : productFrequency.hashCode());
		result = prime * result + ((smallCategory == null) ? 0 : smallCategory.hashCode());
		result = prime * result + ((sortingDate == null) ? 0 : sortingDate.hashCode());
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
		if (assortCode == null) {
			if (other.assortCode != null)
				return false;
		} else if (!assortCode.equals(other.assortCode))
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
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
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
		return true;
	}
	@Override
	public String toString() {
		return "K3WarehousingSort [assortCode=" + assortCode + ", laydownGoodsName=" + laydownGoodsName
				+ ", laydownGoodsCount=" + laydownGoodsCount + ", contractorName=" + contractorName + ", largeCategory="
				+ largeCategory + ", mediumCategory=" + mediumCategory + ", smallCategory=" + smallCategory
				+ ", productFrequency=" + productFrequency + ", locationCode=" + locationCode + ", memberId=" + memberId
				+ ", sortingDate=" + sortingDate + "]";
	}
	
}
