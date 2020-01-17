package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7482u1;

/* renamed from: co.znly.models.services.ZenlyProto$PingGetResponseOrBuilder */
public interface ZenlyProto$PingGetResponseOrBuilder extends MessageLiteOrBuilder {
    C7482u1 getPings(int i);

    int getPingsCount();

    List<C7482u1> getPingsList();
}
