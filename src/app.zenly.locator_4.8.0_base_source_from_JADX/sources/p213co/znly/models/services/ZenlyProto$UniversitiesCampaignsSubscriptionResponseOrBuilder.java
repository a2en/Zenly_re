package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7295f;

/* renamed from: co.znly.models.services.ZenlyProto$UniversitiesCampaignsSubscriptionResponseOrBuilder */
public interface ZenlyProto$UniversitiesCampaignsSubscriptionResponseOrBuilder extends MessageLiteOrBuilder {
    String getBestFraternity();

    ByteString getBestFraternityBytes();

    String getBestSorority();

    ByteString getBestSororityBytes();

    Timestamp getChallengeEnd();

    Timestamp getChallengeFinish();

    Timestamp getChallengeLaunch();

    Timestamp getChallengeStart();

    String getFraternities(int i);

    ByteString getFraternitiesBytes(int i);

    int getFraternitiesCount();

    List<String> getFraternitiesList();

    boolean getIsSubscribed();

    int getNbMembers();

    int getNbRequiredMembers();

    String getOrganization();

    ByteString getOrganizationBytes();

    C7295f getOrganizationType();

    int getOrganizationTypeValue();

    String getSororities(int i);

    ByteString getSororitiesBytes(int i);

    int getSororitiesCount();

    List<String> getSororitiesList();

    double getUniversityLatitude();

    double getUniversityLongitude();

    String getUniversityUuid();

    ByteString getUniversityUuidBytes();

    boolean hasChallengeEnd();

    boolean hasChallengeFinish();

    boolean hasChallengeLaunch();

    boolean hasChallengeStart();
}
