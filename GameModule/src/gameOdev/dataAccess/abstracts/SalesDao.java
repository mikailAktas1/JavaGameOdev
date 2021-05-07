package gameOdev.dataAccess.abstracts;

import gameOdev.entities.concretes.Sales;

public interface SalesDao {
	 void add(Sales sales);
	 void delete(Sales sales);
	 void update(Sales sales);
	 void sell(Sales sales);

}
