package domain;

public class Purchase {
    private int P_ID;
    private String P_NAME;
    private String REMARK;
    private int U_ID;
    private String TOTALPRICE;

    public Purchase(String p_NAME, String REMARK, int u_ID) {
        P_NAME = p_NAME;
        this.REMARK = REMARK;
        U_ID = u_ID;
    }

    public int getP_ID() {
        return P_ID;
    }

    public void setP_ID(int p_ID) {
        P_ID = p_ID;
    }

    public String getP_NAME() {
        return P_NAME;
    }

    public void setP_NAME(String p_NAME) {
        P_NAME = p_NAME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public int getU_ID() {
        return U_ID;
    }

    public void setU_ID(int u_ID) {
        U_ID = u_ID;
    }

    public Purchase(String p_NAME, String REMARK, int u_ID, String TOTALPRICE) {
        P_NAME = p_NAME;
        this.REMARK = REMARK;
        U_ID = u_ID;
        this.TOTALPRICE = TOTALPRICE;
    }

    public String getTOTALPRICE() {
        return TOTALPRICE;
    }

    public void setTOTALPRICE(String TOTALPRICE) {
        this.TOTALPRICE = TOTALPRICE;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "P_ID=" + P_ID +
                ", P_NAME='" + P_NAME + '\'' +
                ", REMARK='" + REMARK + '\'' +
                ", U_ID=" + U_ID +
                ", TOTALPRICE='" + TOTALPRICE + '\'' +
                '}';
    }
}
