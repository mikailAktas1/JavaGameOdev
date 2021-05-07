package gameOdev.business.abstracts;

import java.util.List;

import gameOdev.entities.concretes.Game;

public interface GameService {
	void add(Game game);
	 void delete(Game game);
	 void update(Game game);
	 Game get (int id);
	 List<Game>[] getAll();

}
