package p213co.znly.core.romutils;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.PowerManager;

/* renamed from: co.znly.core.romutils.Oppo */
final class Oppo {

    /* renamed from: co.znly.core.romutils.Oppo$AutoStart */
    static final class AutoStart {
        private AutoStart() {
        }

        static Intent newAppDetailsIntent(Context context) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT").setData(Uri.fromParts("package", context.getPackageName(), null));
        }
    }

    /* renamed from: co.znly.core.romutils.Oppo$MobileAndWifiAccess */
    static final class MobileAndWifiAccess {

        /* renamed from: co.znly.core.romutils.Oppo$MobileAndWifiAccess$OppoDataMonitorProvider */
        private interface OppoDataMonitorProvider {
            public static final Uri CONTENT_URI = new Builder().scheme("content").authority("com.coloros.datamonitorprovider.OppoDataMonitorProvider").build();

            /* renamed from: co.znly.core.romutils.Oppo$MobileAndWifiAccess$OppoDataMonitorProvider$TableTMNetworkControl */
            public interface TableTMNetworkControl {
                public static final String COLUMN_DATA_STATE = "data_state";
                public static final String COLUMN_PKG_NAME = "pkg_name";
                public static final String COLUMN_WIFI_STATE = "wifi_state";
                public static final Uri CONTENT_URI = Uri.withAppendedPath(OppoDataMonitorProvider.CONTENT_URI, NAME);
                public static final String NAME = "tm_network_control";
            }
        }

        private MobileAndWifiAccess() {
        }

        static void enableAccess(Context context) {
            ContentValues contentValues = new ContentValues();
            Integer valueOf = Integer.valueOf(1);
            contentValues.put(TableTMNetworkControl.COLUMN_WIFI_STATE, valueOf);
            contentValues.put(TableTMNetworkControl.COLUMN_DATA_STATE, valueOf);
            context.getContentResolver().update(TableTMNetworkControl.CONTENT_URI, contentValues, "pkg_name=?", new String[]{context.getPackageName()});
        }
    }

    /* renamed from: co.znly.core.romutils.Oppo$PowerAppsBgSetting */
    static final class PowerAppsBgSetting {
        private PowerAppsBgSetting() {
        }

        static boolean isDisabled(Context context) {
            return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        }

        static Intent newIntent(Context context) {
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerAppsBgSetting"));
            return component.putExtra("title", context.getPackageManager().getApplicationLabel(context.getApplicationInfo())).putExtra("pkgName", context.getPackageName());
        }
    }

    private Oppo() {
    }
}
