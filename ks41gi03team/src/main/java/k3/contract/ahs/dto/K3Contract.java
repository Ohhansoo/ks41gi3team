package k3.contract.ahs.dto;

public class K3Contract {
	//계약간단 k3_tb_contract_simple
	private String contractCode;
	private String contractorCode;
	private String mainBusinessCode;
	private String contractorId;
	private String contractorDevision;
	private String contractPrice;
	private String contractPricePrepayment;
	private String contractPriceMonth;
	private String contractSingningDate;
	private String contractState;
	private String memberId;

	//매출 k3_tb_contract_profit_detail
	private String contractDetailCode;
	private String estimateDetailNum;
	private String estimateNum;
	private String unitPriceCode;
	private String locationCode;
	private String contractorProfitAccount;
	private String contractorProfitBank;
	private String contractProfitManager;
	private String contractProfitStartDate;
	private String contractProfitEndDate;
	
	//비용 k3_tb_contract_loss_detail
	private String contractLossType;
	private String contractLossTon;
	private String contractLossDriverHeadcount;
	private String contractLossTerm;
	private String contractLossAccount;
	private String contractLossBank;
	private String contractLossManager;
	private String contractLossStartDate;
	private String contractLossEndDate;
	
	//계약간단 k3_tb_contract_simple
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getContractorCode() {
		return contractorCode;
	}
	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getContractorDevision() {
		return contractorDevision;
	}
	public void setContractorDevision(String contractorDevision) {
		this.contractorDevision = contractorDevision;
	}
	public String getContractPrice() {
		return contractPrice;
	}
	public void setContractPrice(String contractPrice) {
		this.contractPrice = contractPrice;
	}
	public String getContractPricePrepayment() {
		return contractPricePrepayment;
	}
	public void setContractPricePrepayment(String contractPricePrepayment) {
		this.contractPricePrepayment = contractPricePrepayment;
	}
	public String getContractPriceMonth() {
		return contractPriceMonth;
	}
	public void setContractPriceMonth(String contractPriceMonth) {
		this.contractPriceMonth = contractPriceMonth;
	}
	public String getContractSingningDate() {
		return contractSingningDate;
	}
	public void setContractSingningDate(String contractSingningDate) {
		this.contractSingningDate = contractSingningDate;
	}
	public String getContractState() {
		return contractState;
	}
	public void setContractState(String contractState) {
		this.contractState = contractState;
	}
	public String getMemberId() {
		return memberId;
	}
	
