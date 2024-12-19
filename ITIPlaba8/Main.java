import Handlers.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();

        dataManager.registerDataProcessor(new FilterProcessor());
        dataManager.registerDataProcessor(new TransformProcessor());
        dataManager.registerDataProcessor(new AggregationProcessor());

        try {
            dataManager.loadData("source.txt");
            dataManager.processData();
            dataManager.saveData("destination.txt");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            dataManager.shutdown();
        }
    }
}
