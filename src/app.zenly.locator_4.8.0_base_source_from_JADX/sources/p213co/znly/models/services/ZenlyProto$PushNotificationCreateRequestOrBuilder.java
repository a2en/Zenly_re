package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$PushNotificationCreateRequestOrBuilder */
public interface ZenlyProto$PushNotificationCreateRequestOrBuilder extends MessageLiteOrBuilder {
    String getBody();

    ByteString getBodyBytes();

    String getDeprecatedTargetUserUuid();

    ByteString getDeprecatedTargetUserUuidBytes();

    String getTargetsUserUuid(int i);

    ByteString getTargetsUserUuidBytes(int i);

    int getTargetsUserUuidCount();

    List<String> getTargetsUserUuidList();

    String getTitle();

    ByteString getTitleBytes();
}
