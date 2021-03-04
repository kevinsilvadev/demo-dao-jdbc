package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.finbyid(3);
		
		System.out.println("=== TESTE 1: seller findById ====");
		System.out.println(seller);
		
	}

}
