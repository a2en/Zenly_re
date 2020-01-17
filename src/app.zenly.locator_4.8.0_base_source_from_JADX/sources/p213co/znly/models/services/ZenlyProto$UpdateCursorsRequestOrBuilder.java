package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$UpdateCursorsRequestOrBuilder */
public interface ZenlyProto$UpdateCursorsRequestOrBuilder extends MessageLiteOrBuilder {
    String getCursors(int i);

    ByteString getCursorsBytes(int i);

    int getCursorsCount();

    List<String> getCursorsList();

    String getTargetUuids(int i);

    ByteString getTargetUuidsBytes(int i);

    int getTargetUuidsCount();

    List<String> getTargetUuidsList();

    C8113i5 getTypes(int i);

    int getTypesCount();

    List<C8113i5> getTypesList();

    int getTypesValue(int i);

    List<Integer> getTypesValueList();
}
