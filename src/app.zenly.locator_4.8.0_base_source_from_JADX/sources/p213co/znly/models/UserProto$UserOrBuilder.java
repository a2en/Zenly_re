package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User.C6926b;

/* renamed from: co.znly.models.UserProto$UserOrBuilder */
public interface UserProto$UserOrBuilder extends MessageLiteOrBuilder {
    String getAvatarUrlPrefix();

    ByteString getAvatarUrlPrefixBytes();

    int getAvatarVersion();

    Timestamp getBirthdate();

    C6947a3 getBlockRelationship();

    int getBlockRelationshipValue();

    Timestamp getCreatedAt();

    UserProto$DisabledNotifications getDisabledNotifications();

    C6960b3 getDistanceUnits();

    int getDistanceUnitsValue();

    String getEmail();

    ByteString getEmailBytes();

    C6926b getEvents();

    Timestamp getFirstFriendAt();

    int getFriendsCount();

    C7278d3 getIdCardStyle();

    int getIdCardStyleValue();

    C7288e3 getMapDisplayOptions();

    int getMapDisplayOptionsValue();

    String getName();

    ByteString getNameBytes();

    int getNetworkMcc();

    int getNetworkMnc();

    boolean getOptOutSuggest();

    String getPassword();

    ByteString getPasswordBytes();

    int getPhoneCountryCode();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    boolean getPointsOfInterestDisabled();

    boolean getPrivateMode();

    String getRoles(int i);

    ByteString getRolesBytes(int i);

    int getRolesCount();

    List<String> getRolesList();

    boolean getShowSkiMaps();

    int getSimMcc();

    int getSimMnc();

    Timestamp getSuspendedAt();

    String getTimezone();

    ByteString getTimezoneBytes();

    Timestamp getUpdatedAt();

    String getUsername();

    ByteString getUsernameBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean getVoip();

    boolean hasBirthdate();

    boolean hasCreatedAt();

    boolean hasDisabledNotifications();

    boolean hasEvents();

    boolean hasFirstFriendAt();

    boolean hasSuspendedAt();

    boolean hasUpdatedAt();
}
