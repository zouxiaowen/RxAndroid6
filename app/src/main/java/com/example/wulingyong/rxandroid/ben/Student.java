package com.example.wulingyong.rxandroid.ben;

import android.databinding.BindingAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.wulingyong.rxandroid.util.GlideUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaowen on 2018/3/24.
 */

public class Student implements Serializable {
    private int quantity;
    private double effectivePrice;
    private int rewardPoint;
    private double discount;
    private List<CartItemsBean> cartItems;
    private List<ProductsBean> products;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getEffectivePrice() {
        return effectivePrice;
    }

    public void setEffectivePrice(double effectivePrice) {
        this.effectivePrice = effectivePrice;
    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<CartItemsBean> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemsBean> cartItems) {
        this.cartItems = cartItems;
    }

    public List<ProductsBean> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsBean> products) {
        this.products = products;
    }

    public static class CartItemsBean implements Parcelable {
        private String skuName;
        private int flag;
        private int quantity;
        private int productId;
        private double price;
        private double subtotal;
        private String specification;
        private String skuThumbnail;
        private String skuPath;
        private int id;
        private int skuId;
        private boolean ischeck;

        public boolean isIscheck() {
            return ischeck;
        }

        public void setIscheck(boolean ischeck) {
            this.ischeck = ischeck;
        }

        public String getSkuName() {
            return skuName;
        }

        public void setSkuName(String skuName) {
            this.skuName = skuName;
        }

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getSubtotal() {
            return subtotal;
        }

        public void setSubtotal(double subtotal) {
            this.subtotal = subtotal;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getSkuThumbnail() {
            return skuThumbnail;
        }

        public void setSkuThumbnail(String skuThumbnail) {
            this.skuThumbnail = skuThumbnail;
        }

        public String getSkuPath() {
            return skuPath;
        }

        public void setSkuPath(String skuPath) {
            this.skuPath = skuPath;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSkuId() {
            return skuId;
        }

        public void setSkuId(int skuId) {
            this.skuId = skuId;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.skuName);
            dest.writeInt(this.flag);
            dest.writeInt(this.quantity);
            dest.writeInt(this.productId);
            dest.writeDouble(this.price);
            dest.writeDouble(this.subtotal);
            dest.writeString(this.specification);
            dest.writeString(this.skuThumbnail);
            dest.writeString(this.skuPath);
            dest.writeInt(this.id);
            dest.writeInt(this.skuId);
            dest.writeByte(this.ischeck ? (byte) 1 : (byte) 0);
        }

        public CartItemsBean() {
        }

        protected CartItemsBean(Parcel in) {
            this.skuName = in.readString();
            this.flag = in.readInt();
            this.quantity = in.readInt();
            this.productId = in.readInt();
            this.price = in.readDouble();
            this.subtotal = in.readDouble();
            this.specification = in.readString();
            this.skuThumbnail = in.readString();
            this.skuPath = in.readString();
            this.id = in.readInt();
            this.skuId = in.readInt();
            this.ischeck = in.readByte() != 0;
        }

        public static final Parcelable.Creator<CartItemsBean> CREATOR = new Parcelable.Creator<CartItemsBean>() {
            @Override
            public CartItemsBean createFromParcel(Parcel source) {
                return new CartItemsBean(source);
            }

            @Override
            public CartItemsBean[] newArray(int size) {
                return new CartItemsBean[size];
            }
        };
    }

    public static class ProductsBean {
        private int id;
        private long createdDate;
        private long lastModifiedDate;
        private String sn;
        private String name;
        private Object caption;
        private String type;
        private double price;
        private double marketPrice;
        private boolean isEvaluate;
        private boolean isMarketable;
        private boolean isActive;
        private Object introduction;
        private int receiveTime;
        private int hits;
        private int sales;
        private double displayPrice;





        public double getDisplayPrice() {
            return displayPrice;
        }

        public void setDisplayPrice(double displayPrice) {
            this.displayPrice = displayPrice;
        }

        private StoreBean store;
        private int exchangePointDisplay;
        private Object beginDate;
        private Object endDate;
        private Object productVedio;
        private Object address;
        private Object connectPhone;
        private Object isTopdate;
        private boolean buyMore;
        private boolean hasDistrobutor;
        private boolean hastogether;
        private String path;
        private int rewardPoint;
        private Object thumbnail;
        private int exchangePoint;
        private DefaultSkuBean defaultSku;
        private List<MainNewInfoBean.ProductsBean.ProductImagesBean> productImages;
        private List<?> specificationItems;
        private List<SkusBean> skus;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public long getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(long createdDate) {
            this.createdDate = createdDate;
        }

        public long getLastModifiedDate() {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(long lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getCaption() {
            return caption;
        }

        public void setCaption(Object caption) {
            this.caption = caption;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public boolean isIsEvaluate() {
            return isEvaluate;
        }

        public void setIsEvaluate(boolean isEvaluate) {
            this.isEvaluate = isEvaluate;
        }

        public boolean isIsMarketable() {
            return isMarketable;
        }

        public void setIsMarketable(boolean isMarketable) {
            this.isMarketable = isMarketable;
        }

        public boolean isIsActive() {
            return isActive;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public Object getIntroduction() {
            return introduction;
        }

        public void setIntroduction(Object introduction) {
            this.introduction = introduction;
        }

        public int getReceiveTime() {
            return receiveTime;
        }

        public void setReceiveTime(int receiveTime) {
            this.receiveTime = receiveTime;
        }

        public int getHits() {
            return hits;
        }

        public void setHits(int hits) {
            this.hits = hits;
        }

        public int getSales() {
            return sales;
        }

        public void setSales(int sales) {
            this.sales = sales;
        }

        public StoreBean getStore() {
            return store;
        }

        public void setStore(StoreBean store) {
            this.store = store;
        }

        public int getExchangePointDisplay() {
            return exchangePointDisplay;
        }

        public void setExchangePointDisplay(int exchangePointDisplay) {
            this.exchangePointDisplay = exchangePointDisplay;
        }

        public Object getBeginDate() {
            return beginDate;
        }

        public void setBeginDate(Object beginDate) {
            this.beginDate = beginDate;
        }

        public Object getEndDate() {
            return endDate;
        }

        public void setEndDate(Object endDate) {
            this.endDate = endDate;
        }

        public Object getProductVedio() {
            return productVedio;
        }

        public void setProductVedio(Object productVedio) {
            this.productVedio = productVedio;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getConnectPhone() {
            return connectPhone;
        }

        public void setConnectPhone(Object connectPhone) {
            this.connectPhone = connectPhone;
        }

        public Object getIsTopdate() {
            return isTopdate;
        }

        public void setIsTopdate(Object isTopdate) {
            this.isTopdate = isTopdate;
        }

        public boolean isBuyMore() {
            return buyMore;
        }

        public void setBuyMore(boolean buyMore) {
            this.buyMore = buyMore;
        }

        public boolean isHasDistrobutor() {
            return hasDistrobutor;
        }

        public void setHasDistrobutor(boolean hasDistrobutor) {
            this.hasDistrobutor = hasDistrobutor;
        }

        public boolean isHastogether() {
            return hastogether;
        }

        public void setHastogether(boolean hastogether) {
            this.hastogether = hastogether;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getRewardPoint() {
            return rewardPoint;
        }

        public void setRewardPoint(int rewardPoint) {
            this.rewardPoint = rewardPoint;
        }

        public Object getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(Object thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getExchangePoint() {
            return exchangePoint;
        }

        public void setExchangePoint(int exchangePoint) {
            this.exchangePoint = exchangePoint;
        }

        public DefaultSkuBean getDefaultSku() {
            return defaultSku;
        }

        public void setDefaultSku(DefaultSkuBean defaultSku) {
            this.defaultSku = defaultSku;
        }

        public List<MainNewInfoBean.ProductsBean.ProductImagesBean> getProductImages() {
            return productImages;
        }

        public void setProductImages(List<MainNewInfoBean.ProductsBean.ProductImagesBean> productImages) {
            this.productImages = productImages;
        }

        public List<?> getSpecificationItems() {
            return specificationItems;
        }

        public void setSpecificationItems(List<?> specificationItems) {
            this.specificationItems = specificationItems;
        }

        public List<SkusBean> getSkus() {
            return skus;
        }

        public void setSkus(List<SkusBean> skus) {
            this.skus = skus;
        }

        public static class StoreBean {
            private int id;
            private long createdDate;
            private long lastModifiedDate;
            private String name;
            private String type;
            private Object logo;
            private String mobile;
            private Object address;
            private Object introduction;
            private boolean isEnabled;
            private String path;
            private boolean hasExpired;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public long getCreatedDate() {
                return createdDate;
            }

            public void setCreatedDate(long createdDate) {
                this.createdDate = createdDate;
            }

            public long getLastModifiedDate() {
                return lastModifiedDate;
            }

            public void setLastModifiedDate(long lastModifiedDate) {
                this.lastModifiedDate = lastModifiedDate;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Object getLogo() {
                return logo;
            }

            public void setLogo(Object logo) {
                this.logo = logo;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public Object getAddress() {
                return address;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public Object getIntroduction() {
                return introduction;
            }

            public void setIntroduction(Object introduction) {
                this.introduction = introduction;
            }

            public boolean isIsEnabled() {
                return isEnabled;
            }

            public void setIsEnabled(boolean isEnabled) {
                this.isEnabled = isEnabled;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public boolean isHasExpired() {
                return hasExpired;
            }

            public void setHasExpired(boolean hasExpired) {
                this.hasExpired = hasExpired;
            }
        }

        public static class DefaultSkuBean {
            private int id;
            private long createdDate;
            private long lastModifiedDate;
            private String sn;
            private double price;
            private double marketPrice;
            private int rewardPoint;
            private int exchangePoint;
            private int stock;
            private int allocatedStock;
            private String name;
            private String type;
            private String path;
            private int availableStock;
            private Object thumbnail;
            private List<?> specificationValues;
            private List<StockLogsBean> stockLogs;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public long getCreatedDate() {
                return createdDate;
            }

            public void setCreatedDate(long createdDate) {
                this.createdDate = createdDate;
            }

            public long getLastModifiedDate() {
                return lastModifiedDate;
            }

            public void setLastModifiedDate(long lastModifiedDate) {
                this.lastModifiedDate = lastModifiedDate;
            }

            public String getSn() {
                return sn;
            }

            public void setSn(String sn) {
                this.sn = sn;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public double getMarketPrice() {
                return marketPrice;
            }

            public void setMarketPrice(double marketPrice) {
                this.marketPrice = marketPrice;
            }

            public int getRewardPoint() {
                return rewardPoint;
            }

            public void setRewardPoint(int rewardPoint) {
                this.rewardPoint = rewardPoint;
            }

            public int getExchangePoint() {
                return exchangePoint;
            }

            public void setExchangePoint(int exchangePoint) {
                this.exchangePoint = exchangePoint;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public int getAllocatedStock() {
                return allocatedStock;
            }

            public void setAllocatedStock(int allocatedStock) {
                this.allocatedStock = allocatedStock;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getAvailableStock() {
                return availableStock;
            }

            public void setAvailableStock(int availableStock) {
                this.availableStock = availableStock;
            }

            public Object getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(Object thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<?> getSpecificationValues() {
                return specificationValues;
            }

            public void setSpecificationValues(List<?> specificationValues) {
                this.specificationValues = specificationValues;
            }

            public List<StockLogsBean> getStockLogs() {
                return stockLogs;
            }

            public void setStockLogs(List<StockLogsBean> stockLogs) {
                this.stockLogs = stockLogs;
            }

            public static class StockLogsBean {


                private int id;
                private long createdDate;
                private long lastModifiedDate;
                private int stock;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public long getCreatedDate() {
                    return createdDate;
                }

                public void setCreatedDate(long createdDate) {
                    this.createdDate = createdDate;
                }

                public long getLastModifiedDate() {
                    return lastModifiedDate;
                }

                public void setLastModifiedDate(long lastModifiedDate) {
                    this.lastModifiedDate = lastModifiedDate;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }
            }
        }

        public static class SkusBean {

            private int id;
            private long createdDate;
            private long lastModifiedDate;
            private String sn;
            private double price;
            private double marketPrice;
            private int rewardPoint;
            private int exchangePoint;
            private int stock;
            private int allocatedStock;
            private String name;
            private String type;
            private String path;
            private int availableStock;
            private Object thumbnail;
            private List<?> specificationValues;
            private List<StockLogsBeanX> stockLogs;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public long getCreatedDate() {
                return createdDate;
            }

            public void setCreatedDate(long createdDate) {
                this.createdDate = createdDate;
            }

            public long getLastModifiedDate() {
                return lastModifiedDate;
            }

            public void setLastModifiedDate(long lastModifiedDate) {
                this.lastModifiedDate = lastModifiedDate;
            }

            public String getSn() {
                return sn;
            }

            public void setSn(String sn) {
                this.sn = sn;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public double getMarketPrice() {
                return marketPrice;
            }

            public void setMarketPrice(double marketPrice) {
                this.marketPrice = marketPrice;
            }

            public int getRewardPoint() {
                return rewardPoint;
            }

            public void setRewardPoint(int rewardPoint) {
                this.rewardPoint = rewardPoint;
            }

            public int getExchangePoint() {
                return exchangePoint;
            }

            public void setExchangePoint(int exchangePoint) {
                this.exchangePoint = exchangePoint;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public int getAllocatedStock() {
                return allocatedStock;
            }

            public void setAllocatedStock(int allocatedStock) {
                this.allocatedStock = allocatedStock;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public int getAvailableStock() {
                return availableStock;
            }

            public void setAvailableStock(int availableStock) {
                this.availableStock = availableStock;
            }

            public Object getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(Object thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<?> getSpecificationValues() {
                return specificationValues;
            }

            public void setSpecificationValues(List<?> specificationValues) {
                this.specificationValues = specificationValues;
            }

            public List<StockLogsBeanX> getStockLogs() {
                return stockLogs;
            }

            public void setStockLogs(List<StockLogsBeanX> stockLogs) {
                this.stockLogs = stockLogs;
            }

            public static class StockLogsBeanX {


                private int id;
                private long createdDate;
                private long lastModifiedDate;
                private int stock;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public long getCreatedDate() {
                    return createdDate;
                }

                public void setCreatedDate(long createdDate) {
                    this.createdDate = createdDate;
                }

                public long getLastModifiedDate() {
                    return lastModifiedDate;
                }

                public void setLastModifiedDate(long lastModifiedDate) {
                    this.lastModifiedDate = lastModifiedDate;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }
            }
        }
    }
}
