package games;

import data.GameData;
import data.GameProvider;

public class FuzzBuzz {

    private GameProvider gameProvider;

    public FuzzBuzz(GameProvider gameProvider) {
        this.gameProvider = gameProvider;
    }

    public void gameFuzzBuzz() {
        int i;

        for(i = gameProvider.getMinValue(); i<= gameProvider.getMaxValue(); i++) {
            if((i%3==0) & (i%5!=0)) {
                System.out.print("Fuzz, ");
            }

            else if ((i%5==0) & i%3!=0) {
                System.out.print("Buzz, ");
            }

            else if (i%15==0) {
                System.out.print("FuzzBuzzy, ");
            }

            else {
                System.out.print(i + ", ");
            }
        }
    }
}
