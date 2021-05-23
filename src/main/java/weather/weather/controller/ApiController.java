package weather.weather.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import weather.weather.api.MetaWeatherAPI;
import weather.weather.custom.CityName;
import weather.weather.custom.CityNameResponse;
import java.io.IOException;
import java.util.*;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final MetaWeatherAPI metaWeatherAPI;

@GetMapping("/{city}")
@ResponseBody
public Map<String, Integer> test(@PathVariable("city") String cityName) throws IOException {

    List<CityName> cityNames = metaWeatherAPI.cityName(cityName);

    Integer cityWoed = cityNames.get(0).getWoeid();

    CityNameResponse response = metaWeatherAPI.citywoeid(cityWoed);

    CityNameResponse.ConsolidateWeather weather = response.getConsolidated_weather().get(0);

    Integer maxTempCelsius = weather.getMax_temp();
    Integer minTempCelsius = weather.getMin_temp();
    Integer maxTempF = (int)(maxTempCelsius * 1.8 + 32);
    Integer minTempF = (int)(minTempCelsius * 1.8 + 32);

    Map<String, Integer> temperatures = new HashMap<>();
    temperatures.put("max_temp_celsius", maxTempCelsius);
    temperatures.put("min_temp_celsius", minTempCelsius);
    temperatures.put("max_temp_fahrenheit", maxTempF);
    temperatures.put("min_temp_fahrenheit", minTempF);




    return temperatures;
}
    }