	//매출 k3_tb_contract_profit_detail	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContractDetailCode() {
		return contractDetailCode;
	}
	public void setContractDetailCode(String contractDetailCode) {
		this.contractDetailCode = contractDetailCode;
	}
	public String getEstimateDetailNum() {
		return estimateDetailNum;
	}
	public void setEstimateDetailNum(String estimateDetailNum) {
		this.estimateDetailNum = estimateDetailNum;
	}
	public String getEstimateNum() {
		return estimateNum;
	}
	public void setEstimateNum(String estimateNum) {
		this.estimateNum = estimateNum;
	}
	public String getUnitPriceCode() {
		return unitPriceCode;
	}
	public void setUnitPriceCode(String unitPriceCode) {
		this.unitPriceCode = unitPriceCode;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getContractorProfitAccount() {
		return contractorProfitAccount;
	}
	public void setContractorProfitAccount(String contractorProfitAccount) {
		this.contractorProfitAccount = contractorProfitAccount;
	}
	public String getContractorProfitBank() {
		return contractorProfitBank;
	}
	public void setContractorProfitBank(String contractorProfitBank) {
		this.contractorProfitBank = contractorProfitBank;
	}
	public String getContractProfitManager() {
		return contractProfitManager;
	}
	public void setContractProfitManager(String contractProfitManager) {
		this.contractProfitManager = contractProfitManager;
	}
	public String getContractProfitStartDate() {
		return contractProfitStartDate;
	}
	public void setContractProfitStartDate(String contractProfitStartDate) {
		this.contractProfitStartDate = contractProfitStartDate;
	}
	public String getContractProfitEndDate() {
		return contractProfitEndDate;
	}
	public void setContractProfitEndDate(String contractProfitEndDate) {
		this.contractProfitEndDate = contractProfitEndDate;
	}
	
	//비용 k3_tb_contract_loss_detail
	public String getContractLossType() {
		return contractLossType;
	}
	public void setContractLossType(String contractLossType) {
		this.contractLossType = contractLossType;
	}
	public String getContractLossTon() {
		return contractLossTon;
	}
	public void setContractLossTon(String contractLossTon) {
		this.contractLossTon = contractLossTon;
	}
	public String getContractLossDriverHeadcount() {
		return contractLossDriverHeadcount;
	}
	public void setContractLossDriverHeadcount(String contractLossDriverHeadcount) {
		this.contractLossDriverHeadcount = contractLossDriverHeadcount;
	}
	public String getContractLossTerm() {
		return contractLossTerm;
	}
	public void setContractLossTerm(String contractLossTerm) {
		this.contractLossTerm = contractLossTerm;
	}
	public String getContractLossAccount() {
		return contractLossAccount;
	}
	public void setContractLossAccount(String contractLossAccount) {
		this.contractLossAccount = contractLossAccount;
	}
	public String getContractLossBank() {
		return contractLossBank;
	}
	public void setContractLossBank(String contractLossBank) {
		this.contractLossBank = contractLossBank;
	}
	public String getContractLossManager() {
		return contractLossManager;
	}
	public void setContractLossManager(String contractLossManager) {
		this.contractLossManager = contractLossManager;
	}
	public String getContractLossStartDate() {
		return contractLossStartDate;
	}
	public void setContractLossStartDate(String contractLossStartDate) {
		this.contractLossStartDate = contractLossStartDate;
	}
	public String getContractLossEndDate() {
		return contractLossEndDate;
	}
	public void setContractLossEndDate(String contractLossEndDate) {
		this.contractLossEndDate = contractLossEndDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Contract [contractCode=");
		builder.append(contractCode);
		builder.append(", contractorCode=");
		builder.append(contractorCode);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append(", contractorId=");
		builder.append(contractorId);
		builder.append(", contractorDevision=");
		builder.append(contractorDevision);
		builder.append(", contractPrice=");
		builder.append(contractPrice);
		builder.append(", contractPricePrepayment=");
		builder.append(contractPricePrepayment);
		builder.append(", contractPriceMonth=");
		builder.append(contractPriceMonth);
		builder.append(", contractSingningDate=");
		builder.append(contractSingningDate);
		builder.append(", contractState=");
		builder.append(contractState);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", contractDetailCode=");
		builder.append(contractDetailCode);
		builder.append(", estimateDetailNum=");
		builder.append(estimateDetailNum);
		builder.append(", estimateNum=");
		builder.append(estimateNum);
		builder.append(", unitPriceCode=");
		builder.append(unitPriceCode);
		builder.append(", locationCode=");
		builder.append(locationCode);
		builder.append(", contractorProfitAccount=");
		builder.append(contractorProfitAccount);
		builder.append(", contractorProfitBank=");
		builder.append(contractorProfitBank);
		builder.append(", contractProfitManager=");
		builder.append(contractProfitManager);
		builder.append(", contractProfitStartDate=");
		builder.append(contractProfitStartDate);
		builder.append(", contractProfitEndDate=");
		builder.append(contractProfitEndDate);
		builder.append(", contractLossType=");
		builder.append(contractLossType);
		builder.append(", contractLossTon=");
		builder.append(contractLossTon);
		builder.append(", contractLossDriverHeadcount=");
		builder.append(contractLossDriverHeadcount);
		builder.append(", contractLossTerm=");
		builder.append(contractLossTerm);
		builder.append(", contractLossAccount=");
		builder.append(contractLossAccount);
		builder.append(", contractLossBank=");
		builder.append(contractLossBank);
		builder.append(", contractLossManager=");
		builder.append(contractLossManager);
		builder.append(", contractLossStartDate=");
		builder.append(contractLossStartDate);
		builder.append(", contractLossEndDate=");
		builder.append(contractLossEndDate);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractCode == null) ? 0 : contractCode.hashCode());
		result = prime * result + ((contractDetailCode == null) ? 0 : contractDetailCode.hashCode());
		result = prime * result + ((contractLossAccount == null) ? 0 : contractLossAccount.hashCode());
		result = prime * result + ((contractLossBank == null) ? 0 : contractLossBank.hashCode());
		result = prime * result + ((contractLossDriverHeadcount == null) ? 0 : contractLossDriverHeadcount.hashCode());
		result = prime * result + ((contractLossEndDate == null) ? 0 : contractLossEndDate.hashCode());
		result = prime * result + ((contractLossManager == null) ? 0 : contractLossManager.hashCode());
		result = prime * result + ((contractLossStartDate == null) ? 0 : contractLossStartDate.hashCode());
		result = prime * result + ((contractLossTerm == null) ? 0 : contractLossTerm.hashCode());
		result = prime * result + ((contractLossTon == null) ? 0 : contractLossTon.hashCode());
		result = prime * result + ((contractLossType == null) ? 0 : contractLossType.hashCode());
		result = prime * result + ((contractPrice == null) ? 0 : contractPrice.hashCode());
		result = prime * result + ((contractPriceMonth == null) ? 0 : contractPriceMonth.hashCode());
		result = prime * result + ((contractPricePrepayment == null) ? 0 : contractPricePrepayment.hashCode());
		result = prime * result + ((contractProfitEndDate == null) ? 0 : contractProfitEndDate.hashCode());
		result = prime * result + ((contractProfitManager == null) ? 0 : contractProfitManager.hashCode());
		result = prime * result + ((contractProfitStartDate == null) ? 0 : contractProfitStartDate.hashCode());
		result = prime * result + ((contractSingningDate == null) ? 0 : contractSingningDate.hashCode());
		result = prime * result + ((contractState == null) ? 0 : contractState.hashCode());
		result = prime * result + ((contractorCode == null) ? 0 : contractorCode.hashCode());
		result = prime * result + ((contractorDevision == null) ? 0 : contractorDevision.hashCode());
		result = prime * result + ((contractorId == null) ? 0 : contractorId.hashCode());
		result = prime * result + ((contractorProfitAccount == null) ? 0 : contractorProfitAccount.hashCode());
		result = prime * result + ((contractorProfitBank == null) ? 0 : contractorProfitBank.hashCode());
		result = prime * result + ((estimateDetailNum == null) ? 0 : estimateDetailNum.hashCode());
		result = prime * result + ((estimateNum == null) ? 0 : estimateNum.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((unitPriceCode == null) ? 0 : unitPriceCode.hashCode());
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
		K3Contract other = (K3Contract) obj;
		if (contractCode == null) {
			if (other.contractCode != null)
				return false;
		} else if (!contractCode.equals(other.contractCode))
			return false;
		if (contractDetailCode == null) {
			if (other.contractDetailCode != null)
				return false;
		} else if (!contractDetailCode.equals(other.contractDetailCode))
			return false;
		if (contractLossAccount == null) {
			if (other.contractLossAccount != null)
				return false;
		} else if (!contractLossAccount.equals(other.contractLossAccount))
			return false;
		if (contractLossBank == null) {
			if (other.contractLossBank != null)
				return false;
		} else if (!contractLossBank.equals(other.contractLossBank))
			return false;
		if (contractLossDriverHeadcount == null) {
			if (other.contractLossDriverHeadcount != null)
				return false;
		} else if (!contractLossDriverHeadcount.equals(other.contractLossDriverHeadcount))
			return false;
		if (contractLossEndDate == null) {
			if (other.contractLossEndDate != null)
				return false;
		} else if (!contractLossEndDate.equals(other.contractLossEndDate))
			return false;
		if (contractLossManager == null) {
			if (other.contractLossManager != null)
				return false;
		} else if (!contractLossManager.equals(other.contractLossManager))
			return false;
		if (contractLossStartDate == null) {
			if (other.contractLossStartDate != null)
				return false;
		} else if (!contractLossStartDate.equals(other.contractLossStartDate))
			return false;
		if (contractLossTerm == null) {
			if (other.contractLossTerm != null)
				return false;
		} else if (!contractLossTerm.equals(other.contractLossTerm))
			return false;
		if (contractLossTon == null) {
			if (other.contractLossTon != null)
				return false;
		} else if (!contractLossTon.equals(other.contractLossTon))
			return false;
		if (contractLossType == null) {
			if (other.contractLossType != null)
				return false;
		} else if (!contractLossType.equals(other.contractLossType))
			return false;
		if (contractPrice == null) {
			if (other.contractPrice != null)
				return false;
		} else if (!contractPrice.equals(other.contractPrice))
			return false;
		if (contractPriceMonth == null) {
			if (other.contractPriceMonth != null)
				return false;
		} else if (!contractPriceMonth.equals(other.contractPriceMonth))
			return false;
		if (contractPricePrepayment == null) {
			if (other.contractPricePrepayment != null)
				return false;
		} else if (!contractPricePrepayment.equals(other.contractPricePrepayment))
			return false;
		if (contractProfitEndDate == null) {
			if (other.contractProfitEndDate != null)
				return false;
		} else if (!contractProfitEndDate.equals(other.contractProfitEndDate))
			return false;
		if (contractProfitManager == null) {
			if (other.contractProfitManager != null)
				return false;
		} else if (!contractProfitManager.equals(other.contractProfitManager))
			return false;
		if (contractProfitStartDate == null) {
			if (other.contractProfitStartDate != null)
				return false;
		} else if (!contractProfitStartDate.equals(other.contractProfitStartDate))
			return false;
		if (contractSingningDate == null) {
			if (other.contractSingningDate != null)
				return false;
		} else if (!contractSingningDate.equals(other.contractSingningDate))
			return false;
		if (contractState == null) {
			if (other.contractState != null)
				return false;
		} else if (!contractState.equals(other.contractState))
			return false;
		if (contractorCode == null) {
			if (other.contractorCode != null)
				return false;
		} else if (!contractorCode.equals(other.contractorCode))
			return false;
		if (contractorDevision == null) {
			if (other.contractorDevision != null)
				return false;
		} else if (!contractorDevision.equals(other.contractorDevision))
			return false;
		if (contractorId == null) {
			if (other.contractorId != null)
				return false;
		} else if (!contractorId.equals(other.contractorId))
			return false;
		if (contractorProfitAccount == null) {
			if (other.contractorProfitAccount != null)
				return false;
		} else if (!contractorProfitAccount.equals(other.contractorProfitAccount))
			return false;
		if (contractorProfitBank == null) {
			if (other.contractorProfitBank != null)
				return false;
		} else if (!contractorProfitBank.equals(other.contractorProfitBank))
			return false;
		if (estimateDetailNum == null) {
			if (other.estimateDetailNum != null)
				return false;
		} else if (!estimateDetailNum.equals(other.estimateDetailNum))
			return false;
		if (estimateNum == null) {
			if (other.estimateNum != null)
				return false;
		} else if (!estimateNum.equals(other.estimateNum))
			return false;
		if (locationCode == null) {
			if (other.locationCode != null)
				return false;
		} else if (!locationCode.equals(other.locationCode))
			return false;
		if (mainBusinessCode == null) {
			if (other.mainBusinessCode != null)
				return false;
		} else if (!mainBusinessCode.equals(other.mainBusinessCode))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (unitPriceCode == null) {
			if (other.unitPriceCode != null)
				return false;
		} else if (!unitPriceCode.equals(other.unitPriceCode))
			return false;
		return true;
	}
	
	
	
	
	
}
