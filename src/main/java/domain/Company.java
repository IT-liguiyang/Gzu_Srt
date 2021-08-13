package domain;

public class Company {
    private int id;
    private String cname;
    private String Address;
    private String email;
    private String tel;
    private int per_charge;
    private String register_time;
    private String describe;

    public Company(int id, String cname, String address, String email, String tel, int per_charge, String register_time, String describe) {
        this.id = id;
        this.cname = cname;
        Address = address;
        this.email = email;
        this.tel = tel;
        this.per_charge = per_charge;
        this.register_time = register_time;
        this.describe = describe;
    }
    public Company(String cname, String address, String email, String tel, int per_charge, String describe) {
        this.cname = cname;
        Address = address;
        this.email = email;
        this.tel = tel;
        this.per_charge = per_charge;
        this.describe = describe;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPer_charge() {
        return per_charge;
    }

    public void setPer_charge(int per_charge) {
        this.per_charge = per_charge;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", Address='" + Address + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", per_charge=" + per_charge +
                ", register_time='" + register_time + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
