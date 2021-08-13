package Service.Impl;

import Dao.Impl.OrderDaoImpl;
import Dao.OrderDao;
import Service.OrderService;
import org.junit.jupiter.api.Test;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao = new OrderDaoImpl();
    @Override
    public void insert(int goodsId, int userId, String remarks, int P_ID,float count) {
        orderDao.insert(goodsId, userId, remarks,P_ID,count);
    }
    @Test
    void test()
    {
        insert(1,2,"备注",1,60);
    }
}
