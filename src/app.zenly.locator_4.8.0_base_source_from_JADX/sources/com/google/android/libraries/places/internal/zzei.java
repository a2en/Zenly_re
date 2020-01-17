package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.google.android.libraries.places.api.model.AutocompletePrediction;

public final class zzei extends Filter {
    final /* synthetic */ zzed zza;
    private Runnable zzb;

    public zzei(zzed zzed) {
        this.zza = zzed;
    }

    private static FilterResults zza(zzel zzel) {
        FilterResults filterResults = new FilterResults();
        filterResults.values = zzel;
        filterResults.count = zzel.zzc.size();
        return filterResults;
    }

    public final CharSequence convertResultToString(Object obj) {
        if (!(obj instanceof AutocompletePrediction)) {
            return super.convertResultToString(obj);
        }
        return ((AutocompletePrediction) obj).getPrimaryText(null);
    }

    /* access modifiers changed from: protected */
    public final FilterResults performFiltering(CharSequence charSequence) {
        this.zzb = null;
        if (TextUtils.isEmpty(charSequence)) {
            return zza(zzel.zzg);
        }
        this.zzb = new zzeh(this, charSequence);
        zzel zzel = new zzel(2, null, this.zza.zzh.zzc, -1, null);
        return zza(zzel);
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        this.zza.zza((zzel) filterResults.values);
        Runnable runnable = this.zzb;
        if (runnable != null) {
            runnable.run();
            this.zzb = null;
        }
    }
}
