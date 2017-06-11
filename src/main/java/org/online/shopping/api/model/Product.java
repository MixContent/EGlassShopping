package org.online.shopping.api.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_TB")
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2145239644060751170L;
	@Id
	private int productId;
	private String productNumber;
	private String productName;
	private String productDescription;
	private BigDecimal unitPrice;
	private BigDecimal msrp;
	private BigDecimal discountMmount;
	private BigDecimal maxDiscount;
	private String size;
	private String color;
	private String availableSize;
	private String availableColor;
	private int quantity;
	private int quantityInStock;
	private int quantityOnOrder;
	private String recordLevel;
	private String productAvailable;
	private double unitWeight;
	private String picturePath;
	private int ranking;
	private String keyType;
	private String areaAvailability;

	public Product() {
		// No-OP
	}

	public Product(int productId, String productNumber, String productName,
			String productDescription, BigDecimal unitPrice, BigDecimal msrp,
			BigDecimal discountMmount, BigDecimal maxDiscount, String size,
			String color, String availableSize, String availableColor,
			int quantity, int quantityInStock, int quantityOnOrder,
			String recordLevel, String productAvailable, double unitWeight,
			String picturePath, int ranking, String keyType,
			String areaAvailability) {
		super();
		this.productId = productId;
		this.productNumber = productNumber;
		this.productName = productName;
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.msrp = msrp;
		this.discountMmount = discountMmount;
		this.maxDiscount = maxDiscount;
		this.size = size;
		this.color = color;
		this.availableSize = availableSize;
		this.availableColor = availableColor;
		this.quantity = quantity;
		this.quantityInStock = quantityInStock;
		this.quantityOnOrder = quantityOnOrder;
		this.recordLevel = recordLevel;
		this.productAvailable = productAvailable;
		this.unitWeight = unitWeight;
		this.picturePath = picturePath;
		this.ranking = ranking;
		this.keyType = keyType;
		this.areaAvailability = areaAvailability;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getMsrp() {
		return msrp;
	}

	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}

	public BigDecimal getDiscountMmount() {
		return discountMmount;
	}

	public void setDiscountMmount(BigDecimal discountMmount) {
		this.discountMmount = discountMmount;
	}

	public BigDecimal getMaxDiscount() {
		return maxDiscount;
	}

	public void setMaxDiscount(BigDecimal maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(String availableSize) {
		this.availableSize = availableSize;
	}

	public String getAvailableColor() {
		return availableColor;
	}

	public void setAvailableColor(String availableColor) {
		this.availableColor = availableColor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public int getQuantityOnOrder() {
		return quantityOnOrder;
	}

	public void setQuantityOnOrder(int quantityOnOrder) {
		this.quantityOnOrder = quantityOnOrder;
	}

	public String getRecordLevel() {
		return recordLevel;
	}

	public void setRecordLevel(String recordLevel) {
		this.recordLevel = recordLevel;
	}

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public double getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(double unitWeight) {
		this.unitWeight = unitWeight;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getKeyType() {
		return keyType;
	}

	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}

	public String getAreaAvailability() {
		return areaAvailability;
	}

	public void setAreaAvailability(String areaAvailability) {
		this.areaAvailability = areaAvailability;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((areaAvailability == null) ? 0 : areaAvailability.hashCode());
		result = prime * result
				+ ((availableColor == null) ? 0 : availableColor.hashCode());
		result = prime * result
				+ ((availableSize == null) ? 0 : availableSize.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result
				+ ((discountMmount == null) ? 0 : discountMmount.hashCode());
		result = prime * result + ((keyType == null) ? 0 : keyType.hashCode());
		result = prime * result
				+ ((maxDiscount == null) ? 0 : maxDiscount.hashCode());
		result = prime * result + ((msrp == null) ? 0 : msrp.hashCode());
		result = prime * result
				+ ((picturePath == null) ? 0 : picturePath.hashCode());
		result = prime
				* result
				+ ((productAvailable == null) ? 0 : productAvailable.hashCode());
		result = prime
				* result
				+ ((productDescription == null) ? 0 : productDescription
						.hashCode());
		result = prime * result + productId;
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result
				+ ((productNumber == null) ? 0 : productNumber.hashCode());
		result = prime * result + quantity;
		result = prime * result + quantityInStock;
		result = prime * result + quantityOnOrder;
		result = prime * result + ranking;
		result = prime * result
				+ ((recordLevel == null) ? 0 : recordLevel.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result
				+ ((unitPrice == null) ? 0 : unitPrice.hashCode());
		long temp;
		temp = Double.doubleToLongBits(unitWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Product other = (Product) obj;
		if (areaAvailability == null) {
			if (other.areaAvailability != null)
				return false;
		} else if (!areaAvailability.equals(other.areaAvailability))
			return false;
		if (availableColor == null) {
			if (other.availableColor != null)
				return false;
		} else if (!availableColor.equals(other.availableColor))
			return false;
		if (availableSize == null) {
			if (other.availableSize != null)
				return false;
		} else if (!availableSize.equals(other.availableSize))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (discountMmount == null) {
			if (other.discountMmount != null)
				return false;
		} else if (!discountMmount.equals(other.discountMmount))
			return false;
		if (keyType == null) {
			if (other.keyType != null)
				return false;
		} else if (!keyType.equals(other.keyType))
			return false;
		if (maxDiscount == null) {
			if (other.maxDiscount != null)
				return false;
		} else if (!maxDiscount.equals(other.maxDiscount))
			return false;
		if (msrp == null) {
			if (other.msrp != null)
				return false;
		} else if (!msrp.equals(other.msrp))
			return false;
		if (picturePath == null) {
			if (other.picturePath != null)
				return false;
		} else if (!picturePath.equals(other.picturePath))
			return false;
		if (productAvailable == null) {
			if (other.productAvailable != null)
				return false;
		} else if (!productAvailable.equals(other.productAvailable))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productNumber == null) {
			if (other.productNumber != null)
				return false;
		} else if (!productNumber.equals(other.productNumber))
			return false;
		if (quantity != other.quantity)
			return false;
		if (quantityInStock != other.quantityInStock)
			return false;
		if (quantityOnOrder != other.quantityOnOrder)
			return false;
		if (ranking != other.ranking)
			return false;
		if (recordLevel == null) {
			if (other.recordLevel != null)
				return false;
		} else if (!recordLevel.equals(other.recordLevel))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (unitPrice == null) {
			if (other.unitPrice != null)
				return false;
		} else if (!unitPrice.equals(other.unitPrice))
			return false;
		if (Double.doubleToLongBits(unitWeight) != Double
				.doubleToLongBits(other.unitWeight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productNumber="
				+ productNumber + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", unitPrice="
				+ unitPrice + ", msrp=" + msrp + ", discountMmount="
				+ discountMmount + ", maxDiscount=" + maxDiscount + ", size="
				+ size + ", color=" + color + ", availableSize="
				+ availableSize + ", availableColor=" + availableColor
				+ ", quantity=" + quantity + ", quantityInStock="
				+ quantityInStock + ", quantityOnOrder=" + quantityOnOrder
				+ ", recordLevel=" + recordLevel + ", productAvailable="
				+ productAvailable + ", unitWeight=" + unitWeight
				+ ", picturePath=" + picturePath + ", ranking=" + ranking
				+ ", keyType=" + keyType + ", areaAvailability="
				+ areaAvailability + "]";
	}

}
