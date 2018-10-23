package com.example.wulingyong.rxandroid.ben;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Anhdxy on 2018/8/12
 * 新首页
 */
public class MainNewInfoBean {

    private List<AdsBean> ads;
    private List<StoreProductCategorysBean> storeProductCategorys;
    private List<ProductsBean> products;

    public List<AdsBean> getAds() {
        return ads;
    }

    public void setAds(List<AdsBean> ads) {
        this.ads = ads;
    }

    public List<StoreProductCategorysBean> getStoreProductCategorys() {
        return storeProductCategorys;
    }

    public void setStoreProductCategorys(List<StoreProductCategorysBean> storeProductCategorys) {
        this.storeProductCategorys = storeProductCategorys;
    }

    public List<ProductsBean> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsBean> products) {
        this.products = products;
    }

    public static class AdsBean {
        /**
         * id : 10451
         * createdDate : 1533965729000
         * lastModifiedDate : 1533965729000
         * title : 世界村
         * type : IMAGE
         * content : null
         * path : http://192.168.1.6:8080/redsunMall//upload/image/201808/23a110d9-0ded-4024-a970-6096ba944867.png
         * beginDate : null
         * endDate : null
         * url : http://www.baidu.com
         * adPosition : {"id":20,"createdDate":1526403553000,"lastModifiedDate":1526403553000}
         * subtitle : null
         * logPicture : null
         */

        private int id;
        private long createdDate;
        private long lastModifiedDate;
        private String title;
        private String type;
        private Object content;
        private String path;
        private Object beginDate;
        private Object endDate;
        private String url;
        private AdPositionBean adPosition;
        private Object subtitle;
        private Object logPicture;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public AdPositionBean getAdPosition() {
            return adPosition;
        }

        public void setAdPosition(AdPositionBean adPosition) {
            this.adPosition = adPosition;
        }

        public Object getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(Object subtitle) {
            this.subtitle = subtitle;
        }

        public Object getLogPicture() {
            return logPicture;
        }

        public void setLogPicture(Object logPicture) {
            this.logPicture = logPicture;
        }

        public static class AdPositionBean {
            /**
             * id : 20
             * createdDate : 1526403553000
             * lastModifiedDate : 1526403553000
             */

            private int id;
            private long createdDate;
            private long lastModifiedDate;

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
        }
    }

    public static class StoreProductCategorysBean {
        /**
         * id : 10553
         * createdDate : 1533979083000
         * lastModifiedDate : 1533979083000
         * name : 健康厨房
         */

        private int id;
        private long createdDate;
        private long lastModifiedDate;
        private String name;

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

    }

    public static class ProductsBean implements Parcelable {
        /**
         * id : 10501
         * createdDate : 1531576344000
         * lastModifiedDate : 1533979153000
         * sn : 201807141011111
         * name : 极暖 - 文冬姜
         * caption : null
         * type : GENERAL
         * price : 1989
         * marketPrice : 0
         * isEvaluate : false
         * isMarketable : true
         * isActive : true
         * introduction : <p><img src="http://1989sitecdn.gvg666.com/redsunMall//upload/image/201807/cbc0362e-3e25-43a1-9010-0b1d328b7d65.jpg" style="width: 750px;"><br></p>
         * receiveTime : 0
         * hits : 0
         * sales : 18
         * store : {"id":9951,"createdDate":1527995971000,"lastModifiedDate":1531744328000,"name":"世界村智慧零售","type":"GENERAL","logo":null,"mobile":"15832123211","address":null,"introduction":null,"isEnabled":true,"path":"/store/9951","hasExpired":false}
         * productImages : [{"source":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_source.png","large":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_large.jpg","medium":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_medium.jpg","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_thumbnail.jpg","order":0},{"source":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/e5871664-982a-4f48-93fb-2a5abbdd878b_source.png","large":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/e5871664-982a-4f48-93fb-2a5abbdd878b_large.jpg","medium":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/e5871664-982a-4f48-93fb-2a5abbdd878b_medium.jpg","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/e5871664-982a-4f48-93fb-2a5abbdd878b_thumbnail.jpg","order":1},{"source":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/7231d0e2-3afd-4135-809b-cd95a81a7b48_source.png","large":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/7231d0e2-3afd-4135-809b-cd95a81a7b48_large.jpg","medium":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/7231d0e2-3afd-4135-809b-cd95a81a7b48_medium.jpg","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/7231d0e2-3afd-4135-809b-cd95a81a7b48_thumbnail.jpg","order":2},{"source":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/10cfcca9-0187-4460-8384-9db655dac1d6_source.png","large":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/10cfcca9-0187-4460-8384-9db655dac1d6_large.jpg","medium":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/10cfcca9-0187-4460-8384-9db655dac1d6_medium.jpg","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/10cfcca9-0187-4460-8384-9db655dac1d6_thumbnail.jpg","order":3},{"source":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/06f3002b-a1bf-4782-9ce1-cad246974c27_source.png","large":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/06f3002b-a1bf-4782-9ce1-cad246974c27_large.jpg","medium":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/06f3002b-a1bf-4782-9ce1-cad246974c27_medium.jpg","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/06f3002b-a1bf-4782-9ce1-cad246974c27_thumbnail.jpg","order":4},{"source":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/58512638-5459-43f7-9f63-cebede453e68_source.png","large":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/58512638-5459-43f7-9f63-cebede453e68_large.jpg","medium":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/58512638-5459-43f7-9f63-cebede453e68_medium.jpg","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/58512638-5459-43f7-9f63-cebede453e68_thumbnail.jpg","order":5}]
         * specificationItems : []
         * skus : [{"id":10601,"createdDate":1531576344000,"lastModifiedDate":1533891600000,"sn":"201807141011111","price":1989,"marketPrice":0,"rewardPoint":1989,"exchangePoint":0,"stock":980,"allocatedStock":49,"specificationValues":[],"stockLogs":[{"id":12267,"createdDate":1533710281000,"lastModifiedDate":1533710281000,"stock":982},{"id":11152,"createdDate":1532228955000,"lastModifiedDate":1532228955000,"stock":995},{"id":10801,"createdDate":1531576344000,"lastModifiedDate":1531576344000,"stock":1000},{"id":11153,"createdDate":1532234179000,"lastModifiedDate":1532234179000,"stock":994},{"id":11151,"createdDate":1532211267000,"lastModifiedDate":1532211267000,"stock":996},{"id":12201,"createdDate":1533698150000,"lastModifiedDate":1533698150000,"stock":984},{"id":12103,"createdDate":1533650839000,"lastModifiedDate":1533650839000,"stock":985},{"id":11165,"createdDate":1532585429000,"lastModifiedDate":1532585429000,"stock":987},{"id":11163,"createdDate":1532422168000,"lastModifiedDate":1532422168000,"stock":988},{"id":11104,"createdDate":1532086026000,"lastModifiedDate":1532086026000,"stock":997},{"id":11168,"createdDate":1532604048000,"lastModifiedDate":1532604048000,"stock":986},{"id":12254,"createdDate":1533707603000,"lastModifiedDate":1533707603000,"stock":983},{"id":12606,"createdDate":1533729122000,"lastModifiedDate":1533729122000,"stock":981},{"id":11103,"createdDate":1532084179000,"lastModifiedDate":1532084179000,"stock":998},{"id":11156,"createdDate":1532234779000,"lastModifiedDate":1532234779000,"stock":992},{"id":11157,"createdDate":1532255637000,"lastModifiedDate":1532255637000,"stock":991},{"id":11154,"createdDate":1532234275000,"lastModifiedDate":1532234275000,"stock":993},{"id":12664,"createdDate":1533738062000,"lastModifiedDate":1533738062000,"stock":980},{"id":11001,"createdDate":1531737802000,"lastModifiedDate":1531737802000,"stock":999},{"id":11161,"createdDate":1532346654000,"lastModifiedDate":1532346654000,"stock":989},{"id":11159,"createdDate":1532341074000,"lastModifiedDate":1532341074000,"stock":990}],"name":"极暖 - 文冬姜","type":"GENERAL","path":"/product/detail/10501","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_thumbnail.jpg","availableStock":931}]
         * beginDate : null
         * endDate : null
         * productVedio : null
         * address : null
         * connectPhone : null
         * isTopdate : 1533979153000
         * buyMore : false
         * hasDistrobutor : false
         * hastogether : false
         * path : /product/detail/10501
         * rewardPoint : 1989
         * exchangePoint : 0
         * defaultSku : {"id":10601,"createdDate":1531576344000,"lastModifiedDate":1533891600000,"sn":"201807141011111","price":1989,"marketPrice":0,"rewardPoint":1989,"exchangePoint":0,"stock":980,"allocatedStock":49,"specificationValues":[],"stockLogs":[{"id":12267,"createdDate":1533710281000,"lastModifiedDate":1533710281000,"stock":982},{"id":11152,"createdDate":1532228955000,"lastModifiedDate":1532228955000,"stock":995},{"id":10801,"createdDate":1531576344000,"lastModifiedDate":1531576344000,"stock":1000},{"id":11153,"createdDate":1532234179000,"lastModifiedDate":1532234179000,"stock":994},{"id":11151,"createdDate":1532211267000,"lastModifiedDate":1532211267000,"stock":996},{"id":12201,"createdDate":1533698150000,"lastModifiedDate":1533698150000,"stock":984},{"id":12103,"createdDate":1533650839000,"lastModifiedDate":1533650839000,"stock":985},{"id":11165,"createdDate":1532585429000,"lastModifiedDate":1532585429000,"stock":987},{"id":11163,"createdDate":1532422168000,"lastModifiedDate":1532422168000,"stock":988},{"id":11104,"createdDate":1532086026000,"lastModifiedDate":1532086026000,"stock":997},{"id":11168,"createdDate":1532604048000,"lastModifiedDate":1532604048000,"stock":986},{"id":12254,"createdDate":1533707603000,"lastModifiedDate":1533707603000,"stock":983},{"id":12606,"createdDate":1533729122000,"lastModifiedDate":1533729122000,"stock":981},{"id":11103,"createdDate":1532084179000,"lastModifiedDate":1532084179000,"stock":998},{"id":11156,"createdDate":1532234779000,"lastModifiedDate":1532234779000,"stock":992},{"id":11157,"createdDate":1532255637000,"lastModifiedDate":1532255637000,"stock":991},{"id":11154,"createdDate":1532234275000,"lastModifiedDate":1532234275000,"stock":993},{"id":12664,"createdDate":1533738062000,"lastModifiedDate":1533738062000,"stock":980},{"id":11001,"createdDate":1531737802000,"lastModifiedDate":1531737802000,"stock":999},{"id":11161,"createdDate":1532346654000,"lastModifiedDate":1532346654000,"stock":989},{"id":11159,"createdDate":1532341074000,"lastModifiedDate":1532341074000,"stock":990}],"name":"极暖 - 文冬姜","type":"GENERAL","path":"/product/detail/10501","thumbnail":"http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_thumbnail.jpg","availableStock":931}
         * thumbnail : http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_thumbnail.jpg
         */

        private int id;
        private long createdDate;
        private long lastModifiedDate;
        private String sn;
        private String name;
        private String caption;
        private String type;
        private double price;
        private double marketPrice;
        private boolean isEvaluate;
        private boolean isMarketable;
        private boolean isActive;
        private String introduction;
        private int receiveTime;
        private int hits;
        private int sales;
        private long exchangePointDisplay;
        private String beginDate;
        private String endDate;
        private String productVedio;
        private String address;
        private String connectPhone;
        private long isTopdate;
        private boolean buyMore;
        private boolean hasDistrobutor;
        private boolean hastogether;
        private String path;
        private int rewardPoint;
        private int exchangePoint;
        private String thumbnail;
        private List<ProductImagesBean> productImages;
        private List<String> specificationItems;
        private String displayPrice;

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

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
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

        public String getBeginDate() {
            return beginDate;
        }

        public void setBeginDate(String beginDate) {
            this.beginDate = beginDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getProductVedio() {
            return productVedio;
        }

        public void setProductVedio(String productVedio) {
            this.productVedio = productVedio;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getConnectPhone() {
            return connectPhone;
        }

        public void setConnectPhone(String connectPhone) {
            this.connectPhone = connectPhone;
        }

        public long getIsTopdate() {
            return isTopdate;
        }

        public void setIsTopdate(long isTopdate) {
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

        public int getExchangePoint() {
            return exchangePoint;
        }

        public void setExchangePoint(int exchangePoint) {
            this.exchangePoint = exchangePoint;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public List<ProductImagesBean> getProductImages() {
            return productImages;
        }

        public void setProductImages(List<ProductImagesBean> productImages) {
            this.productImages = productImages;
        }

        public List<String> getSpecificationItems() {
            return specificationItems;
        }

        public void setSpecificationItems(List<String> specificationItems) {
            this.specificationItems = specificationItems;
        }

        public long getExchangePointDisplay() {
            return exchangePointDisplay;
        }

        public void setExchangePointDisplay(long exchangePointDisplay) {
            this.exchangePointDisplay = exchangePointDisplay;
        }

        public String getDisplayPrice() {
            return displayPrice;
        }

        public void setDisplayPrice(String displayPrice) {
            this.displayPrice = displayPrice;
        }

        public static class ProductImagesBean implements Parcelable {
            /**
             * source : http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_source.png
             * large : http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_large.jpg
             * medium : http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_medium.jpg
             * thumbnail : http://mallserver2sitecdn.gvg666.com/redsunMall//upload/image/201807/d2b5a79a-1073-4214-9135-962b106b72cf_thumbnail.jpg
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

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.source);
                dest.writeString(this.large);
                dest.writeString(this.medium);
                dest.writeString(this.thumbnail);
                dest.writeInt(this.order);
            }

            public ProductImagesBean() {
            }

            protected ProductImagesBean(Parcel in) {
                this.source = in.readString();
                this.large = in.readString();
                this.medium = in.readString();
                this.thumbnail = in.readString();
                this.order = in.readInt();
            }

            public static final Creator<ProductImagesBean> CREATOR = new Creator<ProductImagesBean>() {
                @Override
                public ProductImagesBean createFromParcel(Parcel source) {
                    return new ProductImagesBean(source);
                }

                @Override
                public ProductImagesBean[] newArray(int size) {
                    return new ProductImagesBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.id);
            dest.writeLong(this.createdDate);
            dest.writeLong(this.lastModifiedDate);
            dest.writeString(this.sn);
            dest.writeString(this.name);
            dest.writeString(this.caption);
            dest.writeString(this.type);
            dest.writeDouble(this.price);
            dest.writeString(this.displayPrice);
            dest.writeDouble(this.marketPrice);
            dest.writeByte(this.isEvaluate ? (byte) 1 : (byte) 0);
            dest.writeByte(this.isMarketable ? (byte) 1 : (byte) 0);
            dest.writeByte(this.isActive ? (byte) 1 : (byte) 0);
            dest.writeString(this.introduction);
            dest.writeInt(this.receiveTime);
            dest.writeInt(this.hits);
            dest.writeInt(this.sales);
            dest.writeLong(this.exchangePointDisplay);
            dest.writeString(this.beginDate);
            dest.writeString(this.endDate);
            dest.writeString(this.productVedio);
            dest.writeString(this.address);
            dest.writeString(this.connectPhone);
            dest.writeLong(this.isTopdate);
            dest.writeByte(this.buyMore ? (byte) 1 : (byte) 0);
            dest.writeByte(this.hasDistrobutor ? (byte) 1 : (byte) 0);
            dest.writeByte(this.hastogether ? (byte) 1 : (byte) 0);
            dest.writeString(this.path);
            dest.writeInt(this.rewardPoint);
            dest.writeInt(this.exchangePoint);
            dest.writeString(this.thumbnail);
            dest.writeTypedList(this.productImages);
            dest.writeStringList(this.specificationItems);
        }

        public ProductsBean() {
        }

        protected ProductsBean(Parcel in) {
            this.id = in.readInt();
            this.createdDate = in.readLong();
            this.lastModifiedDate = in.readLong();
            this.sn = in.readString();
            this.name = in.readString();
            this.caption = in.readString();
            this.type = in.readString();
            this.price = in.readDouble();
            this.displayPrice = in.readString();
            this.marketPrice = in.readDouble();
            this.isEvaluate = in.readByte() != 0;
            this.isMarketable = in.readByte() != 0;
            this.isActive = in.readByte() != 0;
            this.introduction = in.readString();
            this.receiveTime = in.readInt();
            this.hits = in.readInt();
            this.sales = in.readInt();
            this.exchangePointDisplay = in.readLong();
            this.beginDate = in.readString();
            this.endDate = in.readString();
            this.productVedio = in.readString();
            this.address = in.readString();
            this.connectPhone = in.readString();
            this.isTopdate = in.readLong();
            this.buyMore = in.readByte() != 0;
            this.hasDistrobutor = in.readByte() != 0;
            this.hastogether = in.readByte() != 0;
            this.path = in.readString();
            this.rewardPoint = in.readInt();
            this.exchangePoint = in.readInt();
            this.thumbnail = in.readString();
            this.productImages = in.createTypedArrayList(ProductImagesBean.CREATOR);
            this.specificationItems = in.createStringArrayList();
        }

        public static final Creator<ProductsBean> CREATOR = new Creator<ProductsBean>() {
            @Override
            public ProductsBean createFromParcel(Parcel source) {
                return new ProductsBean(source);
            }

            @Override
            public ProductsBean[] newArray(int size) {
                return new ProductsBean[size];
            }
        };
    }
}
