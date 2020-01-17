package com.google.android.libraries.places.widget;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.internal.zzdc;
import com.google.android.libraries.places.internal.zzdj;
import com.google.android.libraries.places.internal.zzfg;
import com.google.android.libraries.places.internal.zzfj;
import com.google.android.libraries.places.internal.zzgg;

public class AutocompleteActivity extends AppCompatActivity {
    public static final int RESULT_ERROR = 2;
    private zzdj zza;

    public void onBackPressed() {
        try {
            this.zza.zzd();
            super.onBackPressed();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public void onCreate(Bundle bundle) {
        try {
            zzgg.zzb(Places.isInitialized(), (Object) "Places must be initialized.");
            zzfg zza2 = zzfj.zza(this, bundle);
            if (this.zza == null) {
                this.zza = zza2.zza();
            }
            super.onCreate(bundle);
            this.zza.zza();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            this.zza.zzg();
            super.onDestroy();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            this.zza.zze();
            super.onPause();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        try {
            super.onResume();
            this.zza.zzc();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            this.zza.zza(bundle);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        try {
            super.onStart();
            this.zza.zzb();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            this.zza.zzf();
            super.onStop();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
