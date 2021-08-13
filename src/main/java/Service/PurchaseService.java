package Service;

public interface PurchaseService {
    public void insert(String purchaseName,Integer UId,String remark,String price);
    public int getCount();
}
