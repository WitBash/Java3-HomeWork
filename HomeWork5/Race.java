package HomeWork5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stages;
    int checkWinner = 0;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public synchronized void checkWinner(Car c) {
        if (checkWinner == 0) {
            checkWinner++;
            System.out.println("Участник #" + c.getName() + " - WIN");
        } else return;
    }
}

