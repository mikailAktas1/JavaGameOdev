package gameOdev.dataAccess.abstracts;

import java.util.List;

import gameOdev.entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	 void delete(Game game);
	 void update(Game game);
	 Game get (int id);
	 List<Game>[] getAll();

}
