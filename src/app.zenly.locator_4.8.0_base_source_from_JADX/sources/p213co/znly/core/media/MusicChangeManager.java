package p213co.znly.core.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: co.znly.core.media.MusicChangeManager */
public class MusicChangeManager {
    private final Context context;
    String[] musicFilters = {"com.android.music.metachanged", "com.htc.music.metachanged", "fm.last.android.metachanged", "com.sec.android.app.music.metachanged", "com.nullsoft.winamp.metachanged", "com.amazon.mp3.metachanged", "com.miui.player.metachanged", "com.real.IMP.metachanged", "com.sonyericsson.music.metachanged", "com.rdio.android.metachanged", "com.samsung.sec.android.MusicPlayer.metachanged", "com.spotify.music.metadatachanged"};
    private final BroadcastReceiver musicReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("artist");
            String stringExtra2 = intent.getStringExtra("album");
            String stringExtra3 = intent.getStringExtra("track");
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            if (stringExtra2 == null) {
                stringExtra2 = str;
            }
            if (stringExtra3 == null) {
                stringExtra3 = str;
            }
            MusicChangeManager.this.onMusicChanged(stringExtra, stringExtra2, stringExtra3);
        }
    };

    public MusicChangeManager(Context context2) {
        this.context = context2;
    }

    /* access modifiers changed from: private */
    public void onMusicChanged(String str, String str2, String str3) {
        _onMusicChanged(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    public native void _onMusicChanged(String str, String str2, String str3);

    public void removeUpdates() {
        this.context.unregisterReceiver(this.musicReceiver);
    }

    public void requestUpdates() {
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : this.musicFilters) {
            intentFilter.addAction(addAction);
        }
        Intent registerReceiver = this.context.registerReceiver(this.musicReceiver, intentFilter);
        StringBuilder sb = new StringBuilder();
        sb.append("Intent start ");
        sb.append(registerReceiver);
        Log.d("sensors/sound", sb.toString());
    }
}
