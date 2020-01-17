package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.TypesProto$VOIPEventOrBuilder */
public interface TypesProto$VOIPEventOrBuilder extends MessageLiteOrBuilder {
    String getAccessToken();

    ByteString getAccessTokenBytes();

    String getDeviceToken();

    ByteString getDeviceTokenBytes();

    String getPushDataJson();

    ByteString getPushDataJsonBytes();

    String getPushToken();

    ByteString getPushTokenBytes();

    C7199q2 getType();

    int getTypeValue();
}
