package com.google.android.libraries.places.internal;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1071i;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.google.android.libraries.places.C10720R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import java.util.HashMap;
import java.util.Map;

public final class zzes extends C1069g<C1085v> implements Filterable {
    /* access modifiers changed from: private */
    public final zzed zza;
    private final Map<C1071i, DataSetObserver> zzb = new HashMap();
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public int zzd;

    zzes(zzed zzed) {
        this.zza = zzed;
        setHasStableIds(true);
        this.zza.registerDataSetObserver(new zzer(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzei getFilter() {
        try {
            return (zzei) this.zza.getFilter();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final int getItemCount() {
        try {
            return this.zza.getCount();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final long getItemId(int i) {
        try {
            if (this.zza.getItemViewType(i) != 1) {
                return -1;
            }
            return (long) ((AutocompletePrediction) this.zza.getItem(i)).getPlaceId().hashCode();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final int getItemViewType(int i) {
        try {
            return this.zza.getItemViewType(i);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void onBindViewHolder(C1085v vVar, int i) {
        try {
            int itemViewType = this.zza.getItemViewType(i);
            if (itemViewType != 0) {
                boolean z = true;
                if (itemViewType == 1) {
                    if (this.zzc != 0 || this.zzd <= 0) {
                        z = false;
                    }
                    ((zzex) vVar).zza(this.zza, i, z);
                }
            } else {
                this.zza.zza(((zzey) vVar).itemView);
            }
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final C1085v onCreateViewHolder(ViewGroup viewGroup, int i) {
        try {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                return new zzey(from.inflate(C10720R.layout.places_autocomplete_item_powered_by_google, viewGroup, false));
            }
            if (i == 1) {
                return new zzex(from.inflate(C10720R.layout.places_autocomplete_item_prediction, viewGroup, false));
            }
            throw new IllegalStateException();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void registerAdapterDataObserver(C1071i iVar) {
        try {
            super.registerAdapterDataObserver(iVar);
            zzeu zzeu = new zzeu(this, iVar);
            this.zza.registerDataSetObserver(zzeu);
            this.zzb.put(iVar, zzeu);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void unregisterAdapterDataObserver(C1071i iVar) {
        try {
            super.unregisterAdapterDataObserver(iVar);
            if (this.zzb.containsKey(iVar)) {
                this.zza.unregisterDataSetObserver((DataSetObserver) this.zzb.get(iVar));
                this.zzb.remove(iVar);
            }
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void zza() {
        this.zza.zza();
    }

    /* access modifiers changed from: 0000 */
    public final void zzb() {
        this.zza.zzc();
    }

    public final zzel zzc() {
        return this.zza.zzb();
    }

    public final void zza(zzel zzel) {
        this.zza.zza(zzel);
    }

    public final void zza(zzem zzem) {
        this.zza.zza(zzem);
    }

    public final void zza(PlaceSelectionListener placeSelectionListener) {
        this.zza.zza(placeSelectionListener);
    }

    public final void zza(AutocompleteSessionToken autocompleteSessionToken) {
        this.zza.zza(autocompleteSessionToken);
    }
}
