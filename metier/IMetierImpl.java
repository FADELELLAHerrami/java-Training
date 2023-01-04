package metier;

import Dao.IDoa;

public class IMetierImpl implements IMetier{
	private IDoa dao = null;
	@Override
	public double calcul() {
		double d = dao.getData();
		double res = d * 23;
		return res;
	}
	public void setDao(IDoa dao) {
		this.dao=dao;
	}
}
