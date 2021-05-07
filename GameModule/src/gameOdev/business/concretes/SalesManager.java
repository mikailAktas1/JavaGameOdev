package gameOdev.business.concretes;

import gameOdev.business.abstracts.SalesService;
import gameOdev.dataAccess.abstracts.SalesDao;
import gameOdev.entities.concretes.Sales;

public class SalesManager implements SalesService {
	
	private SalesDao salesDao;

	public SalesManager(SalesDao salesDao) {
		super();
		this.setSalesDao(salesDao);
	}


	public void add(Sales sales) {
		System.out.println("satýþ eklendi : " + sales.getId());
	}


	public void delete(Sales sales) {
		
			System.out.println("oyuncu eklendi");
			
		}
		
	public void update(Sales sales) {
		System.out.println("satýþ güncellendi : " + sales.getId());
		
	}

	public SalesDao getSalesDao() {
		return salesDao;
	}

	public void setSalesDao(SalesDao salesDao) {
		this.salesDao = salesDao;
	}


	@Override
	public void sell(Sales sales) {
		System.out.println("satýþ yapýldý :" + sales.getProductName());
		
	}

}
