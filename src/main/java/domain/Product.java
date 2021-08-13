package domain;

public class Product {

    private int ID;
    private int COM_ID;
    private String PRO_NAME;
    private String PRO_DESCRIBE;
    private String PLACE_ORIGIN;
    private String PRO_MODE;
    private String PRO_CATEGORY;
    private String PRO_TYPE_SUPPLY;
    private String PRO_PRICE;
    private String PRO_TYPE;
    private String PRO_BRAND;
    private String PRO_FUNCTION;
    private String PRO_COLOR;
    private String PRO_SAFELEVEL;
    private int PRO_STATE;
    private String PRO_MATERRIAL;
    private  String PRO_CREATE_DATE;
    private Float PRO_SALES_VOLUME;
    private Float PRO_AVG_SCORE;
    private String DESCRIBE_URL;
    private String PICTURE_URL;
    private Float LENGTH;
    private Float WIDTH;








    public Product(int ID, int COM_ID, String PRO_NAME, String PRO_DESCRIBE, String PLACE_ORIGIN, String PRO_PRICE, String PRO_TYPE, String PRO_MODE, String PRO_FUNCTION, String PRO_BRAND, String PRO_COLOR, String PRO_CATEGORY, String PRO_TYPE_SUPPLY, int PRO_STATE, String PRO_CREATE_DATE, String PRO_SAFELEVEL, String PRO_MATERRIAL, Float PRO_SALES_VOLUME, Float PRO_AVG_SCORE, String DESCRIBE_URL, String PICTURE_URL, Float LENGTH, Float WIDTH) {
        this.ID = ID;
        this.COM_ID = COM_ID;
        this.PRO_NAME = PRO_NAME;
        this.PRO_DESCRIBE = PRO_DESCRIBE;
        this.PLACE_ORIGIN = PLACE_ORIGIN;
        this.PRO_PRICE = PRO_PRICE;
        this.PRO_TYPE = PRO_TYPE;
        this.PRO_MODE = PRO_MODE;
        this.PRO_FUNCTION = PRO_FUNCTION;
        this.PRO_BRAND = PRO_BRAND;
        this.PRO_COLOR = PRO_COLOR;
        this.PRO_CATEGORY = PRO_CATEGORY;
        this.PRO_TYPE_SUPPLY = PRO_TYPE_SUPPLY;
        this.PRO_STATE = PRO_STATE;
        this.PRO_CREATE_DATE = PRO_CREATE_DATE;
        this.PRO_SAFELEVEL = PRO_SAFELEVEL;
        this.PRO_MATERRIAL = PRO_MATERRIAL;
        this.PRO_SALES_VOLUME = PRO_SALES_VOLUME;
        this.PRO_AVG_SCORE = PRO_AVG_SCORE;
        this.DESCRIBE_URL = DESCRIBE_URL;
        this.PICTURE_URL = PICTURE_URL;
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
    }

    public Product() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCOM_ID() {
        return COM_ID;
    }

    public void setCOM_ID(int COM_ID) {
        this.COM_ID = COM_ID;
    }

    public String getPRO_NAME() {
        return PRO_NAME;
    }

    public void setPRO_NAME(String PRO_NAME) {
        this.PRO_NAME = PRO_NAME;
    }

    public String getPRO_DESCRIBE() {
        return PRO_DESCRIBE;
    }

    public void setPRO_DESCRIBE(String PRO_DESCRIBE) {
        this.PRO_DESCRIBE = PRO_DESCRIBE;
    }

    public String getPLACE_ORIGIN() {
        return PLACE_ORIGIN;
    }

    public void setPLACE_ORIGIN(String PLACE_ORIGIN) {
        this.PLACE_ORIGIN = PLACE_ORIGIN;
    }

    public String getPRO_PRICE() {
        return PRO_PRICE;
    }

    public void setPRO_PRICE(String PRO_PRICE) {
        this.PRO_PRICE = PRO_PRICE;
    }

    public String getPRO_TYPE() {
        return PRO_TYPE;
    }

    public void setPRO_TYPE(String PRO_TYPE) {
        this.PRO_TYPE = PRO_TYPE;
    }

    public String getPRO_MODE() {
        return PRO_MODE;
    }

    public void setPRO_MODE(String PRO_MODE) {
        this.PRO_MODE = PRO_MODE;
    }

    public String getPRO_FUNCTION() {
        return PRO_FUNCTION;
    }

    public void setPRO_FUNCTION(String PRO_FUNCTION) {
        this.PRO_FUNCTION = PRO_FUNCTION;
    }

    public String getPRO_BRAND() {
        return PRO_BRAND;
    }

