package k3.warehousing.ahs.dto;

import k3.category.ahs.dto.K3Category;
import k3.contractor.ahs.dto.K3Contractor;
import k3.memberuser.ahs.dto.K3MemberUser;
import k3.product.ahs.dto.K3Product;

public class K3Warehousing {
	private String warehousingCode;
	private String mainBusinessCode;
	private String contractorId;
	private String productCode;
	private int laydownGoodsCount;
	private String manufacturedDate;
	private String expiratonDate;
	private String laydownRequestDate;
	private String laydownDate;
	private String productFrequency;
	private String laydownCheckCode;
	private String laydownCheckResult;
	private String laydownCheckManager;
	private String laydownCheckDate;
	private String warehousingAllow;
	private String acceptDate;
	private String sorting;
	
	private K3MemberUser k3MemberUser;
	private K3Product k3Product;
	private K3Contractor k3Contractor;
	private K3Category k3Category;
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
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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
	public String getProductFrequency() {
		return productFrequency;
	}
	public void setProductFrequency(String productFrequency) {
		this.productFrequency = productFrequency;
	}
	public String getLaydownCheckCode() {
		return laydownCheckCode;
	}
	public void setLaydownCheckCode(String laydownCheckCode) {
		this.laydownCheckCode = laydownCheckCode;
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
	public String getWarehousingAllow() {
		return warehousingAllow;
	}
	public void setWarehousingAllow(String warehousingAllow) {
		this.warehousingAllow = warehousingAllow;
	}
	public String getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(String acceptDate) {
		this.acceptDate = acceptDate;
	}
	public String getSorting() {
		return sorting;
	}
	public void setSorting(String sorting) {
		this.sorting = sorting;
	}
	public K3MemberUser getK3MemberUser() {
		return k3MemberUser;
	}
	public void setK3MemberUser(K3MemberUser k3MemberUser) {
		this.k3MemberUser = k3MemberUser;
	}
	public K3Product getK3Product() {
		return k3Product;
	}
	public void setK3Product(K3Product k3Product) {
		this.k3Product = k3Product;
	}
	public K3Contractor getK3Contractor() {
		return k3Contractor;
	}
	public void setK3Contractor(K3Contractor k3Contractor) {
		this.k3Contractor = k3Contractor;
	}
	public K3Category getK3Category() {
		return k3Category;
	}
	public void setK3Category(K3Category k3Category) {
		this.k3Category = k3Category;
	}
	@Override
	public String toString() {
		return "K3Warehousing [warehousingCode=" + warehousingCode + ", mainBusinessCode=" + mainBusinessCode
				+ ", contractorId=" + contractorId + ", productCode=" + productCode + ", laydownGoodsCount="
				+ laydownGoodsCount + ", manufacturedDate=" + manufacturedDate + ", expiratonDate=" + expiratonDate
				+ ", laydownRequestDate=" + laydownRequestDate + ", laydownDate=" + laydownDate + ", productFrequency="
				+ productFrequency + ", laydownCheckCode=" + laydownCheckCode + ", laydownCheckResult="
				+ laydownCheckResult + ", laydownCheckManager=" + laydownCheckManager + ", laydownCheckDate="
				+ laydownCheckDate + ", warehousingAllow=" + warehousingAllow + ", acceptDate=" + acceptDate
				+ ", sorting=" + sorting + ", k3MemberUser=" + k3MemberUser + ", k3Product=" + k3Product
				+ ", k3Contractor=" + k3Contractor + ", k3Category=" + k3Category + "]";
	}
	

	

}
