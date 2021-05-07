package gameOdev.dataAccess.abstracts;

import java.util.List;

import gameOdev.entities.concretes.Campaing;

public interface CampaingDao {
	 void add(Campaing campaing);
	 void delete(Campaing campaing);
	 void update(Campaing campaing);
	 Campaing get (int id);
	 List<Campaing>[] getAll();
	 
}
