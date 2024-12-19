package Handlers;

import Annotation.DataProcessor;
import java.util.List;

@DataProcessor
public class TransformProcessor implements DataHandler {
    @Override
    public void handleData(List<String> data) {
        for (int i = 0; i < data.size(); i++) {
            data.set(i, data.get(i).toUpperCase());
        }
    }
}
