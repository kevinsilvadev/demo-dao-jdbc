package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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

		System.out.println("=== TESTE 3: seller findAll ====");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);

		}
		
	    System.out.println("=== TESTE 4: seller SelerInsert ====");
	    Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(),  4000.0, department);
	    sellerDao.insert(newSeller);
	    System.out.println("Inserted! New Id = " + newSeller.getId());
	    
	    System.out.println("=== TESTE 5: seller Selerupdate ====");
	    seller = sellerDao.finbyid(1);
	    seller.setName("Martha Wayne");
	    sellerDao.update(seller);
	    System.out.println("Updated completed");
	    
	    System.out.println("=== TESTE 6: seller delete ====");
	    System.out.println("Enter id  for delete teste: ");
	    int id = sc.nextInt();
	    sellerDao.deleteByid(id);
	    System.out.println("Delete completed");
	    

	    
	    
	    

	}

}