    public void setPRO_BRAND(String PRO_BRAND) {
        this.PRO_BRAND = PRO_BRAND;
    }

    public String getPRO_COLOR() {
        return PRO_COLOR;
    }

    public void setPRO_COLOR(String PRO_COLOR) {
        this.PRO_COLOR = PRO_COLOR;
    }

    public String getPRO_CATEGORY() {
        return PRO_CATEGORY;
    }

    public void setPRO_CATEGORY(String PRO_CATEGORY) {
        this.PRO_CATEGORY = PRO_CATEGORY;
    }

    public String getPRO_TYPE_SUPPLY() {
        return PRO_TYPE_SUPPLY;
    }

    public void setPRO_TYPE_SUPPLY(String PRO_TYPE_SUPPLY) {
        this.PRO_TYPE_SUPPLY = PRO_TYPE_SUPPLY;
    }

    public int getPRO_STATE() {
        return PRO_STATE;
    }

    public void setPRO_STATE(int PRO_STATE) {
        this.PRO_STATE = PRO_STATE;
    }

    public String getPRO_CREATE_DATE() {
        return PRO_CREATE_DATE;
    }

    public void setPRO_CREATE_DATE(String PRO_CREATE_DATE) {
        this.PRO_CREATE_DATE = PRO_CREATE_DATE;
    }

    public String getPRO_SAFELEVEL() {
        return PRO_SAFELEVEL;
    }

    public void setPRO_SAFELEVEL(String PRO_SAFELEVEL) {
        this.PRO_SAFELEVEL = PRO_SAFELEVEL;
    }

    public String getPRO_MATERRIAL() {
        return PRO_MATERRIAL;
    }

    public void setPRO_MATERRIAL(String PRO_MATERRIAL) {
        this.PRO_MATERRIAL = PRO_MATERRIAL;
    }

    public Float getPRO_SALES_VOLUME() {
        return PRO_SALES_VOLUME;
    }

    public void setPRO_SALES_VOLUME(Float PRO_SALES_VOLUME) {
        this.PRO_SALES_VOLUME = PRO_SALES_VOLUME;
    }

    public Float getPRO_AVG_SCORE() {
        return PRO_AVG_SCORE;
    }

    public void setPRO_AVG_SCORE(Float PRO_AVG_SCORE) {
        this.PRO_AVG_SCORE = PRO_AVG_SCORE;
    }

    public String getDESCRIBE_URL() {
        return DESCRIBE_URL;
    }

    public void setDESCRIBE_URL(String DESCRIBE_URL) {
        this.DESCRIBE_URL = DESCRIBE_URL;
    }

    public String getPICTURE_URL() {
        return PICTURE_URL;
    }

    public void setPICTURE_URL(String PICTURE_URL) {
        this.PICTURE_URL = PICTURE_URL;
    }

    public Float getLENGTH() {
        return LENGTH;
    }

    public void setLENGTH(Float LENGTH) {
        this.LENGTH = LENGTH;
    }

    public Float getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(Float WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", COM_ID=" + COM_ID +
                ", PRO_NAME='" + PRO_NAME + '\'' +
                ", PRO_DESCRIBE='" + PRO_DESCRIBE + '\'' +
                ", PLACE_ORIGIN='" + PLACE_ORIGIN + '\'' +
                ", PRO_PRICE='" + PRO_PRICE + '\'' +
                ", PRO_TYPE='" + PRO_TYPE + '\'' +
                ", PRO_MODE='" + PRO_MODE + '\'' +
                ", PRO_FUNCTION='" + PRO_FUNCTION + '\'' +
                ", PRO_BRAND='" + PRO_BRAND + '\'' +
                ", PRO_COLOR='" + PRO_COLOR + '\'' +
                ", PRO_CATEGORY='" + PRO_CATEGORY + '\'' +
                ", PRO_TYPE_SUPPLY='" + PRO_TYPE_SUPPLY + '\'' +
                ", PRO_STATE=" + PRO_STATE +
                ", PRO_CREATE_DATE='" + PRO_CREATE_DATE + '\'' +
                ", PRO_SAFELEVEL='" + PRO_SAFELEVEL + '\'' +
                ", PRO_MATERRIAL='" + PRO_MATERRIAL + '\'' +
                ", PRO_SALES_VOLUME=" + PRO_SALES_VOLUME +
                ", PRO_AVG_SCORE=" + PRO_AVG_SCORE +
                ", DESCRIBE_URL='" + DESCRIBE_URL + '\'' +
                ", PICTURE_URL='" + PICTURE_URL + '\'' +
                ", LENGTH=" + LENGTH +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
