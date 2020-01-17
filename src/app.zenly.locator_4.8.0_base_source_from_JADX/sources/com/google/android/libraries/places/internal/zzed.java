package com.google.android.libraries.places.internal;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10691b;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.libraries.places.C10720R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import java.util.HashSet;
import java.util.Set;

public final class zzed implements OnItemClickListener, Filterable, ListAdapter {
    C10691b zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final PlacesClient zzc;
    /* access modifiers changed from: private */
    public final zzeq zzd;
    private final Set<DataSetObserver> zze = new HashSet();
    private final zzei zzf = new zzei(this);
    private boolean zzg;
    /* access modifiers changed from: private */
    public zzel zzh;
    private PlaceSelectionListener zzi;
    private zzem zzj;
    /* access modifiers changed from: private */
    public AutocompleteSessionToken zzk;

    zzed(Context context, PlacesClient placesClient, zzeq zzeq) {
        this.zzb = context;
        this.zzc = placesClient;
        this.zzd = zzeq;
        if (zzeq.zza().isEmpty()) {
            this.zzh = zzel.zzf;
        } else {
            this.zzh = zzel.zzg;
        }
    }

    /* access modifiers changed from: private */
    public final boolean zzd() {
        C10691b bVar = this.zza;
        if (bVar != null) {
            bVar.mo29322a();
        }
        return this.zzg;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        int size;
        zzel zzel = this.zzh;
        int i = zzel.zza;
        if (i == 2) {
            size = zzel.zzc.size();
        } else if (i != 4) {
            return 1;
        } else {
            size = zzel.zzc.size();
        }
        return size + 1;
    }

    public final Filter getFilter() {
        return this.zzf;
    }

