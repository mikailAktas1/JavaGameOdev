package gameOdev.dataAccess.concretes;

import java.util.List;
import gameOdev.dataAccess.abstracts.PlayerDao;
import gameOdev.entities.concretes.Player;

public class HibernatePlayerDao implements PlayerDao {

	@Override
	public void add(Player player) {
		System.out.println("Hibernate ile eklendi : " + player.getFirstName());
	}

	@Override
	public void delete(Player player) {
		System.out.println("Hibernate ile silindi : " + player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Hibernate ile güncellendi : " + player.getFirstName());
		
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

}
