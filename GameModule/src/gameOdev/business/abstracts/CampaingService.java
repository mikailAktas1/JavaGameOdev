package gameOdev.business.abstracts;

import java.util.List;

import gameOdev.entities.concretes.Campaing;

public interface CampaingService {
	void add(Campaing campaing);
	 void delete(Campaing campaing);
	 void update(Campaing campaing);
	 Campaing get (int id);
	 List<Campaing>[] getAll();
}
