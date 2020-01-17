package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.PingProto$Ping2;

/* renamed from: co.znly.models.services.ZenlyProto$PingNextResponseOrBuilder */
public interface ZenlyProto$PingNextResponseOrBuilder extends MessageLiteOrBuilder {
    String getCursor();

    ByteString getCursorBytes();

    PingProto$Ping2 getPings(int i);

    int getPingsCount();

    List<PingProto$Ping2> getPingsList();

    String getTip();

    ByteString getTipBytes();
}
