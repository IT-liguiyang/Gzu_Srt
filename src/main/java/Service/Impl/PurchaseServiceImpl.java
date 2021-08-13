package Service.Impl;


import Dao.Impl.PurchaseDaoImpl;
import Dao.PurchaseDao;
import Service.PurchaseService;
import org.junit.jupiter.api.Test;

public class PurchaseServiceImpl implements PurchaseService {
    PurchaseDao purchaseDao = new PurchaseDaoImpl();
    @Override
    public void insert(String purchaseName, Integer UId, String remark,String price) {
        purchaseDao.insert(purchaseName,UId,remark,price);
    }

    @Override
    public int getCount() {
        return purchaseDao.getCount();
    }

    @Test
    void test()
    {
        insert("采购名称",1,"备注","6000");
    }
    @Test
    void test2(){
        System.out.println(getCount());
    }
}
