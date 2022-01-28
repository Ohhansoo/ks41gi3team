package k3.estimate.ahs.dto;

public class K3Unit {

	private String UnitPriceCode;
	private String mainBusinessCode;
	private String unitContractDevision;
	private String unitContract;
	private String unitTerm;
	private String unitPay; //int 에서 string으로 바꿈
	
	public String getUnitPriceCode() {
		return UnitPriceCode;
	}
	public void setUnitPriceCode(String unitPriceCode) {
		UnitPriceCode = unitPriceCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getUnitContractDevision() {
		return unitContractDevision;
	}
	public void setUnitContractDevision(String unitContractDevision) {
		this.unitContractDevision = unitContractDevision;
	}
	public String getUnitContract() {
		return unitContract;
	}
	public void setUnitContract(String unitContract) {
		this.unitContract = unitContract;
	}
	public String getUnitTerm() {
		return unitTerm;
	}
	public void setUnitTerm(String unitTerm) {
		this.unitTerm = unitTerm;
	}
	public String getUnitPay() {
		return unitPay;
	}
	public void setUnitPay(String unitPay) {
		this.unitPay = unitPay;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Unit [UnitPriceCode=");
		builder.append(UnitPriceCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", unitContractDevision=");
		builder.append(unitContractDevision);
		builder.append(", unitContract=");
		builder.append(unitContract);
		builder.append(", unitTerm=");
		builder.append(unitTerm);
		builder.append(", unitPay=");
		builder.append(unitPay);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UnitPriceCode == null) ? 0 : UnitPriceCode.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((unitContract == null) ? 0 : unitContract.hashCode());
		result = prime * result + ((unitContractDevision == null) ? 0 : unitContractDevision.hashCode());
		result = prime * result + ((unitPay == null) ? 0 : unitPay.hashCode());
		result = prime * result + ((unitTerm == null) ? 0 : unitTerm.hashCode());
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
		K3Unit other = (K3Unit) obj;
		if (UnitPriceCode == null) {
			if (other.UnitPriceCode != null)
				return false;
		} else if (!UnitPriceCode.equals(other.UnitPriceCode))
			return false;
		if (mainBusinessCode == null) {
			if (other.mainBusinessCode != null)
				return false;
		} else if (!mainBusinessCode.equals(other.mainBusinessCode))
			return false;
		if (unitContract == null) {
			if (other.unitContract != null)
				return false;
		} else if (!unitContract.equals(other.unitContract))
			return false;
		if (unitContractDevision == null) {
			if (other.unitContractDevision != null)
				return false;
		} else if (!unitContractDevision.equals(other.unitContractDevision))
			return false;
		if (unitPay == null) {
			if (other.unitPay != null)
				return false;
		} else if (!unitPay.equals(other.unitPay))
			return false;
		if (unitTerm == null) {
			if (other.unitTerm != null)
				return false;
		} else if (!unitTerm.equals(other.unitTerm))
			return false;
		return true;
	}
	
	
	
	
}
