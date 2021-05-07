package gameOdev.business.concretes;

import java.util.List;

import gameOdev.business.abstracts.PlayerService;
import gameOdev.core.LoggerManagerAdapter;
import gameOdev.dataAccess.abstracts.PlayerDao;
import gameOdev.entities.concretes.Player;

public class PlayerManager implements PlayerService {
	
	private PlayerDao playerDao;

	public PlayerManager(PlayerDao playerDao, LoggerManagerAdapter loggerManagerAdapter) {
		super();
		this.setPlayerDao(playerDao);
	}

	@Override
	public void add(Player player) {
		if(player.getPlayerId()==1) {
			System.out.println("oyuncu eklendi hibernate ile   : " +  player.getFirstName()  + player.getLastName());
			return;
		}
		
		this.playerDao.add(player);
	}
		
		
	

	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player>[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public PlayerDao getPlayerDao() {
		return playerDao;
	}

	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

}
