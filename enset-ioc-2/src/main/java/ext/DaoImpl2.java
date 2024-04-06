package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Vers Capteurs");
        double tmp = 2000;
        return tmp;
    }
}
