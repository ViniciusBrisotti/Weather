package weather.weather.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import weather.weather.api.MetaWeatherAPI;
import weather.weather.custom.CityName;


import java.util.List;

@RequiredArgsConstructor
@RestController
public class ApiController {


    private final MetaWeatherAPI metaWeatherAPI;

//    @GetMapping("/")
//    public String test() {
//        List<CityName> london = metaWeatherAPI.cityName("london");
//        return london.toString();
//
//    }
@GetMapping("/{city}")
@ResponseBody
public List<CityName> test(@PathVariable("city") String cityName) {
    List<CityName> cityNames = metaWeatherAPI.cityName(cityName);
    //CityName.class.cast(cityNames).getWoeid();

            //Pegar o ID da cidade e atribuir em uma variavel.
            //Chamar o método  citywoeid com a variável criada acima
            //Mapear o retorno do citywoeid em um objeto
        //  Os campos que coloquei na WOEID nao sao os que esta devolvendo
    return cityNames;
}


}
