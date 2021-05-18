package weather.weather.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import weather.weather.custom.CityName;
import weather.weather.custom.Woeid;

import java.util.List;

@FeignClient(name = "metaWeatherAPI", url = "https://www.metaweather.com/api/location")
public interface MetaWeatherAPI {

    @RequestMapping("/search/?query={city_name}")
    List<CityName> cityName(@PathVariable("city_name") String cityName);

    @RequestMapping("/{woeid}")
    List<Woeid> citywoeid(@PathVariable("woeid") Integer woeid);

}
