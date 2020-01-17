package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.BrumpProto$AcceleroPointsOrBuilder */
public interface BrumpProto$AcceleroPointsOrBuilder extends MessageLiteOrBuilder {
    float getAx(int i);

    int getAxCount();

    List<Float> getAxList();

    float getAy(int i);

    int getAyCount();

    List<Float> getAyList();

    float getAz(int i);

    int getAzCount();

    List<Float> getAzList();

    float getGravity(int i);

    int getGravityCount();

    List<Float> getGravityList();

    float getPower();

    int getSampleRate();
}
