package k3.release.ahs.dto;

import k3.category.ahs.dto.K3Category;
import k3.contractor.ahs.dto.K3Contractor;
import k3.memberuser.ahs.dto.K3MemberUser;
import k3.product.ahs.dto.K3Product;
import k3.stock.ahs.dto.K3Stock;

public class K3Release {
	private String releaseCode;
	private String stockCode;
	private String contractorId;
	private String productCode;
	private String releaseMergeCode;
	private String releaseGoodsCount;
	private String area;
	private String postCode;
	private String shippingAddress;
	private String shippingDetailAddress;
	private String recipientName;
	private String recipientPhone;
	private String releaseManager;
	private String releaseAllow;
	private String acceptDate;
	private String releaseRequestDate;
	private String releaseDate;
	private String shipmentCheckManager;
	private String shipmentCheckRegDate;
	private String shipmentCheckResult;

	private K3MemberUser k3MemberUser;
	private K3Product k3Product;
	private K3Contractor k3Contractor;
	private K3Category k3Category;
	private K3Stock k3Stock;
	
	public String getReleaseCode() {
		return releaseCode;
	}
	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
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
	public String getReleaseMergeCode() {
		return releaseMergeCode;
	}
	public void setReleaseMergeCode(String releaseMergeCode) {
		this.releaseMergeCode = releaseMergeCode;
	}
	public String getReleaseGoodsCount() {
		return releaseGoodsCount;
	}
	public void setReleaseGoodsCount(String releaseGoodsCount) {
		this.releaseGoodsCount = releaseGoodsCount;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getShippingDetailAddress() {
		return shippingDetailAddress;
	}
	public void setShippingDetailAddress(String shippingDetailAddress) {
		this.shippingDetailAddress = shippingDetailAddress;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getReleaseManager() {
		return releaseManager;
	}
	public void setReleaseManager(String releaseManager) {
		this.releaseManager = releaseManager;
	}
	public String getReleaseAllow() {
		return releaseAllow;
	}
	public void setReleaseAllow(String releaseAllow) {
		this.releaseAllow = releaseAllow;
	}
	public String getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(String acceptDate) {
		this.acceptDate = acceptDate;
	}
	public String getReleaseRequestDate() {
		return releaseRequestDate;
	}
	public void setReleaseRequestDate(String releaseRequestDate) {
		this.releaseRequestDate = releaseRequestDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getShipmentCheckManager() {
		return shipmentCheckManager;
	}
	public void setShipmentCheckManager(String shipmentCheckManager) {
		this.shipmentCheckManager = shipmentCheckManager;
	}
	public String getShipmentCheckRegDate() {
		return shipmentCheckRegDate;
	}
	public void setShipmentCheckRegDate(String shipmentCheckRegDate) {
		this.shipmentCheckRegDate = shipmentCheckRegDate;
	}
	public String getShipmentCheckResult() {
		return shipmentCheckResult;
	}
	public void setShipmentCheckResult(String shipmentCheckResult) {
		this.shipmentCheckResult = shipmentCheckResult;
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
	public K3Stock getK3Stock() {
		return k3Stock;
	}
	public void setK3Stock(K3Stock k3Stock) {
		this.k3Stock = k3Stock;
	}
	@Override
	public String toString() {
		return "K3Release [releaseCode=" + releaseCode + ", stockCode=" + stockCode + ", contractorId=" + contractorId
				+ ", productCode=" + productCode + ", releaseMergeCode=" + releaseMergeCode + ", releaseGoodsCount="
				+ releaseGoodsCount + ", area=" + area + ", postCode=" + postCode + ", shippingAddress="
				+ shippingAddress + ", shippingDetailAddress=" + shippingDetailAddress + ", recipientName="
				+ recipientName + ", recipientPhone=" + recipientPhone + ", releaseManager=" + releaseManager
				+ ", releaseAllow=" + releaseAllow + ", acceptDate=" + acceptDate + ", releaseRequestDate="
				+ releaseRequestDate + ", releaseDate=" + releaseDate + ", shipmentCheckManager=" + shipmentCheckManager
				+ ", shipmentCheckRegDate=" + shipmentCheckRegDate + ", shipmentCheckResult=" + shipmentCheckResult
				+ ", k3MemberUser=" + k3MemberUser + ", k3Product=" + k3Product + ", k3Contractor=" + k3Contractor
				+ ", k3Category=" + k3Category + ", k3Stock=" + k3Stock + "]";
	}

	
	
}
