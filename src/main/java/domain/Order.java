package domain;

public class Order {
    private int orderid;
    private int goodsid;
    private int factoryid;
    private int companyid;
    private int userid;
    private int P_ID;
    private int orderstatus;
    private int delivertype;
    private String delivermoney;
    private String totalmoney;
    private String realmoney;
    private int paytype;
    private String payform;
    private int ispay;
    private String recivername;
    private String reciveraddress;
    private String recivertel;
    private int isInvoice;
    private String remarks;
    private int isrefund;
    private int isAppraise;
    private String deliverytime;
    private String recivertime;
    private String payTime;
    private String ORDER_DES;

    public Order(int goodsid, int factoryid, int companyid, int userid, int p_ID, int orderstatus, int delivertype, String delivermoney, String totalmoney, String realmoney, int paytype, String payform, int ispay, String recivername, String reciveraddress, String recivertel, int isInvoice, String remarks, int isrefund, int isAppraise, String deliverytime, String recivertime, String payTime, String ORDER_DES) {
        this.goodsid = goodsid;
        this.factoryid = factoryid;
        this.companyid = companyid;
        this.userid = userid;
        P_ID = p_ID;
        this.orderstatus = orderstatus;
        this.delivertype = delivertype;
        this.delivermoney = delivermoney;
        this.totalmoney = totalmoney;
        this.realmoney = realmoney;
        this.paytype = paytype;
        this.payform = payform;
        this.ispay = ispay;
        this.recivername = recivername;
        this.reciveraddress = reciveraddress;
        this.recivertel = recivertel;
        this.isInvoice = isInvoice;
        this.remarks = remarks;
        this.isrefund = isrefund;
        this.isAppraise = isAppraise;
        this.deliverytime = deliverytime;
        this.recivertime = recivertime;
        this.payTime = payTime;
        this.ORDER_DES = ORDER_DES;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public int getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(int factoryid) {
        this.factoryid = factoryid;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getP_ID() {
        return P_ID;
    }

    public void setP_ID(int p_ID) {
        P_ID = p_ID;
    }

    public int getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(int orderstatus) {
        this.orderstatus = orderstatus;
    }

    public int getDelivertype() {
        return delivertype;
    }

    public void setDelivertype(int delivertype) {
        this.delivertype = delivertype;
    }

    public String getDelivermoney() {
        return delivermoney;
    }

    public void setDelivermoney(String delivermoney) {
        this.delivermoney = delivermoney;
    }

    public String getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(String totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(String realmoney) {
        this.realmoney = realmoney;
    }

    public int getPaytype() {
        return paytype;
    }

    public void setPaytype(int paytype) {
        this.paytype = paytype;
    }

    public String getPayform() {
        return payform;
    }

    public void setPayform(String payform) {
        this.payform = payform;
    }

    public int getIspay() {
        return ispay;
    }

    public void setIspay(int ispay) {
        this.ispay = ispay;
    }

    public String getRecivername() {
        return recivername;
    }

    public void setRecivername(String recivername) {
        this.recivername = recivername;
    }

    public String getReciveraddress() {
        return reciveraddress;
    }

    public void setReciveraddress(String reciveraddress) {
        this.reciveraddress = reciveraddress;
    }

    public String getRecivertel() {
        return recivertel;
    }

    public void setRecivertel(String recivertel) {
        this.recivertel = recivertel;
    }

    public int getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(int isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(int isrefund) {
        this.isrefund = isrefund;
    }

    public int getIsAppraise() {
        return isAppraise;
    }

    public void setIsAppraise(int isAppraise) {
        this.isAppraise = isAppraise;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getRecivertime() {
        return recivertime;
    }

    public void setRecivertime(String recivertime) {
        this.recivertime = recivertime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getORDER_DES() {
        return ORDER_DES;
    }

    public void setORDER_DES(String ORDER_DES) {
        this.ORDER_DES = ORDER_DES;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", goodsid=" + goodsid +
                ", factoryid=" + factoryid +
                ", companyid=" + companyid +
                ", userid=" + userid +
                ", P_ID=" + P_ID +
                ", orderstatus=" + orderstatus +
                ", delivertype=" + delivertype +
                ", delivermoney='" + delivermoney + '\'' +
                ", totalmoney='" + totalmoney + '\'' +
                ", realmoney='" + realmoney + '\'' +
                ", paytype=" + paytype +
                ", payform='" + payform + '\'' +
                ", ispay=" + ispay +
                ", recivername='" + recivername + '\'' +
                ", reciveraddress='" + reciveraddress + '\'' +
                ", recivertel='" + recivertel + '\'' +
                ", isInvoice=" + isInvoice +
                ", remarks='" + remarks + '\'' +
                ", isrefund=" + isrefund +
                ", isAppraise=" + isAppraise +
                ", deliverytime='" + deliverytime + '\'' +
                ", recivertime='" + recivertime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", ORDER_DES='" + ORDER_DES + '\'' +
                '}';
    }
}
