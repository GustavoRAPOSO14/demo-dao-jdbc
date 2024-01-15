package principal;

import model.dao.DaoFatory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
	
		SellerDao sellerDao = DaoFatory.createSellerDao();
		
		Seller seller = sellerDao.findById(7);
		
		
		System.out.println(seller);
	}
}
