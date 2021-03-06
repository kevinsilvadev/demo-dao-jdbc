package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1: seller findById ====");
		Seller seller = sellerDao.finbyid(3);
		System.out.println(seller);

		System.out.println("=== TESTE 2: seller findById ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("=== TESTE 3: seller findById ====");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
