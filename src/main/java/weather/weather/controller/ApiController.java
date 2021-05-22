package weather.weather.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import weather.weather.api.MetaWeatherAPI;
import weather.weather.custom.CityName;
import weather.weather.custom.CityNameResponse;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final MetaWeatherAPI metaWeatherAPI;

@GetMapping("/{city}")
@ResponseBody
public List<CityName> test(@PathVariable("city") String cityName) throws IOException {
    List<CityName> cityNames = metaWeatherAPI.cityName(cityName);

//TODO (X) Get the WOEID and assign it to a variable

      Integer cityWoed = cityNames.get(0).getWoeid();
      System.out.println(cityWoed);

//TODO ( ) invoke citywoeid method using the WOEID variable as a parameter

//TODO ( ) Map the method citywoeid() response as an object

    //JSON URL to Java object

//    ObjectMapper mapper = new ObjectMapper();
//    CityNameResponse obj = mapper.readValue(new URL("https://www.metaweather.com/api/location/"), CityNameResponse.class);
//    List<CityNameResponse> cityWoeid = metaWeatherAPI.citywoeid(cityWoed);

    return cityNames;
}
    }
