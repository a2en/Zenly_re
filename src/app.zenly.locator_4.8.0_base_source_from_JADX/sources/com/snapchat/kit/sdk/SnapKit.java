package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.snapchat.kit.sdk.C11763c.C11765b;
import java.util.Arrays;

public class SnapKit {

    /* renamed from: b */
    private static SnapKit f30464b;

    /* renamed from: a */
    private final SnapKitComponent f30465a;

    private SnapKit(Context context) throws IllegalStateException {
        String[] strArr;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("com.snapchat.kit.sdk.clientId");
                String string2 = bundle.getString("com.snapchat.kit.sdk.redirectUrl", "");
                int i = bundle.getInt("com.snapchat.kit.sdk.scopes", 0);
                if (i == 0) {
                    strArr = new String[0];
                } else {
                    strArr = context.getResources().getStringArray(i);
                }
                if (!TextUtils.isEmpty(string)) {
                    C11765b a = C11763c.m30909a();
                    a.mo34615a(new C11830e(context, string, string2, Arrays.asList(strArr)));
                    this.f30465a = a.mo34614a();
                    return;
                }
                throw new IllegalStateException("client id must be set!");
            }
            throw new IllegalStateException("No metadata for the current app!");
        } catch (NameNotFoundException unused) {
            throw new IllegalStateException("Could not get metadata for current package");
        }
    }

    /* renamed from: a */
    private static synchronized SnapKit m30897a(Context context) {
        SnapKit snapKit;
        synchronized (SnapKit.class) {
            if (f30464b == null) {
                f30464b = new SnapKit(context.getApplicationContext());
            }
            snapKit = f30464b;
        }
        return snapKit;
    }

    static SnapKitComponent getComponent(Context context) {
        return m30897a(context).f30465a;
    }

    public static void start(Context context) throws IllegalStateException {
        m30897a(context);
    }

    public static void unlink(Context context) {
        getComponent(context).authTokenManager().revokeToken();
    }
}
