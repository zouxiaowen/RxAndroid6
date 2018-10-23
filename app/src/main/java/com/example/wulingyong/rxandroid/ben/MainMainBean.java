package com.example.wulingyong.rxandroid.ben;

import java.util.List;

/**
 * Created by Anhdxy on 2018/5/13
 */
public class MainMainBean {

    /**
     * code : 200
     * data : [{"id":10001,"createdDate":null,"lastModifiedDate":null,"sn":null,"name":"化妆品","caption":null,"type":"GENERAL","price":1989,"marketPrice":null,"isMarketable":null,"isActive":null,"introduction":null,"receiveTime":null,"hits":null,"sales":null,"store":null,"productImages":[{"source":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_source.jpg","large":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_large.jpg","medium":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_medium.jpg","thumbnail":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_thumbnail.jpg","order":0}],"specificationItems":[],"reviews":[],"skus":[],"path":"/product/detail/10001","thumbnail":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_thumbnail.jpg","rewardPoint":null,"exchangePoint":null,"defaultSku":null}]
     * tagName : 爆款
     * message : success
     */

    private int code;
    private String tagName;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 10001
         * createdDate : null
         * lastModifiedDate : null
         * sn : null
         * name : 化妆品
         * caption : null
         * type : GENERAL
         * price : 1989
         * marketPrice : null
         * isMarketable : null
         * isActive : null
         * introduction : null
         * receiveTime : null
         * hits : null
         * sales : null
         * store : null
         * productImages : [{"source":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_source.jpg","large":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_large.jpg","medium":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_medium.jpg","thumbnail":"http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_thumbnail.jpg","order":0}]
         * specificationItems : []
         * reviews : []
         * skus : []
         * path : /product/detail/10001
         * thumbnail : http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_thumbnail.jpg
         * rewardPoint : null
         * exchangePoint : null
         * defaultSku : null
         */

        private int id;
        private Object createdDate;
        private Object lastModifiedDate;
        private Object sn;
        private String name;
        private String caption;
        private String type;
        private double price;
        private double marketPrice;
        private Object isMarketable;
        private Object isActive;
        private Object introduction;
        private Object receiveTime;
        private Object hits;
        private Object sales;
        private Object store;
        private String path;
        private String thumbnail;
        private Object rewardPoint;
        private double exchangePoint;
        private Object defaultSku;
        private List<ProductImagesBean> productImages;
        private List<?> specificationItems;
        private List<?> reviews;
        private List<?> skus;
        private float size = 0;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(Object createdDate) {
            this.createdDate = createdDate;
        }

        public Object getLastModifiedDate() {
            return lastModifiedDate;
        }

        public void setLastModifiedDate(Object lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
        }

        public Object getSn() {
            return sn;
        }

        public void setSn(Object sn) {
            this.sn = sn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
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

        public Object getIsMarketable() {
            return isMarketable;
        }

        public void setIsMarketable(Object isMarketable) {
            this.isMarketable = isMarketable;
        }

        public Object getIsActive() {
            return isActive;
        }

        public void setIsActive(Object isActive) {
            this.isActive = isActive;
        }

        public Object getIntroduction() {
            return introduction;
        }

        public void setIntroduction(Object introduction) {
            this.introduction = introduction;
        }

        public Object getReceiveTime() {
            return receiveTime;
        }

        public void setReceiveTime(Object receiveTime) {
            this.receiveTime = receiveTime;
        }

        public Object getHits() {
            return hits;
        }

        public void setHits(Object hits) {
            this.hits = hits;
        }

        public Object getSales() {
            return sales;
        }

        public void setSales(Object sales) {
            this.sales = sales;
        }

        public Object getStore() {
            return store;
        }

        public void setStore(Object store) {
            this.store = store;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public Object getRewardPoint() {
            return rewardPoint;
        }

        public void setRewardPoint(Object rewardPoint) {
            this.rewardPoint = rewardPoint;
        }

        public double getExchangePoint() {
            return exchangePoint;
        }

        public void setExchangePoint(double exchangePoint) {
            this.exchangePoint = exchangePoint;
        }

        public Object getDefaultSku() {
            return defaultSku;
        }

        public void setDefaultSku(Object defaultSku) {
            this.defaultSku = defaultSku;
        }

        public List<ProductImagesBean> getProductImages() {
            return productImages;
        }

        public void setProductImages(List<ProductImagesBean> productImages) {
            this.productImages = productImages;
        }

        public List<?> getSpecificationItems() {
            return specificationItems;
        }

        public void setSpecificationItems(List<?> specificationItems) {
            this.specificationItems = specificationItems;
        }

        public List<?> getReviews() {
            return reviews;
        }

        public void setReviews(List<?> reviews) {
            this.reviews = reviews;
        }

        public List<?> getSkus() {
            return skus;
        }

        public void setSkus(List<?> skus) {
            this.skus = skus;
        }

        public float getSize() {
            return size;
        }

        public void setSize(float size) {
            this.size = size;
        }

        public static class ProductImagesBean {
            /**
             * source : http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_source.jpg
             * large : http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_large.jpg
             * medium : http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_medium.jpg
             * thumbnail : http://192.168.1.107:8080/redsunMall/upload/image/201805/ae78bf69-311b-4495-8f4d-86d2a03532a3_thumbnail.jpg
             * order : 0
             */

            private String source;
            private String large;
            private String medium;
            private String thumbnail;
            private int order;

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }
        }
    }
}
