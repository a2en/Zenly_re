package p213co.znly.core.push;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.InstanceIdResult;

/* renamed from: co.znly.core.push.a */
/* compiled from: lambda */
public final /* synthetic */ class C6588a implements OnSuccessListener {

    /* renamed from: a */
    public static final /* synthetic */ C6588a f16173a = new C6588a();

    private /* synthetic */ C6588a() {
    }

    public final void onSuccess(Object obj) {
        TokenProvider.onTokenReceived(((InstanceIdResult) obj).getToken());
    }
}
