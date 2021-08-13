package domain;

public class QuickPro {
    private int ID;
    private String Q_NAME;
    private String Q_TYPE;
    private String Q_SCALE;
    private String Q_BRAND ;
    private String Q_DATE;
    private String Q_PLACE;
    private String U_TEL;
    private String U_EMAIL;
    private String PRO_FACTORY;
    private String SOLDMERCHANT;
    private String Q_PRICE;
    private String Q_DES;

    public QuickPro(int ID, String q_NAME, String q_TYPE, String q_SCALE, String q_BRAND, String q_DATE, String q_PLACE, String u_TEL, String u_EMAIL, String PRO_FACTORY, String SOLDMERCHANT, String q_PRICE, String q_DES) {
        this.ID = ID;
        Q_NAME = q_NAME;
        Q_TYPE = q_TYPE;
        Q_SCALE = q_SCALE;
        Q_BRAND = q_BRAND;
        Q_DATE = q_DATE;
        Q_PLACE = q_PLACE;
        U_TEL = u_TEL;
        U_EMAIL = u_EMAIL;
        this.PRO_FACTORY = PRO_FACTORY;
        this.SOLDMERCHANT = SOLDMERCHANT;
        Q_PRICE = q_PRICE;
        Q_DES = q_DES;
    }

    public QuickPro(String q_NAME, String q_TYPE, String q_SCALE, String q_BRAND, String q_DATE, String q_PLACE, String u_TEL, String u_EMAIL, String PRO_FACTORY, String SOLDMERCHANT, String q_PRICE, String q_DES) {
        Q_NAME = q_NAME;
        Q_TYPE = q_TYPE;
        Q_SCALE = q_SCALE;
        Q_BRAND = q_BRAND;
        Q_DATE = q_DATE;
        Q_PLACE = q_PLACE;
        U_TEL = u_TEL;
        U_EMAIL = u_EMAIL;
        this.PRO_FACTORY = PRO_FACTORY;
        this.SOLDMERCHANT = SOLDMERCHANT;
        Q_PRICE = q_PRICE;
        Q_DES = q_DES;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQ_NAME() {
        return Q_NAME;
    }

    public void setQ_NAME(String q_NAME) {
        Q_NAME = q_NAME;
    }

    public String getQ_TYPE() {
        return Q_TYPE;
    }

    public void setQ_TYPE(String q_TYPE) {
        Q_TYPE = q_TYPE;
    }

    public String getQ_SCALE() {
        return Q_SCALE;
    }

    public void setQ_SCALE(String q_SCALE) {
        Q_SCALE = q_SCALE;
    }

    public String getQ_BRAND() {
        return Q_BRAND;
    }

    public void setQ_BRAND(String q_BRAND) {
        Q_BRAND = q_BRAND;
    }

    public String getQ_DATE() {
        return Q_DATE;
    }

    public void setQ_DATE(String q_DATE) {
        Q_DATE = q_DATE;
    }

    public String getQ_PLACE() {
        return Q_PLACE;
    }

    public void setQ_PLACE(String q_PLACE) {
        Q_PLACE = q_PLACE;
    }

    public String getU_TEL() {
        return U_TEL;
    }

    public void setU_TEL(String u_TEL) {
        U_TEL = u_TEL;
    }

    public String getU_EMAIL() {
        return U_EMAIL;
    }

    public void setU_EMAIL(String u_EMAIL) {
        U_EMAIL = u_EMAIL;
    }

    public String getPRO_FACTORY() {
        return PRO_FACTORY;
    }

    public void setPRO_FACTORY(String PRO_FACTORY) {
        this.PRO_FACTORY = PRO_FACTORY;
    }

    public String getSOLDMERCHANT() {
        return SOLDMERCHANT;
    }

    public void setSOLDMERCHANT(String SOLDMERCHANT) {
        this.SOLDMERCHANT = SOLDMERCHANT;
    }

    public String getQ_PRICE() {
        return Q_PRICE;
    }

    public void setQ_PRICE(String q_PRICE) {
        Q_PRICE = q_PRICE;
    }

    public String getQ_DES() {
        return Q_DES;
    }

    public void setQ_DES(String q_DES) {
        Q_DES = q_DES;
    }

    @Override
    public String toString() {
        return "QuickPro{" +
                "ID=" + ID +
                ", Q_NAME='" + Q_NAME + '\'' +
                ", Q_TYPE='" + Q_TYPE + '\'' +
                ", Q_SCALE='" + Q_SCALE + '\'' +
                ", Q_BRAND='" + Q_BRAND + '\'' +
                ", Q_DATE='" + Q_DATE + '\'' +
                ", Q_PLACE='" + Q_PLACE + '\'' +
                ", U_TEL='" + U_TEL + '\'' +
                ", U_EMAIL='" + U_EMAIL + '\'' +
                ", PRO_FACTORY='" + PRO_FACTORY + '\'' +
                ", SOLDMERCHANT='" + SOLDMERCHANT + '\'' +
                ", Q_PRICE='" + Q_PRICE + '\'' +
                ", Q_DES='" + Q_DES + '\'' +
                '}';
    }
}
