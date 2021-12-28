package k3.category.ahs.dto;

public class K3Category {
	private String categoryCode;
	private String largeCategory;
	private String mediumCategory;
	private String smallCategory;
	private String mainBusinessCode;
	
	
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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
	public String getMainBusinessCode() {
		return mainBusinessCode;
	}
	public void setMainBusinessCode(String mainBusinessCode) {
		this.mainBusinessCode = mainBusinessCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("K3Category [categoryCode=");
		builder.append(categoryCode);
		builder.append(", largeCategory=");
		builder.append(largeCategory);
		builder.append(", mediumCategory=");
		builder.append(mediumCategory);
		builder.append(", smallCategory=");
		builder.append(smallCategory);
		builder.append(", mainBusinessCode=");
		builder.append(mainBusinessCode);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryCode == null) ? 0 : categoryCode.hashCode());
		result = prime * result + ((largeCategory == null) ? 0 : largeCategory.hashCode());
		result = prime * result + ((mainBusinessCode == null) ? 0 : mainBusinessCode.hashCode());
		result = prime * result + ((mediumCategory == null) ? 0 : mediumCategory.hashCode());
		result = prime * result + ((smallCategory == null) ? 0 : smallCategory.hashCode());
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
		K3Category other = (K3Category) obj;
		if (categoryCode == null) {
			if (other.categoryCode != null)
				return false;
		} else if (!categoryCode.equals(other.categoryCode))
			return false;
		if (largeCategory == null) {
			if (other.largeCategory != null)
				return false;
		} else if (!largeCategory.equals(other.largeCategory))
			return false;
		if (mainBusinessCode == null) {
			if (other.mainBusinessCode != null)
				return false;
		} else if (!mainBusinessCode.equals(other.mainBusinessCode))
			return false;
		if (mediumCategory == null) {
			if (other.mediumCategory != null)
				return false;
		} else if (!mediumCategory.equals(other.mediumCategory))
			return false;
		if (smallCategory == null) {
			if (other.smallCategory != null)
				return false;
		} else if (!smallCategory.equals(other.smallCategory))
			return false;
		return true;
	}
	
	
}
