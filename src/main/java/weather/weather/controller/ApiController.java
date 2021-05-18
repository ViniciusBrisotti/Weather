package weather.weather.controller;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.weather.api.MetaWeatherAPI;
import weather.weather.custom.CityName;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ApiController {


    private final MetaWeatherAPI metaWeatherAPI;

    @GetMapping("/")
    public String test(){
        List<CityName> london = metaWeatherAPI.cityName("london");
        return london.toString();

    }



}
