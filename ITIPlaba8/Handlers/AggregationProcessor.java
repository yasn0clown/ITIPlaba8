package Handlers;

import Annotation.DataProcessor;
import java.util.List;

@DataProcessor
public class AggregationProcessor implements DataHandler {
    @Override
    public void handleData(List<String> data) {
        int totalLength = data.stream().mapToInt(String::length).sum();
        System.out.println("Общая длина всех строк: " + totalLength);
    }
}