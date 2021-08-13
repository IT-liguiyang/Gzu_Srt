package Service;

import domain.Product;
import domain.QuickPro;
import domain.SeekPro;

import java.util.List;

public interface ProService {
    public List<Product> getByType(String type);
    public List<Product> getbyParams(int start, String type, String category, String price, String place, String typeSupply, String mode,String FindType);
    public void insertSeekPro(SeekPro seekPro);

    public int getWages(int start, String type, String category, String price, String place, String typeSupply, String mode, String findType);
    public void insertQuickPro(QuickPro quickPro);
}
