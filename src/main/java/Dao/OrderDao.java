package Dao;

import domain.Order;

public interface OrderDao {
    public void insert(int goodsId,int userId,String remarks,int P_ID,float count);
}
