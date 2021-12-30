package k3.warehousing.ahs.dto;

import k3.check.ahs.dto.K3LaydownCheck;

public class K3Warehousing {
	private String laydownCheckCode;
	private String mainBusinessCode;
	private String contractorName;
	private String contractorId;
	private String laydownGoodsName;
	private int laydownGoodsCount;
	private String manufacturedDate;
	private String expiratonDate;
	private String laydownDate;
	private String laydownCheckResult;
	private String laydownCheckManager;
	private String laydownCheckDate;
	private String dockName;
	private String memberName;
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
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
	public String getLaydownGoodsName() {
		return laydownGoodsName;
	}
	public void setLaydownGoodsName(String laydownGoodsName) {
		this.laydownGoodsName = laydownGoodsName;
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
	public String getDockName() {
		return dockName;
	}
	public void setDockName(String dockName) {
		this.dockName = dockName;
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
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorName == null) ? 0 : contractorName.hashCode());
		result = prime * result + ((dockName == null) ? 0 : dockName.hashCode());
		result = prime * result + ((expiratonDate == null) ? 0 : expiratonDate.hashCode());
		result = prime * result + ((laydownCheckCode == null) ? 0 : laydownCheckCode.hashCode());
		result = prime * result + ((laydownCheckDate == null) ? 0 : laydownCheckDate.hashCode());
		result = prime * result + ((laydownCheckManager == null) ? 0 : laydownCheckManager.hashCode());
		result = prime * result + ((laydownCheckResult == null) ? 0 : laydownCheckResult.hashCode());
		result = prime * result + ((laydownDate == null) ? 0 : laydownDate.hashCode());
		result = prime * result + laydownGoodsCount;
		result = prime * result + ((laydownGoodsName == null) ? 0 : laydownGoodsName.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((manufacturedDate == null) ? 0 : manufacturedDate.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
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
		if (contractorName == null) {
			if (other.contractorName != null)
				return false;
		} else if (!contractorName.equals(other.contractorName))
			return false;
		if (dockName == null) {
			if (other.dockName != null)
				return false;
		} else if (!dockName.equals(other.dockName))
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
		if (laydownGoodsName == null) {
			if (other.laydownGoodsName != null)
				return false;
		} else if (!laydownGoodsName.equals(other.laydownGoodsName))
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
		return true;
	}
	@Override
	public String toString() {
		return "K3Warehousing [laydownCheckCode=" + laydownCheckCode + ", mainBusinessCode=" + mainBusinessCode
				+ ", contractorName=" + contractorName + ", contractorId=" + contractorId + ", laydownGoodsName="
				+ laydownGoodsName + ", laydownGoodsCount=" + laydownGoodsCount + ", manufacturedDate="
				+ manufacturedDate + ", expiratonDate=" + expiratonDate + ", laydownDate=" + laydownDate
				+ ", laydownCheckResult=" + laydownCheckResult + ", laydownCheckManager=" + laydownCheckManager
				+ ", laydownCheckDate=" + laydownCheckDate + ", dockName=" + dockName + ", memberName=" + memberName
				+ "]";
	}
	
}
