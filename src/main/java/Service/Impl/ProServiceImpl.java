package Service.Impl;

import Dao.Impl.ProductDaoImpl;
import Dao.ProductDao;
import Service.ProService;
import domain.Product;
import domain.QuickPro;
import domain.SeekPro;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProServiceImpl implements ProService {
    ProductDao productDao = new ProductDaoImpl();
    @Override
    public List<Product> getByType(String type) {
        return productDao.getByType(type);
    }

    @Override
    public List<Product> getbyParams(int start, String type, String category, String price, String place, String typeSupply, String mode,String FindType) {
        return productDao.paramSelect(start,type,category,price,place,typeSupply,mode,FindType);
    }

    @Override
    public void insertSeekPro(SeekPro seekPro) {
        productDao.insertProSeek(seekPro);
    }

    @Override
    public int getWages(int start, String type, String category, String price, String place, String typeSupply, String mode, String findType) {
        return productDao.getWages(start,type,category,price,place,typeSupply,mode,findType);
    }

    @Override
    public void insertQuickPro(QuickPro quickPro) {
        productDao.insertQuickPro(quickPro);
    }


    @Test
    public void test()
    {
        String type = "砌筑材料";
        List<Product> list = getByType(type);
        for (Product pro: list) {
            System.out.println(pro);
        }
    }
    @Test
    public void test2()
    {

        int start = 1;
        String type = "砌筑材料";
        String category = "石灰";
        List<Product> list = getbyParams(start,type,category,"不限","不限","不限","不限","最贵");
        for(Product product: list)
        {
            System.out.println(product);
        }
    }

    @Test
    public void test3()
    {
        SeekPro seekPro = new SeekPro("油漆4564","砌筑材料",60,"test","john","123123","1@163.com","60","40","这是一条测试数据","2021-01-24");

        insertSeekPro(seekPro);


    }
    @Test
    public void test4()
    {
        //System.out.println(getWages(start, type, category, price, place, typeSupply, mode, FindType));
    }

    @Test
    public void test5()
    {
        QuickPro quickPro = new QuickPro("name","type","scale","brand","2021-1-25","place","tel","email","factory","soldmerchant","60","des");
        insertQuickPro(quickPro);
    }
}
