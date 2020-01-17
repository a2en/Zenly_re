package p213co.znly.core.sync_adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: co.znly.core.sync_adapter.ZenlyCoreSyncPrefs */
public final class ZenlyCoreSyncPrefs {
    private static final String PREFS_NAME = "CoreSyncAdapter";
    private static final String PREF_SYNCED_FIRST = "prefs:sync_adapter:synced_first";
    private static final String PREF_SYNCED_LAST = "prefs:sync_adapter:synced_last";
    private static final long TIMEOUT_SYNC_DURATION = TimeUnit.HOURS.toMillis(12);
    private static final long TIMESTAMP_SECONDS_DEFAULT_VALUE = -1;
    private final SharedPreferences mPrefs;

    private ZenlyCoreSyncPrefs(Context context) {
        this.mPrefs = context.getSharedPreferences(PREFS_NAME, 0);
    }

    public static ZenlyCoreSyncPrefs get(Context context) {
        return new ZenlyCoreSyncPrefs(context);
    }

    private long getSyncedFirst() {
        return this.mPrefs.getLong(PREF_SYNCED_FIRST, TIMESTAMP_SECONDS_DEFAULT_VALUE);
    }

    private long getSyncedLast() {
        return this.mPrefs.getLong(PREF_SYNCED_LAST, TIMESTAMP_SECONDS_DEFAULT_VALUE);
    }

    private void setSyncedFirst(long j) {
        this.mPrefs.edit().putLong(PREF_SYNCED_FIRST, j).apply();
    }

    private void setSyncedLast(long j) {
        this.mPrefs.edit().putLong(PREF_SYNCED_LAST, j).apply();
    }

    public void applySync() {
        setSyncedFirst(getSyncedLast());
        setSyncedLast(SystemClock.elapsedRealtime());
    }

    public boolean isSyncTimeout() {
        long syncedFirst = getSyncedFirst();
        long syncedLast = getSyncedLast();
        if (syncedLast < syncedFirst || syncedFirst == TIMESTAMP_SECONDS_DEFAULT_VALUE || syncedLast == TIMESTAMP_SECONDS_DEFAULT_VALUE || syncedLast - syncedFirst <= TIMEOUT_SYNC_DURATION) {
            return false;
        }
        return true;
    }
}
