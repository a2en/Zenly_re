package p213co.znly.core.push;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: co.znly.core.push.TokenProvider */
public class TokenProvider {
    public static native void onTokenReceived(String str);

    public static void refreshToken(Context context) {
        FirebaseInstanceId.getInstance().getInstanceId().mo29301a((OnSuccessListener<? super TResult>) C6588a.f16173a);
    }
}
