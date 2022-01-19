package k3.warehousing.ahs.dto;

public class K3Warehousing {
	private String laydownCheckCode;
	private String warehousingCode;
	private String mainBusinessCode;
	private String productCode;
	private String productName;
	private String contractorId;
	private String contractorname;
	private int laydownGoodsCount;
	private String manufacturedDate;
	private String expiratonDate;
	private String laydownRequestDate;
	private String laydownDate;
	private String laydownCheckResult;
	private String laydownCheckManager;
	private String laydownCheckDate;
	private String memberName;
	private String sorting;
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
	}
	public String getWarehousingCode() {
		return warehousingCode;
	}
	public void setWarehousingCode(String warehousingCode) {
		this.warehousingCode = warehousingCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getContractorname() {
		return contractorname;
	}
	public void setContractorname(String contractorname) {
		this.contractorname = contractorname;
	}
	public int getLaydownGoodsCount() {
		return laydownGoodsCount;
	}
	public void setLaydownGoodsCount(int laydownGoodsCount) {
		this.laydownGoodsCount = laydownGoodsCount;
	}
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String getExpiratonDate() {
		return expiratonDate;
	}
	public void setExpiratonDate(String expiratonDate) {
		this.expiratonDate = expiratonDate;
	}
	public String getLaydownRequestDate() {
		return laydownRequestDate;
	}
	public void setLaydownRequestDate(String laydownRequestDate) {
		this.laydownRequestDate = laydownRequestDate;
	}
	public String getLaydownDate() {
		return laydownDate;
	}
	public void setLaydownDate(String laydownDate) {
		this.laydownDate = laydownDate;
	}
	public String getLaydownCheckResult() {
		return laydownCheckResult;
	}
	public void setLaydownCheckResult(String laydownCheckResult) {
		this.laydownCheckResult = laydownCheckResult;
	}
	public String getLaydownCheckManager() {
		return laydownCheckManager;
	}
	public void setLaydownCheckManager(String laydownCheckManager) {
		this.laydownCheckManager = laydownCheckManager;
	}
	public String getLaydownCheckDate() {
		return laydownCheckDate;
	}
	public void setLaydownCheckDate(String laydownCheckDate) {
		this.laydownCheckDate = laydownCheckDate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getSorting() {
		return sorting;
	}
	public void setSorting(String sorting) {
		this.sorting = sorting;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorname == null) ? 0 : contractorname.hashCode());
		result = prime * result + ((expiratonDate == null) ? 0 : expiratonDate.hashCode());
		result = prime * result + ((laydownCheckCode == null) ? 0 : laydownCheckCode.hashCode());
		result = prime * result + ((laydownCheckDate == null) ? 0 : laydownCheckDate.hashCode());
		result = prime * result + ((laydownCheckManager == null) ? 0 : laydownCheckManager.hashCode());
		result = prime * result + ((laydownCheckResult == null) ? 0 : laydownCheckResult.hashCode());
		result = prime * result + ((laydownDate == null) ? 0 : laydownDate.hashCode());
		result = prime * result + laydownGoodsCount;
		result = prime * result + ((laydownRequestDate == null) ? 0 : laydownRequestDate.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((manufacturedDate == null) ? 0 : manufacturedDate.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((sorting == null) ? 0 : sorting.hashCode());
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
		K3Warehousing other = (K3Warehousing) obj;
		if (contractorId == null) {
			if (other.contractorId != null)
				return false;
		} else if (!contractorId.equals(other.contractorId))
			return false;
		if (contractorname == null) {
			if (other.contractorname != null)
				return false;
		} else if (!contractorname.equals(other.contractorname))
			return false;
		if (expiratonDate == null) {
			if (other.expiratonDate != null)
				return false;
		} else if (!expiratonDate.equals(other.expiratonDate))
			return false;
		if (laydownCheckCode == null) {
			if (other.laydownCheckCode != null)
				return false;
		} else if (!laydownCheckCode.equals(other.laydownCheckCode))
			return false;
		if (laydownCheckDate == null) {
			if (other.laydownCheckDate != null)
				return false;
		} else if (!laydownCheckDate.equals(other.laydownCheckDate))
			return false;
		if (laydownCheckManager == null) {
			if (other.laydownCheckManager != null)
				return false;
		} else if (!laydownCheckManager.equals(other.laydownCheckManager))
			return false;
		if (laydownCheckResult == null) {
			if (other.laydownCheckResult != null)
				return false;
		} else if (!laydownCheckResult.equals(other.laydownCheckResult))
			return false;
		if (laydownDate == null) {
			if (other.laydownDate != null)
				return false;
		} else if (!laydownDate.equals(other.laydownDate))
			return false;
		if (laydownGoodsCount != other.laydownGoodsCount)
			return false;
		if (laydownRequestDate == null) {
			if (other.laydownRequestDate != null)
				return false;
		} else if (!laydownRequestDate.equals(other.laydownRequestDate))
			return false;
		if (mainBusinessCode == null) {
			if (other.mainBusinessCode != null)
				return false;
		} else if (!mainBusinessCode.equals(other.mainBusinessCode))
			return false;
		if (manufacturedDate == null) {
			if (other.manufacturedDate != null)
				return false;
		} else if (!manufacturedDate.equals(other.manufacturedDate))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (sorting == null) {
			if (other.sorting != null)
				return false;
		} else if (!sorting.equals(other.sorting))
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
		return "K3Warehousing [laydownCheckCode=" + laydownCheckCode + ", warehousingCode=" + warehousingCode
				+ ", mainBusinessCode=" + mainBusinessCode + ", productCode=" + productCode + ", productName="
				+ productName + ", contractorId=" + contractorId + ", contractorname=" + contractorname
				+ ", laydownGoodsCount=" + laydownGoodsCount + ", manufacturedDate=" + manufacturedDate
				+ ", expiratonDate=" + expiratonDate + ", laydownRequestDate=" + laydownRequestDate + ", laydownDate="
				+ laydownDate + ", laydownCheckResult=" + laydownCheckResult + ", laydownCheckManager="
				+ laydownCheckManager + ", laydownCheckDate=" + laydownCheckDate + ", memberName=" + memberName
				+ ", sorting=" + sorting + "]";
	}


}
