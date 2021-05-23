package weather.weather.custom;

import lombok.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CityNameResponse {

    private String title;

    private String location_type;

    private String latt_long;

//    private LocalDateTime sun_rise;
//
//    private LocalDateTime sunt_set;

    private String timezone_name;

    private List<ConsolidateWeather> consolidated_weather;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ConsolidateWeather {

        private Long id;

        private Date applicable_date;

        private String weather_state_name;

        private String weather_state_abbr;

        private float wind_speed;

        private float wind_direction;

        private String wind_direction_compass;

        private Integer min_temp;

        private Integer max_temp;

        private float air_pressure;

        private float humidity;

        private float visibility;

        private Integer predictability;

    }

}

