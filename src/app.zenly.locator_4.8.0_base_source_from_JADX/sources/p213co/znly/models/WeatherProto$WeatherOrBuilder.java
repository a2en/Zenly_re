package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.WeatherProto$Weather.C6939b;

/* renamed from: co.znly.models.WeatherProto$WeatherOrBuilder */
public interface WeatherProto$WeatherOrBuilder extends MessageLiteOrBuilder {
    C6939b getConditions(int i);

    int getConditionsCount();

    List<C6939b> getConditionsList();

    int getHumidity();

    double getPressure();

    Timestamp getSunrise();

    Timestamp getSunset();

    double getTemperature();

    Timestamp getTimestamp();

    boolean hasSunrise();

    boolean hasSunset();

    boolean hasTimestamp();
}
