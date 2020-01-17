package app.zenly.locator.onboarding.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import app.zenly.locator.p143s.C5407g;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p214e.p247m.p248a.C7646a;
import p387h.p388a.C12143a;

public class SmsRetrievedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final Pattern f12637a = Pattern.compile("([0-9]{4,})");

    /* renamed from: a */
    private static String m13992a(String str) {
        Matcher matcher = f12637a.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(action)) {
            Status status = (Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            if (status.mo27059a() != 0) {
                C12143a.m32027a("SmsRetriever failed: %s", status);
                return;
            }
            String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (TextUtils.isEmpty(stringExtra)) {
                C12143a.m32030b("Verification SMS message is empty", new Object[0]);
            }
            String a = m13992a(stringExtra);
            if (a == null) {
                C12143a.m32030b("No verification code found in SMS message", new Object[0]);
            }
            C12143a.m32027a("Verification code received: %s", a);
            C5407g.m15386a(context).mo12972a(a);
            C7646a.m18632a(context).mo19786a(new Intent("app.zenly.locator.action.VERIFICATION_CODE_STORED"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown Intent action: ");
        sb.append(action);
        throw new IllegalArgumentException(sb.toString());
    }
}
