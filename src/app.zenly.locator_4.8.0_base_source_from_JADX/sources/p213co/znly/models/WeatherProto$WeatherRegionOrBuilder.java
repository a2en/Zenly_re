package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.WeatherProto$WeatherRegionOrBuilder */
public interface WeatherProto$WeatherRegionOrBuilder extends MessageLiteOrBuilder {
    WeatherProto$Weather getWeathers(int i);

    int getWeathersCount();

    List<WeatherProto$Weather> getWeathersList();
}
