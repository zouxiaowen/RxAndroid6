package com.example.wulingyong.rxandroid.ben;

import java.util.List;

public class UseBen {

    /**
     * pendingShipmentOrderCount : 0
     * shippedOrderCount : 0
     * productNotifyCount : 0
     * level : 普通会员
     * cashTotalAmount : 5000.0
     * unreadMessageCount : 0
     * consultationCount : 0
     * levelName : 普通会员
     * userName : null
     * newOrders : [{"id":9951,"createdDate":1526021077000,"lastModifiedDate":1526021078000,"sn":"201805111010000","type":"GENERAL","status":"PENDING_PAYMENT","price":1900,"amount":1900,"store":{"id":1,"createdDate":1525968589000,"lastModifiedDate":1525968589000,"name":"手机数码旗舰店","type":"SELF","logo":"http://image.demo.b2b2c.shopxx.net/6.0/fdae92b9-9ad8-4f01-a699-e129ed434fd4.png","isEnabled":true,"path":"/store/1","hasExpired":false},"isReviewed":false,"orderItems":[{"id":9951,"createdDate":1526021077000,"lastModifiedDate":1526021077000,"name":"苹果(Apple) iPhone SE","type":"GENERAL","price":1900,"thumbnail":"http://image.demo.b2b2c.shopxx.net/6.0/cd7715a9-ad05-453c-8efd-2dbcb21171cf_thumbnail.jpg","specifications":["黑色","16GB"]}],"hasExpired":false}]
     * point : 0
     * pendingPaymentOrderCount : 1
     * allMoney : 0
     * customerPhone : 800-8888888
     * couponCodeCount : 0
     * reviewCount : 0
     * teamNumber : 0
     * directNumber : 0
     * productFavoriteCount : 0
     */
    private String memberImage;
    private int pendingShipmentOrderCount;
    private int shippedOrderCount;
    private int productNotifyCount;
    private int level;
    private String cashTotalAmount;
    private String balance;
    private int unreadMessageCount;
    private int consultationCount;
    private String levelName;
    private String userName;
    private int point;
    private int pendingPaymentOrderCount;
    private double allMoney;
    private String customerPhone;
    private int couponCodeCount;
    private int reviewCount;
    private int teamNumber;
    private int directNumber;
    private int productFavoriteCount;
    private String tockholder;
    private boolean memberFlag;//是否是1989会员
    private List<NewOrdersBean> newOrders;

    public int getPendingShipmentOrderCount() {
        return pendingShipmentOrderCount;
    }

    public void setPendingShipmentOrderCount(int pendingShipmentOrderCount) {
        this.pendingShipmentOrderCount = pendingShipmentOrderCount;
    }

    public int getShippedOrderCount() {
        return shippedOrderCount;
    }

    public void setShippedOrderCount(int shippedOrderCount) {
        this.shippedOrderCount = shippedOrderCount;
    }

    public int getProductNotifyCount() {
        return productNotifyCount;
    }

