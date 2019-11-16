package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("+++ TEST 1 FINDBYID +++");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n+++ TEST 2 FINDBYDEPARTMENT +++");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);	
		
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		

	/*	System.out.println("\n+++ TEST 3 FINDALL +++");
		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("\n+++ TEST 4 INSERT +++");
		Seller nSeller = new Seller(null,"Greg","greg@gmail.com",new Date(), 4000.0, department);
		sellerDao.insert(nSeller);
		System.out.println("Inserted! New id = "+ nSeller.getId());*/
		
		System.out.println("\n+++ TEST 4 INSERT +++");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Updated complet!");
	}	

}
