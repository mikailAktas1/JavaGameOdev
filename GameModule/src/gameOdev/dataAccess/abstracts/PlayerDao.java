package gameOdev.dataAccess.abstracts;

import java.util.List;

import gameOdev.entities.concretes.Player;

public interface PlayerDao {
	void add(Player player);
	 void delete(Player player);
	 void update(Player player);
	 Player get (int id);
	 List<Player>[] getAll();

}