    public final /* synthetic */ Object getItem(int i) {
        int i2 = this.zzh.zza;
        if ((i2 == 2 || i2 == 4) && i < this.zzh.zzc.size()) {
            return (AutocompletePrediction) this.zzh.zzc.get(i);
        }
        return null;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        int i2 = this.zzh.zza;
        if ((i2 == 2 || i2 == 4) && i < this.zzh.zzc.size()) {
            return 1;
        }
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        LayoutInflater from = LayoutInflater.from(this.zzb);
        if (itemViewType == 0) {
            if (view == null) {
                view = from.inflate(C10720R.layout.places_autocomplete_item_powered_by_google, viewGroup, false);
            }
            zza(view);
        } else if (itemViewType != 1) {
            String str = "Places";
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "Unknown view type.");
            }
        } else {
            if (view == null) {
                view = from.inflate(C10720R.layout.places_autocomplete_item_prediction, viewGroup, false);
            }
            zza(view, i);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        return getItemViewType(i) == 1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (!this.zzh.zza()) {
            zza(i, (AutocompletePrediction) getItem(i));
        }
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.zze.add(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.zze.remove(dataSetObserver);
    }

    public final void zza(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzk = autocompleteSessionToken;
    }

    public final zzel zzb() {
        return this.zzh;
    }

    /* access modifiers changed from: 0000 */
    public final void zzc() {
        this.zzg = true;
        zzd();
    }

    /* access modifiers changed from: private */
    public static Status zzb(Exception exc) {
        if (!(exc instanceof ApiException)) {
            return new Status(13, exc.getMessage());
        }
        ApiException apiException = (ApiException) exc;
        return new Status(apiException.mo27035a(), apiException.mo27036b());
    }

    public final void zza(PlaceSelectionListener placeSelectionListener) {
        this.zzi = placeSelectionListener;
    }

    public final void zza(zzem zzem) {
        this.zzj = zzem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.view.View r7) {
        /*
            r6 = this;
            com.google.android.libraries.places.internal.zzel r0 = r6.zzh
            int r1 = r0.zza
            r2 = 4
            r3 = 1
            r4 = 0
            r5 = 2
            if (r1 != r5) goto L_0x0012
            java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> r0 = r0.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0030
        L_0x0012:
            com.google.android.libraries.places.internal.zzel r0 = r6.zzh
            int r1 = r0.zza
            if (r1 != r2) goto L_0x0020
            java.util.List<com.google.android.libraries.places.api.model.AutocompletePrediction> r0 = r0.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0030
        L_0x0020:
            com.google.android.libraries.places.internal.zzel r0 = r6.zzh
            int r0 = r0.zza
            r1 = 3
            if (r0 == r1) goto L_0x0030
            r1 = 6
            if (r0 == r1) goto L_0x0030
            r1 = 5
            if (r0 != r1) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            int r1 = r6.getCount()
            if (r1 <= r3) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            int r1 = com.google.android.libraries.places.C10720R.C10722id.places_autocomplete_progress
            android.view.View r1 = r7.findViewById(r1)
            if (r0 == 0) goto L_0x0042
            r2 = 0
        L_0x0042:
            r1.setVisibility(r2)
            int r0 = com.google.android.libraries.places.C10720R.C10722id.places_autocomplete_separator
            android.view.View r7 = r7.findViewById(r0)
            if (r3 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r4 = 8
        L_0x0050:
            r7.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzed.zza(android.view.View):void");
    }

    public final void zza(View view, int i) {
        AutocompletePrediction autocompletePrediction = (AutocompletePrediction) getItem(i);
        TextView textView = (TextView) view.findViewById(C10720R.C10722id.places_autocomplete_prediction_primary_text);
        TextView textView2 = (TextView) view.findViewById(C10720R.C10722id.places_autocomplete_prediction_secondary_text);
        SpannableString primaryText = autocompletePrediction.getPrimaryText(new ForegroundColorSpan(view.getContext().getResources().getColor(C10720R.color.places_autocomplete_prediction_primary_text_highlight)));
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        textView.setText(primaryText);
        textView2.setText(secondaryText);
        View findViewById = view.findViewById(C10720R.C10722id.places_autocomplete_separator);
        if (TextUtils.isEmpty(secondaryText)) {
            textView2.setVisibility(8);
            findViewById.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        findViewById.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public final void zza() {
        if (this.zzh.zza()) {
            zzel zzel = this.zzh;
            int i = zzel.zzd;
            if (i >= 0 && i < zzel.zzc.size()) {
                zzel zzel2 = this.zzh;
                int i2 = zzel2.zzd;
                zza(i2, (AutocompletePrediction) zzel2.zzc.get(i2));
            }
        }
    }

    private final void zza(int i, AutocompletePrediction autocompletePrediction) {
        if (!zzd()) {
            this.zza = new C10691b();
            zzel zzel = new zzel(5, null, this.zzh.zzc, i, null);
            zza(zzel);
            C10693c fetchPlace = this.zzc.fetchPlace(FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), this.zzd.zza()).setSessionToken(this.zzk).setCancellationToken(this.zza.mo29323b()).build());
            fetchPlace.mo29301a((OnSuccessListener<? super TResult>) new zzeg<Object>(this));
            fetchPlace.mo29300a((OnFailureListener) new zzef(this));
        }
    }

    /* access modifiers changed from: 0000 */
    public final void zza(zzel zzel) {
        if (this.zzh != zzel.zzf) {
            this.zzh = zzel;
            int i = zzel.zza;
            if (i == 3 || i == 6) {
                String str = "Places";
                if (Log.isLoggable(str, 6)) {
                    Status status = zzel.zzb;
                    String str2 = "Error while autocompleting: ";
                    String valueOf = String.valueOf(status != null ? PlacesStatusCodes.getStatusCodeString(status.mo27059a()) : "Unknown");
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                Status status2 = zzel.zzb;
                if (status2 != null) {
                    int a = status2.mo27059a();
                    if (a == 9011 || a == 9012) {
                        PlaceSelectionListener placeSelectionListener = this.zzi;
                        if (placeSelectionListener != null) {
                            placeSelectionListener.onError(zzel.zzb);
                        }
                    }
                }
            }
            for (DataSetObserver dataSetObserver : this.zze) {
                if (!this.zzh.zzc.isEmpty()) {
                    dataSetObserver.onChanged();
                } else {
                    dataSetObserver.onInvalidated();
                }
            }
            zzem zzem = this.zzj;
            if (zzem != null) {
                zzem.zza(this.zzh);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(Exception exc) {
        this.zza = null;
        zza(zzel.zza(this.zzh, zzb(exc)));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(FetchPlaceResponse fetchPlaceResponse) {
        this.zza = null;
        zza(zzel.zza(this.zzh, fetchPlaceResponse.getPlace()));
        PlaceSelectionListener placeSelectionListener = this.zzi;
        if (placeSelectionListener != null) {
            placeSelectionListener.onPlaceSelected(this.zzh.zze);
        }
    }
}
