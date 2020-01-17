package p213co.znly.core.sync_adapter;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import p213co.znly.core.C6357R;

/* renamed from: co.znly.core.sync_adapter.ZenlyCoreSyncAdapter */
public class ZenlyCoreSyncAdapter extends AbstractThreadedSyncAdapter {
    private static final String KEY_CORE_VERSION = "co.znly.core.version";
    private static final long SYNC_FREQUENCY_IN_SEC = 300;
    private static final String TAG = "zenlycore/sync";

    public ZenlyCoreSyncAdapter(Context context, boolean z) {
        super(context, z);
    }

    public static void createZenlyAccount(Context context) {
        String string = context.getString(C6357R.string.co_znly_core_sync_adapter_authority);
        String string2 = context.getString(C6357R.string.co_znly_core_sync_adapter_account_type);
        Account account = new Account(context.getString(C6357R.string.co_znly_core_sync_adapter_provider_label), string2);
        AccountManager accountManager = (AccountManager) context.getSystemService("account");
        if (VERSION.SDK_INT >= 22) {
            String str = KEY_CORE_VERSION;
            String str2 = "1.41.3";
            if (!str2.equals(accountManager.getUserData(account, str))) {
                for (Account removeAccountExplicitly : accountManager.getAccountsByType(string2)) {
                    accountManager.removeAccountExplicitly(removeAccountExplicitly);
                }
                accountManager.addAccountExplicitly(account, null, null);
                accountManager.setUserData(account, str, str2);
            }
        }
        ContentResolver.setIsSyncable(account, string, 1);
        ContentResolver.setSyncAutomatically(account, string, true);
        ContentResolver.addPeriodicSync(account, string, Bundle.EMPTY, SYNC_FREQUENCY_IN_SEC);
        ContentResolver.setMasterSyncAutomatically(true);
        ZenlyCoreSyncPrefs.get(context).applySync();
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        Log.d(TAG, "syncing...");
        ZenlyCoreSyncPrefs.get(getContext()).applySync();
    }

    public ZenlyCoreSyncAdapter(Context context, boolean z, boolean z2) {
        super(context, z, z2);
    }
}
