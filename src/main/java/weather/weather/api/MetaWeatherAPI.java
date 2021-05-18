package weather.weather.api;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import weather.weather.custom.CityName;
import weather.weather.custom.Woeid;

@Service
@FeignClient(name = "metaWeatherAPI", url = "https://www.metaweather.com/api/")
public interface MetaWeatherAPI {

    @RequestMapping("/search/?query={city_name}")
    List<CityName> cityName(@PathVariable("city_name") String cityName);

    @RequestMapping("/{woeid}")
    List<Woeid> citywoeid(@PathVariable("woeid") Integer woeid);

}
