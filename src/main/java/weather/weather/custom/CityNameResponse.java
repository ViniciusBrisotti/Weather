package weather.weather.custom;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CityNameResponse {

    private String title;

    private String location_type;

    private float latt_long;

    private LocalDateTime sun_rise;

    private LocalDateTime sunt_set;

    private String timezone_name;

    public class consolidated_weather {

        private Integer id;

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

