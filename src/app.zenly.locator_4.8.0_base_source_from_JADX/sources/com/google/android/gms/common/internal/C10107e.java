package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C10076g;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.p309i.C10079b;
import com.google.android.gms.common.util.C10170g;
import p214e.p228e.C7584g;
import p333g.p357d.p358a.p359a.p360a.C12065b;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C10107e {

    /* renamed from: a */
    private static final C7584g<String, String> f26603a = new C7584g<>();

    /* renamed from: a */
    public static String m25447a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C12065b.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C12065b.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C12065b.common_google_play_services_enable_button);
    }

    /* renamed from: b */
    public static String m25451b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m25446a(context);
        if (i == 1) {
            return resources.getString(C12065b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C12065b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m25449a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m25449a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C12065b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m25449a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m25449a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m25449a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C12065b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C10076g.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C10170g.m25668c(context)) {
            return resources.getString(C12065b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C12065b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: c */
    public static String m25452c(Context context, int i) {
        if (i != 6 && i != 19) {
            return m25451b(context, i);
        }
        return m25449a(context, "common_google_play_services_resolution_required_text", m25446a(context));
    }

    /* renamed from: d */
    public static String m25453d(Context context, int i) {
        String str;
        if (i == 6) {
            str = m25448a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m25454e(context, i);
        }
        return str == null ? context.getResources().getString(C12065b.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: e */
    public static String m25454e(Context context, int i) {
        Resources resources = context.getResources();
        String str = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(C12065b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C12065b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C12065b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str, "An invalid account was specified when connecting. Please provide a valid account.");
                return m25448a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str, "Network error occurred. Please retry request later.");
                return m25448a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e(str, "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e(str, "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e(str, "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e(str, "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e(str, "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e(str, "The specified account could not be signed in.");
                return m25448a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str, "The current user profile is restricted and could not use authenticated features.");
                return m25448a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e(str, sb.toString());
                return null;
        }
    }

    /* renamed from: a */
    public static String m25446a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C10079b.m25337a(context).mo27334b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m25449a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m25448a(context, str);
        if (a == null) {
            a = resources.getString(C10076g.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: a */
    private static String m25448a(Context context, String str) {
        synchronized (f26603a) {
            String str2 = (String) f26603a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                String valueOf = String.valueOf(str);
                Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String str5 = "GoogleApiAvailability";
                String str6 = "Got empty resource: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
                return null;
            }
            f26603a.put(str, string);
            return string;
        }
    }

    /* renamed from: b */
    public static String m25450b(Context context) {
        return context.getResources().getString(C12065b.common_google_play_services_notification_channel_name);
    }
}
