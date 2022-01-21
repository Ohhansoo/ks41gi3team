package k3.stock.ahs.dto;

import k3.category.ahs.dto.K3Category;
import k3.contractor.ahs.dto.K3Contractor;
import k3.memberuser.ahs.dto.K3MemberUser;
import k3.product.ahs.dto.K3Product;
import k3.warehousing.ahs.dto.K3Warehousing;

public class K3Stock {
	private String stockCode;
	private String warehousingCode;  
	private String locationCode;   
	private int stockQuantity;  
	private String pileupManager;  
	private String pileupDate;  
 	
	private K3MemberUser k3MemberUser;
	private K3Product k3Product;
	private K3Contractor k3Contractor;
	private K3Category k3Category;	
	private K3Warehousing k3Warehousing;
	
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getWarehousingCode() {
		return warehousingCode;
	}
	public void setWarehousingCode(String warehousingCode) {
		this.warehousingCode = warehousingCode;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getPileupManager() {
		return pileupManager;
	}
	public void setPileupManager(String pileupManager) {
		this.pileupManager = pileupManager;
	}
	public String getPileupDate() {
		return pileupDate;
	}
	public void setPileupDate(String pileupDate) {
		this.pileupDate = pileupDate;
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
	public K3Warehousing getK3Warehousing() {
		return k3Warehousing;
	}
	public void setK3Warehousing(K3Warehousing k3Warehousing) {
		this.k3Warehousing = k3Warehousing;
	}
	@Override
	public String toString() {
		return "K3Stock [stockCode=" + stockCode + ", warehousingCode=" + warehousingCode + ", locationCode="
				+ locationCode + ", stockQuantity=" + stockQuantity + ", pileupManager=" + pileupManager
				+ ", pileupDate=" + pileupDate + ", k3MemberUser=" + k3MemberUser + ", k3Product=" + k3Product
				+ ", k3Contractor=" + k3Contractor + ", k3Category=" + k3Category + ", k3Warehousing=" + k3Warehousing
				+ "]";
	}

	
}
