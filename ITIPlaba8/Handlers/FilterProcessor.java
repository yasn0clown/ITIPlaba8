package Handlers;

import Annotation.DataProcessor;
import java.util.List;

@DataProcessor
public class FilterProcessor implements DataHandler {
    @Override
    public void handleData(List<String> data) {
        data.removeIf(s -> s.length() <= 5);
    }
}
