package Dao;

public interface PurchaseDao {
    public void insert(String purchaseName,Integer UId,String remark,String price);
    public int getCount();
}
