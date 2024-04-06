package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() throws NullPointerException{
        double tmp=dao.getData();
        double res=tmp*540/Math.PI;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
