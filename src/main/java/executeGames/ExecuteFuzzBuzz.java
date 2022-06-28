package executeGames;

import data.GameData;
import data.GameProvider;
import games.FuzzBuzz;

public class ExecuteFuzzBuzz {

    public static void main(String[] args) {
        GameProvider gameProvider;
        gameProvider = GameData.fuzzBuzzData();

        FuzzBuzz fuzzBuzz = new FuzzBuzz(gameProvider);

        fuzzBuzz.gameFuzzBuzz();
    }
}
