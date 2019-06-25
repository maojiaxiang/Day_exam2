package mao.bw.com.maojiaxiang20190624.bean;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/14 08:54:32
 * @Description: 描述信息
 */
public class GoodsBean {
  /*   "commodityId": 42,
             "commodityName": "【清仓】浅口尖头中空交叉带单鞋高跟鞋",
             "masterPic": "http://172.17.8.100/images/small/commodity/nx/ggx/4/1.jpg",
             "price": 99,
             "saleNum": 0*/
    private String commodityId;
    private String commodityName;
    private String masterPic;
    private String price;
    private String saleNum;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(String masterPic) {
        this.masterPic = masterPic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(String saleNum) {
        this.saleNum = saleNum;
    }

    public GoodsBean(String commodityId, String commodityName, String masterPic, String price, String saleNum) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.masterPic = masterPic;
        this.price = price;
        this.saleNum = saleNum;

    }
}
