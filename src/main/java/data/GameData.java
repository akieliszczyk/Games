package data;

public class GameData {

    public static GameProvider fuzzBuzzData(){
        GameProvider gameProvider = new GameProvider();

        gameProvider.setMaxValue(100);
        gameProvider.setMinValue(1);

        return gameProvider;
    }
}
