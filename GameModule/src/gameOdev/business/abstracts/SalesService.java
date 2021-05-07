package gameOdev.business.abstracts;

import gameOdev.entities.concretes.Sales;

public interface SalesService {
	 void add(Sales sales);
	 void delete(Sales sales);
	 void update(Sales sales);
	 void sell(Sales sales);

}
