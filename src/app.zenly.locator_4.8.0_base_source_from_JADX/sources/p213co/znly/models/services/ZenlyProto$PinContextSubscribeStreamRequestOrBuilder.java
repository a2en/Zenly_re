package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7272d0;

/* renamed from: co.znly.models.services.ZenlyProto$PinContextSubscribeStreamRequestOrBuilder */
public interface ZenlyProto$PinContextSubscribeStreamRequestOrBuilder extends MessageLiteOrBuilder {
    C8018c6 getMode();

    int getModeValue();

    String getSelectedUserUuids(int i);

    ByteString getSelectedUserUuidsBytes(int i);

    int getSelectedUserUuidsCount();

    List<String> getSelectedUserUuidsList();

    C7272d0 getViewport();

    boolean hasViewport();
}
