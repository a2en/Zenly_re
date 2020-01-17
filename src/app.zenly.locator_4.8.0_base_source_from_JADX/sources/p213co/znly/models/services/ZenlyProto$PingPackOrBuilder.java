package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.C8355w3.C8357b;

/* renamed from: co.znly.models.services.ZenlyProto$PingPackOrBuilder */
public interface ZenlyProto$PingPackOrBuilder extends MessageLiteOrBuilder {
    C8307u3 getEmojis(int i);

    int getEmojisCount();

    List<C8307u3> getEmojisList();

    int getMinFriendsCount();

    String getName();

    ByteString getNameBytes();

    C8357b getUnlockType();

    int getUnlockTypeValue();

    int getUnlockValue();

    String getUuid();

    ByteString getUuidBytes();
}
