package principal;

import model.dao.DaoFatory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
	
		SellerDao sellerDao = DaoFatory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(7);
		
		
		System.out.println(seller);
	}
}
