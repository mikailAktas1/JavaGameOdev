package gameOdev;


import gameOdev.business.abstracts.PlayerService;
import gameOdev.business.concretes.PlayerManager;
import gameOdev.core.LoggerManagerAdapter;
import gameOdev.dataAccess.concretes.HibernatePlayerDao;
import gameOdev.entities.concretes.Player;

public class Main {

	public static void main(String[] args) {
		PlayerService playerService =
				new PlayerManager(new HibernatePlayerDao(),new LoggerManagerAdapter());
		Player player = new Player(1, 1, "mikail" , "aktas" ,1987);
		playerService.add(player);
		
	}

}
