package weather.weather.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.weather.custom.CityName;
import weather.weather.custom.CityNameResponse;
import java.util.List;

@RestController
@FeignClient(name = "metaWeatherAPI", url = "https://www.metaweather.com/api/location")
public interface MetaWeatherAPI {

    @RequestMapping("/search/?query={cityName}")
    List<CityName> cityName(@PathVariable("cityName") String cityName);

    @RequestMapping("/{woeid}")
    CityNameResponse citywoeid(@PathVariable("woeid") Integer woeid);

}
