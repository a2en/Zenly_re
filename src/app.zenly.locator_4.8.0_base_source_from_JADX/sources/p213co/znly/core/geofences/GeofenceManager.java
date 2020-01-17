package p213co.znly.core.geofences;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.C10562b;
import com.google.android.gms.location.C10568e;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.Geofence.C10556a;
import com.google.android.gms.location.GeofencingRequest.C10557a;
import java.util.ArrayList;
import java.util.List;
import p213co.znly.core.geofences.GeofencesProto.AddGeofencesRequest;
import p213co.znly.core.geofences.GeofencesProto.AddGeofencesRequest.GeofenceBuilder;
import p213co.znly.core.geofences.GeofencesProto.GeofenceEvent;
import p213co.znly.core.geofences.GeofencesProto.RemoveGeofencesRequest;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;

/* renamed from: co.znly.core.geofences.GeofenceManager */
public class GeofenceManager {
    private static final String TAG = "geofences";
    private PendingIntent mGeofencePendingIntent;
    private C10562b mGeofencingClient;
    private String mId;

    public GeofenceManager(Context context, String str) {
        this.mId = str;
        Intent intent = new Intent(context, GeofencesBroadcastReceiver.class);
        intent.putExtra("id", this.mId);
        this.mGeofencePendingIntent = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        this.mGeofencingClient = C10568e.m27019b(context);
    }

    private static native void _onGeofenceEvent(Context context, String str, byte[] bArr);

    public static void onGeofenceEvent(Context context, String str, Geofence geofence, int i) {
        _onGeofenceEvent(context, str, ((GeofenceEvent) GeofenceEvent.newBuilder().setRequestId(geofence.getRequestId()).setTransitionValue(i).build()).toByteArray());
    }

    public boolean addGeofences(byte[] bArr) throws InvalidProtocolBufferException {
        if (this.mGeofencingClient == null) {
            return false;
        }
        AddGeofencesRequest parseFrom = AddGeofencesRequest.parseFrom(bArr);
        ArrayList arrayList = new ArrayList();
        for (GeofenceBuilder geofenceBuilder : parseFrom.getBuildersList()) {
            C10556a aVar = new C10556a();
            aVar.mo28624a(geofenceBuilder.getRequestId());
            aVar.mo28621a(geofenceBuilder.getLatitude(), geofenceBuilder.getLongitude(), geofenceBuilder.getRadius());
            aVar.mo28626b(geofenceBuilder.getNotificationResponsivenessMs());
            aVar.mo28623a((long) geofenceBuilder.getExpirationDuration());
            aVar.mo28627c(geofenceBuilder.getTransitionTypesValue());
            aVar.mo28622a(geofenceBuilder.getLoiteringDelayMs());
            arrayList.add(aVar.mo28625a());
        }
        C10557a aVar2 = new C10557a();
        aVar2.mo28633a((List<Geofence>) arrayList);
        this.mGeofencingClient.mo28689a(aVar2.mo28634a(), this.mGeofencePendingIntent);
        return true;
    }

    public boolean removeAllGeofences() {
        C10562b bVar = this.mGeofencingClient;
        if (bVar == null) {
            return false;
        }
        bVar.mo28688a(this.mGeofencePendingIntent);
        return true;
    }

    public boolean removeGeofences(byte[] bArr) throws InvalidProtocolBufferException {
        if (this.mGeofencingClient == null) {
            return false;
        }
        this.mGeofencingClient.mo28690a(RemoveGeofencesRequest.parseFrom(bArr).getRequestIdList());
        return true;
    }
}
