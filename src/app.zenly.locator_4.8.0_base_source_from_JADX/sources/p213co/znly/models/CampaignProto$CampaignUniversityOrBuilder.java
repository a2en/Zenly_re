package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.CampaignProto$CampaignUniversityOrBuilder */
public interface CampaignProto$CampaignUniversityOrBuilder extends MessageLiteOrBuilder {
    Timestamp getChallengeEnd();

    Timestamp getChallengeFinish();

    Timestamp getChallengeLaunch();

    Timestamp getChallengeStart();

    String getFraternities(int i);

    ByteString getFraternitiesBytes(int i);

    int getFraternitiesCount();

    List<String> getFraternitiesList();

    String getGeofence();

    ByteString getGeofenceBytes();

    String getName();

    ByteString getNameBytes();

    int getNbRequiredMembers();

    String getSororities(int i);

    ByteString getSororitiesBytes(int i);

    int getSororitiesCount();

    List<String> getSororitiesList();

    String getUniversityUuid();

    ByteString getUniversityUuidBytes();

    boolean hasChallengeEnd();

    boolean hasChallengeFinish();

    boolean hasChallengeLaunch();

    boolean hasChallengeStart();
}
