package domain;

public class SeekPro {
    private int id;
    private String P_NAME;
    private String P_TYPE;
    private float AMOUNT;
    private String P_BRAND;
    private String U_NAME;
    private String U_TEL;
    private String U_EMAIL;
    private String PRI_MAX;
    private String PRI_MIN;
    private String DES_SEEK;
    private String PUBLISH_DATE;

    public SeekPro(int id, String p_NAME, String p_TYPE, float AMOUNT, String p_BRAND, String u_NAME, String u_TEL, String u_EMAIL, String PRI_MAX, String PRI_MIN, String DES_SEEK) {
        this.id = id;
        P_NAME = p_NAME;
        P_TYPE = p_TYPE;
        this.AMOUNT = AMOUNT;
        P_BRAND = p_BRAND;
        U_NAME = u_NAME;
        U_TEL = u_TEL;
        U_EMAIL = u_EMAIL;
        this.PRI_MAX = PRI_MAX;
        this.PRI_MIN = PRI_MIN;
        this.DES_SEEK = DES_SEEK;
    }
    public SeekPro( String p_NAME, String p_TYPE, float AMOUNT, String p_BRAND, String u_NAME, String u_TEL, String u_EMAIL, String PRI_MAX, String PRI_MIN, String DES_SEEK,String PUBLISH_DATE) {
        P_NAME = p_NAME;
        P_TYPE = p_TYPE;
        this.AMOUNT = AMOUNT;
        P_BRAND = p_BRAND;
        U_NAME = u_NAME;
        U_TEL = u_TEL;
        U_EMAIL = u_EMAIL;
        this.PRI_MAX = PRI_MAX;
        this.PRI_MIN = PRI_MIN;
        this.DES_SEEK = DES_SEEK;
        this.PUBLISH_DATE = PUBLISH_DATE;
    }

    public SeekPro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_NAME() {
        return P_NAME;
    }

    public void setP_NAME(String p_NAME) {
        P_NAME = p_NAME;
    }

    public String getP_TYPE() {
        return P_TYPE;
    }

    public void setP_TYPE(String p_TYPE) {
        P_TYPE = p_TYPE;
    }

    public float getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(float AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getP_BRAND() {
        return P_BRAND;
    }

    public void setP_BRAND(String p_BRAND) {
        P_BRAND = p_BRAND;
    }

    public String getU_NAME() {
        return U_NAME;
    }

    public void setU_NAME(String u_NAME) {
        U_NAME = u_NAME;
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

    public String getPRI_MAX() {
        return PRI_MAX;
    }

    public void setPRI_MAX(String PRI_MAX) {
        this.PRI_MAX = PRI_MAX;
    }

    public String getPRI_MIN() {
        return PRI_MIN;
    }

    public void setPRI_MIN(String PRI_MIN) {
        this.PRI_MIN = PRI_MIN;
    }

    public String getDES_SEEK() {
        return DES_SEEK;
    }

    public void setDES_SEEK(String DES_SEEK) {
        this.DES_SEEK = DES_SEEK;
    }

    public String getPUBLISH_DATE() {
        return PUBLISH_DATE;
    }

    public void setPUBLISH_DATE(String PUBLISH_DATE) {
        this.PUBLISH_DATE = PUBLISH_DATE;
    }

    @Override
    public String toString() {
        return "SeekPro{" +
                "id=" + id +
                ", P_NAME='" + P_NAME + '\'' +
                ", P_TYPE='" + P_TYPE + '\'' +
                ", AMOUNT=" + AMOUNT +
                ", P_BRAND='" + P_BRAND + '\'' +
                ", U_NAME='" + U_NAME + '\'' +
                ", U_TEL='" + U_TEL + '\'' +
                ", U_EMAIL='" + U_EMAIL + '\'' +
                ", PRI_MAX='" + PRI_MAX + '\'' +
                ", PRI_MIN='" + PRI_MIN + '\'' +
                ", DES_SEEK='" + DES_SEEK + '\'' +
                ", PUBLISH_DATE='" + PUBLISH_DATE + '\'' +
                '}';
    }
}
