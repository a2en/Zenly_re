package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.BrumpProto$BrumpInfoOrBuilder */
public interface BrumpProto$BrumpInfoOrBuilder extends MessageLiteOrBuilder {
    double getLatitude();

    double getLongitude();

    String getMatchId();

    ByteString getMatchIdBytes();

    float getPowerMatch();

    float getPowerUser1();

    float getPowerUser2();

    int getStreak();
}
