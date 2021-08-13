package Dao.Impl;

import Dao.ProductDao;
import Util.JDBCUtils;
import domain.Product;
import domain.QuickPro;
import domain.SeekPro;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Product> getByType(String type) {
        String sql = "select * from product where PRO_TYPE = ?";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Product>(Product.class),type);
    }


    @Override
    public List<Product> paramSelect(int start, String type, String category, String price, String place, String typeSupply, String mode,String FindType) {
        String sql = "select * from product where ID > 0";
        StringBuffer sb = new StringBuffer(sql);
        int pageSize = 3;



        List params = new ArrayList();

        if(!type.equals("不限"))
        {
            sb.append(" and PRO_TYPE = ?");
            params.add(type);
        }
        if(!category.equals("不限"))
        {
            sb.append(" and PRO_CATEGORY = ?");
            params.add(category);
        }
        if(!price.equals("不限"))
        {
            sb.append(" and PRO_PRICE = ?");
            params.add(price);
        }
        if(!place.equals("不限"))
        {
            sb.append(" and PLACE_ORIGIN = ?");
            params.add(place);
        }
        if(!typeSupply.equals("不限"))
        {
            sb.append(" and PRO_TYPE_SUPPLY = ?");
            params.add(typeSupply);
        }
        if(!mode.equals("不限"))
        {
            sb.append(" and PRO_MODE = ?");
            params.add(mode);
        }

        if(FindType.equals("最新"))
        {
            sb.append(" order by PRO_CREATE_DATE DESC");
        }
        else if(FindType.equals("最热"))
        {
            sb.append(" order by PRO_SALES_VOLUME DESC");
        }
        else if(FindType.equals("最便宜"))
        {
            sb.append(" order by PRO_PRICE ASC");

        }
        else if(FindType.equals("最贵"))
        {
            sb.append(" order by PRO_PRICE DESC");
        }

        params.add((start-1)*3);
        params.add(pageSize);
        sb.append(" LIMIT ?,?");


        return jdbcTemplate.query(sb.toString(),new BeanPropertyRowMapper<Product>(Product.class),params.toArray());

    }

    @Override
    public void insertProSeek(SeekPro seekPro) {
        String sql = "insert into seek(P_NAME,P_TYPE,AMOUNT,P_BRAND,U_NAME,U_TEL,U_EMAIL,PRI_MAX,PRI_MIN,DES_SEEK,PUBLISH_DATE) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,seekPro.getP_NAME(),seekPro.getP_TYPE(),seekPro.getAMOUNT(),seekPro.getP_BRAND(),seekPro.getU_NAME(),seekPro.getU_TEL(),seekPro.getU_EMAIL(),seekPro.getPRI_MAX(),seekPro.getPRI_MIN(),seekPro.getDES_SEEK(),seekPro.getPUBLISH_DATE());

    }

    @Override
    public int getWages(int start, String type, String category, String price, String place, String typeSupply, String mode, String findType) {
        String sql = "select count(id) from product where 1=1";
        StringBuffer sb = new StringBuffer(sql);
        //int pageSize = 3;



        List params = new ArrayList();

        if(!type.equals("不限"))
        {
            sb.append(" and PRO_TYPE = ?");
            params.add(type);
        }
        if(!category.equals("不限"))
        {
            sb.append(" and PRO_CATEGORY = ?");
            params.add(category);
        }
        if(!price.equals("不限"))
        {
            sb.append(" and PRO_PRICE = ?");
            params.add(price);
        }
        if(!place.equals("不限"))
        {
            sb.append(" and PLACE_ORIGIN = ?");
            params.add(place);
        }
        if(!typeSupply.equals("不限"))
        {
            sb.append(" and PRO_TYPE_SUPPLY = ?");
            params.add(typeSupply);
        }
        if(!mode.equals("不限"))
        {
            sb.append(" and PRO_MODE = ?");
            params.add(mode);
        }

        if(findType.equals("最新"))
        {
            sb.append(" order by PRO_CREATE_DATE DESC");
        }
        else if(findType.equals("最热"))
        {
            sb.append(" order by PRO_SALES_VOLUME DESC");
        }
        else if(findType.equals("最便宜"))
        {
            sb.append(" order by PRO_PRICE ASC");

        }
        else if(findType.equals("最贵"))
        {
            sb.append(" order by PRO_PRICE DESC");
        }
        System.out.println(sb.toString());
        System.out.println(params);
        int temp = jdbcTemplate.queryForObject(sb.toString(), Integer.class,params.toArray());
        if(temp%3==0) return temp/3;
        return (temp/3)+1;
    }

    @Override
    public void insertQuickPro(QuickPro quickPro) {
        String sql = "insert into QUICK_PRO(Q_NAME,Q_TYPE,Q_SCALE,Q_BRAND,Q_DATE,Q_PLACE,U_TEL,U_EMAIL,PRO_FACTORY,SOLDMERCHANT,Q_PRICE,Q_DES) VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
        jdbcTemplate.update(sql,quickPro.getQ_NAME(),quickPro.getQ_TYPE(),quickPro.getQ_SCALE(),quickPro.getQ_BRAND(),quickPro.getQ_DATE(),quickPro.getQ_PLACE(),quickPro.getU_TEL(),quickPro.getU_EMAIL(),quickPro.getPRO_FACTORY(),quickPro.getSOLDMERCHANT(),quickPro.getQ_PRICE(),quickPro.getQ_DES());

    }


}
