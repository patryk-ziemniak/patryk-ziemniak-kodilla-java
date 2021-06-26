package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double averageTemp = 0.0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            averageTemp += temperature.getValue();
        }
        averageTemp /= temperatures.getTemperatures().size();
        return averageTemp;
    }

    public double calculateMedianOfTemperatures() {
        double median = 0.0;

        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> entry :
                temperatures.getTemperatures().entrySet()) {
            list.add(entry.getValue());
        }
        Double[] temps = new Double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Double d = list.get(i);
            temps[i] = d;
        }
        Arrays.sort(temps);

        if (temps.length % 2 != 0) {
            int index = (temps.length + 1) / 2 - 1;
            median = temps[index];
        } else {
            int index = temps.length / 2 - 1;
            median = (temps[index] + temps[index + 1]) / 2;
        }
        return median;
    }
}
