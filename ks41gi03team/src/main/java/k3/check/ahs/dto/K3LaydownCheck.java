package k3.check.ahs.dto;

public class K3LaydownCheck {
	private String warehousingCode;
	private String laydownCheckCode;
	private String contractorName;
	private String contractorId;
	private String productName;
	private int laydownGoodsCount;
	private String manufacturedDate;
	private String expiratonDate;
	private String laydownDate;
	private String laydownCheckResult;
	private String laydownCheckManager;
	private String laydownCheckDate;
	private String memberName;
	private String type;
	public String getWarehousingCode() {
		return warehousingCode;
	}
	public void setWarehousingCode(String warehousingCode) {
		this.warehousingCode = warehousingCode;
	}
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "K3LaydownCheck [warehousingCode=" + warehousingCode + ", laydownCheckCode=" + laydownCheckCode
				+ ", contractorName=" + contractorName + ", contractorId=" + contractorId + ", productName="
				+ productName + ", laydownGoodsCount=" + laydownGoodsCount + ", manufacturedDate=" + manufacturedDate
				+ ", expiratonDate=" + expiratonDate + ", laydownDate=" + laydownDate + ", laydownCheckResult="
				+ laydownCheckResult + ", laydownCheckManager=" + laydownCheckManager + ", laydownCheckDate="
				+ laydownCheckDate + ", memberName=" + memberName + ", type=" + type + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((expiratonDate == null) ? 0 : expiratonDate.hashCode());
		result = prime * result + ((laydownCheckCode == null) ? 0 : laydownCheckCode.hashCode());
		result = prime * result + ((laydownCheckDate == null) ? 0 : laydownCheckDate.hashCode());
		result = prime * result + ((laydownCheckManager == null) ? 0 : laydownCheckManager.hashCode());
		result = prime * result + ((laydownCheckResult == null) ? 0 : laydownCheckResult.hashCode());
		result = prime * result + ((laydownDate == null) ? 0 : laydownDate.hashCode());
		result = prime * result + laydownGoodsCount;
		result = prime * result + ((manufacturedDate == null) ? 0 : manufacturedDate.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		K3LaydownCheck other = (K3LaydownCheck) obj;
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
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (warehousingCode == null) {
			if (other.warehousingCode != null)
				return false;
		} else if (!warehousingCode.equals(other.warehousingCode))
			return false;
		return true;
	}
	
	
}