    public void setProductNotifyCount(int productNotifyCount) {
        this.productNotifyCount = productNotifyCount;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCashTotalAmount() {
        return cashTotalAmount;
    }

    public void setCashTotalAmount(String cashTotalAmount) {
        this.cashTotalAmount = cashTotalAmount;
    }

    public int getUnreadMessageCount() {
        return unreadMessageCount;
    }

    public void setUnreadMessageCount(int unreadMessageCount) {
        this.unreadMessageCount = unreadMessageCount;
    }

    public int getConsultationCount() {
        return consultationCount;
    }

    public void setConsultationCount(int consultationCount) {
        this.consultationCount = consultationCount;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPendingPaymentOrderCount() {
        return pendingPaymentOrderCount;
    }

    public void setPendingPaymentOrderCount(int pendingPaymentOrderCount) {
        this.pendingPaymentOrderCount = pendingPaymentOrderCount;
    }

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public int getCouponCodeCount() {
        return couponCodeCount;
    }

    public void setCouponCodeCount(int couponCodeCount) {
        this.couponCodeCount = couponCodeCount;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public int getDirectNumber() {
        return directNumber;
    }

    public void setDirectNumber(int directNumber) {
        this.directNumber = directNumber;
    }

    public int getProductFavoriteCount() {
        return productFavoriteCount;
    }

    public void setProductFavoriteCount(int productFavoriteCount) {
        this.productFavoriteCount = productFavoriteCount;
    }

    public List<NewOrdersBean> getNewOrders() {
        return newOrders;
    }

    public void setNewOrders(List<NewOrdersBean> newOrders) {
        this.newOrders = newOrders;
    }

    public String getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(String memberImage) {
        this.memberImage = memberImage;
    }

    public String getTockholder() {
        return tockholder;
    }

    public void setTockholder(String tockholder) {
        this.tockholder = tockholder;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public boolean isMemberFlag() {
        return memberFlag;
    }

    public void setMemberFlag(boolean memberFlag) {
        this.memberFlag = memberFlag;
    }

    public static class NewOrdersBean {
        /**
         * id : 9951
         * createdDate : 1526021077000
         * lastModifiedDate : 1526021078000
         * sn : 201805111010000
         * type : GENERAL
         * status : PENDING_PAYMENT
         * price : 1900.0
         * amount : 1900.0
         * store : {"id":1,"createdDate":1525968589000,"lastModifiedDate":1525968589000,"name":"手机数码旗舰店","type":"SELF","logo":"http://image.demo.b2b2c.shopxx.net/6.0/fdae92b9-9ad8-4f01-a699-e129ed434fd4.png","isEnabled":true,"path":"/store/1","hasExpired":false}
         * isReviewed : false
         * orderItems : [{"id":9951,"createdDate":1526021077000,"lastModifiedDate":1526021077000,"name":"苹果(Apple) iPhone SE","type":"GENERAL","price":1900,"thumbnail":"http://image.demo.b2b2c.shopxx.net/6.0/cd7715a9-ad05-453c-8efd-2dbcb21171cf_thumbnail.jpg","specifications":["黑色","16GB"]}]
         * hasExpired : false
         */

        private int id;
        private long createdDate;
        private long lastModifiedDate;
        private String sn;
        private String type;
        private String status;
        private double price;
        private double amount;
        private StoreBean store;
        private boolean isReviewed;
        private boolean hasExpired;
        private List<OrderItemsBean> orderItems;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public StoreBean getStore() {
            return store;
        }

        public void setStore(StoreBean store) {
            this.store = store;
        }

        public boolean isIsReviewed() {
            return isReviewed;
        }

        public void setIsReviewed(boolean isReviewed) {
            this.isReviewed = isReviewed;
        }

        public boolean isHasExpired() {
            return hasExpired;
        }

        public void setHasExpired(boolean hasExpired) {
            this.hasExpired = hasExpired;
        }

        public List<OrderItemsBean> getOrderItems() {
            return orderItems;
        }

        public void setOrderItems(List<OrderItemsBean> orderItems) {
            this.orderItems = orderItems;
        }

        public static class StoreBean {
            /**
             * id : 1
             * createdDate : 1525968589000
             * lastModifiedDate : 1525968589000
             * name : 手机数码旗舰店
             * type : SELF
             * logo : http://image.demo.b2b2c.shopxx.net/6.0/fdae92b9-9ad8-4f01-a699-e129ed434fd4.png
             * isEnabled : true
             * path : /store/1
             * hasExpired : false
             */

            private int id;
            private long createdDate;
            private long lastModifiedDate;
            private String name;
            private String type;
            private String logo;
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

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
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

        public static class OrderItemsBean {
            /**
             * id : 9951
             * createdDate : 1526021077000
             * lastModifiedDate : 1526021077000
             * name : 苹果(Apple) iPhone SE
             * type : GENERAL
             * price : 1900.0
             * thumbnail : http://image.demo.b2b2c.shopxx.net/6.0/cd7715a9-ad05-453c-8efd-2dbcb21171cf_thumbnail.jpg
             * specifications : ["黑色","16GB"]
             */

            private int id;
            private long createdDate;
            private long lastModifiedDate;
            private String name;
            private String type;
            private double price;
            private String thumbnail;
            private List<String> specifications;

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

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<String> getSpecifications() {
                return specifications;
            }

            public void setSpecifications(List<String> specifications) {
                this.specifications = specifications;
            }
        }
    }
}
