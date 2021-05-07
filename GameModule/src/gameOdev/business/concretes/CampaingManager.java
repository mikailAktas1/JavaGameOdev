package gameOdev.business.concretes;

import java.util.List;

import gameOdev.business.abstracts.CampaingService;
import gameOdev.dataAccess.abstracts.CampaingDao;
import gameOdev.entities.concretes.Campaing;

public class CampaingManager implements CampaingService {
	
	private CampaingDao campaingDao;

	public CampaingDao getCampaingDao() {
		return campaingDao;
	}

	public void setCampaingDao(CampaingDao campaingDao) {
		this.campaingDao = campaingDao;
	}

	@Override
	public void add(Campaing campaing) {
		if(campaing.getId()==1) {
			System.out.println("Bu kategoride kampanya eklenemiyor");
			return;
		}
		
		this.campaingDao.add(campaing);
	}

	@Override
	public void delete(Campaing campaing) {
		if(campaing.getId()==1) {
			System.out.println("Bu kategoride kampanya silinemiyor");
			return;
		}
		
		this.campaingDao.delete(campaing);
		
	}

	@Override
	public void update(Campaing campaing) {
		if(campaing.getId()==1) {
			System.out.println("Bu kategoride kampanya güncellenemiyor");
			return;
		}
		
		this.campaingDao.update(campaing);
	}

	@Override
	public Campaing get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Campaing>[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
