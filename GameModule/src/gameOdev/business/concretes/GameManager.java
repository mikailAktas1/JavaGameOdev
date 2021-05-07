package gameOdev.business.concretes;

import java.util.List;

import gameOdev.business.abstracts.GameService;
import gameOdev.core.LoggerManagerAdapter;
import gameOdev.dataAccess.abstracts.GameDao;
import gameOdev.dataAccess.concretes.HibernatePlayerDao;
import gameOdev.entities.concretes.Game;

public class GameManager implements GameService {
	
	private GameDao gameDao;

	
	public GameManager(GameDao gameDao) {
		super();
		this.setGameDao(gameDao);
	}

	public GameManager(HibernatePlayerDao hibernatePlayerDao, LoggerManagerAdapter loggerManagerAdapter) {
		
	}

	@Override
	public void add(Game game) {
		if(game.getCategoryId()==1) {
			System.out.println("oyun eklendi hibernate ile : " + game.getGameName());
			return;
		}
		
		
	}

	@Override
	public void delete(Game game) {
		if(game.getCategoryId()==1) {
			System.out.println("oyun silindi");
			return ;
		}
	}

	@Override
	public void update(Game game) {
		if(game.getCategoryId()==1) {
			System.out.println("oyun güncellendi");
			return ;
		}
		
	}

	@Override
	public Game get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game>[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public GameDao getGameDao() {
		return gameDao;
	}

	public void setGameDao(GameDao gameDao) {
		this.gameDao = gameDao;
	}

}
