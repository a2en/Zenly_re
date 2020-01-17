package com.google.android.libraries.places.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.C10720R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzea.zza;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

public final class zzdn implements zzdj {
    public final zzfm zza;
    private final AppCompatActivity zzb;
    private final Intent zzc;
    private final zzfn zzd;
    private final zzes zze;
    private Handler zzf;
    private EditText zzg;
    private RecyclerView zzh;
    private View zzi;
    private View zzj;
    private TextView zzk;
    private ImageButton zzl;
    private Button zzm;
    private final boolean zzn;
    /* access modifiers changed from: private */
    public final zzea zzo;
    private boolean zzp;
    private boolean zzq;
    private TextWatcher zzr = new zzdw(this);

    public zzdn(AppCompatActivity appCompatActivity, Bundle bundle, zzes zzes, zzfn zzfn, zzb zzb2) {
        String str = "session";
        String str2 = "adapterState";
        String str3 = "activityState";
        try {
            this.zzb = appCompatActivity;
            this.zzc = appCompatActivity.getIntent();
            this.zze = zzes;
            this.zzd = zzfn;
            if (bundle == null || !bundle.containsKey(str3) || !bundle.containsKey(str2) || !bundle.containsKey(str)) {
                this.zzn = false;
                this.zzo = new zzea(zza.NO_ERROR, null, null, false);
                AutocompleteActivityMode autocompleteActivityMode = (AutocompleteActivityMode) this.zzc.getSerializableExtra("mode");
                zzdf zzdf = (zzdf) this.zzc.getSerializableExtra("origin");
                String stringExtra = this.zzc.getStringExtra("initial_query");
                zzgg.zza(autocompleteActivityMode, (Object) "Activity Mode must be present in the launch intent.");
                zzgg.zza(zzdf, (Object) "Origin must be present in the launch intent.");
                this.zza = new zzfm(zzdf, autocompleteActivityMode, stringExtra, zzb2);
            } else {
                this.zzn = true;
                this.zzo = (zzea) bundle.getParcelable(str3);
                zzes.zza((zzel) bundle.getParcelable(str2));
                this.zza = (zzfm) bundle.getParcelable(str);
            }
            this.zzf = new Handler(Looper.getMainLooper());
            int i = zzeb.zza[this.zza.zzb().ordinal()];
            if (i == 1) {
                return;
            }
            if (i == 2) {
                appCompatActivity.setTheme(C10720R.C10723style.PlacesAutocompleteThemeFullscreen);
            }
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final void zza(zzea zzea) {
        zzc(zzea);
        this.zzi.setVisibility(0);
        this.zzk.setText(zzea.zzd());
        this.zzh.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void zzi() {
        zzei zzei = (zzei) this.zze.getFilter();
        String obj = this.zzg.getText().toString();
        zzei.publishResults(obj, zzei.performFiltering(obj));
    }

    /* access modifiers changed from: private */
    public final void zzj() {
        if (this.zzg.getText().toString().isEmpty()) {
            this.zzl.setVisibility(4);
        } else {
            this.zzl.setVisibility(0);
        }
    }

    private final void zzk() {
        this.zzp = true;
        this.zza.zzp();
        zza(0, (Place) null, new Status(16));
    }

    public final void zza() {
        ComponentName callingActivity = this.zzb.getCallingActivity();
        int i = 0;
        String str = "Places";
        if (!((callingActivity == null || callingActivity.getPackageName() == null) ? false : true)) {
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "Cannot find caller. Did you forget to use startActivityForResult?");
            }
            this.zzb.finish();
        } else if (this.zze.zzc().equals(zzel.zzf)) {
            zzel zzel = zzel.zzf;
            zza(2, zzel.zze, zzel.zzb);
        } else {
            AutocompleteActivityMode zzb2 = this.zza.zzb();
            int i2 = zzeb.zza[zzb2.ordinal()];
            if (i2 == 1) {
                this.zzb.setContentView(C10720R.layout.places_autocomplete_main_overlay);
                this.zzb.findViewById(C10720R.C10722id.places_autocomplete_back_button).setOnClickListener(new zzdm(this));
                View findViewById = this.zzb.findViewById(C10720R.C10722id.places_autocomplete_overlay_root);
                this.zzb.findViewById(C10720R.C10722id.places_autocomplete_overlay_content).setOnTouchListener(zzdp.zza);
                findViewById.setOnTouchListener(new zzdo(this));
            } else if (i2 == 2) {
                this.zzb.setContentView(C10720R.layout.places_autocomplete_main_fullscreen);
                Toolbar toolbar = (Toolbar) this.zzb.findViewById(C10720R.C10722id.places_autocomplete_action_bar);
                this.zzb.findViewById(C10720R.C10722id.places_autocomplete_back_button).setVisibility(8);
                toolbar.setNavigationIcon(C10720R.C10721drawable.quantum_ic_arrow_back_grey600_24);
                this.zzb.setSupportActionBar(toolbar);
                toolbar.setNavigationOnClickListener(new zzdr(this));
                this.zzb.getWindow().setSoftInputMode(16);
            }
            this.zzg = (EditText) this.zzb.findViewById(C10720R.C10722id.places_autocomplete_edit_text);
            this.zzh = (RecyclerView) this.zzb.findViewById(C10720R.C10722id.places_autocomplete_list);
            this.zzi = this.zzb.findViewById(C10720R.C10722id.places_autocomplete_error);
            this.zzj = this.zzb.findViewById(C10720R.C10722id.places_autocomplete_error_progress);
            this.zzk = (TextView) this.zzb.findViewById(C10720R.C10722id.places_autocomplete_error_message);
            this.zzl = (ImageButton) this.zzb.findViewById(C10720R.C10722id.places_autocomplete_clear_button);
            this.zzm = (Button) this.zzb.findViewById(C10720R.C10722id.places_autocomplete_try_again);
            this.zze.zza(this.zza.zzo());
            this.zze.zza((zzem) new zzdq(this));
            this.zze.zza((PlaceSelectionListener) new zzdz(this));
            this.zzh.setLayoutManager(new LinearLayoutManager(this.zzb, 1, false));
            if (VERSION.SDK_INT >= 16) {
                this.zzh.setItemAnimator(new zzew(this.zzb.getResources()));
            }
            this.zzh.mo5047a((C1076n) new zzdy(this));
            if (!this.zzn) {
                this.zzo.zza((CharSequence) this.zza.zzj());
            }
            this.zzg.setSaveEnabled(false);
            this.zzg.requestFocus();
            this.zzg.addTextChangedListener(this.zzr);
            String stringExtra = this.zzc.getStringExtra("hint");
            if (stringExtra != null) {
                this.zzg.setHint(stringExtra);
            }
            this.zzg.setOnEditorActionListener(new zzdt(this));
            this.zzl.setOnClickListener(new zzds(this));
            this.zzi.setOnClickListener(new zzdv(this));
            this.zzm.setOnClickListener(new zzdu(this));
            this.zzh.setAdapter(this.zze);
            int i3 = zzeb.zza[zzb2.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    int intExtra = this.zzc.getIntExtra("primary_color", 0);
                    int intExtra2 = this.zzc.getIntExtra("primary_color_dark", 0);
                    if (Color.alpha(intExtra) < 255) {
                        intExtra = 0;
                    }
                    if (!(intExtra == 0 || intExtra2 == 0)) {
                        int zza2 = zzfe.zza(intExtra, this.zzb.getResources().getColor(C10720R.color.places_text_white_alpha_87), this.zzb.getResources().getColor(C10720R.color.places_text_black_alpha_87));
                        int zza3 = zzfe.zza(intExtra, this.zzb.getResources().getColor(C10720R.color.places_text_white_alpha_26), this.zzb.getResources().getColor(C10720R.color.places_text_black_alpha_26));
                        zzfb.zza(this.zzb, intExtra, intExtra2, zza2);
                        this.zzg.setTextColor(zza2);
                        this.zzg.setHintTextColor(zza3);
                        Drawable drawable = this.zzl.getDrawable();
                        zzfb.zza(drawable, zza2);
                        this.zzl.setImageDrawable(drawable);
                    }
                }
            } else if (VERSION.SDK_INT >= 19) {
                this.zzb.getWindow().addFlags(67108864);
                View findViewById2 = this.zzb.findViewById(C10720R.C10722id.places_autocomplete_overlay_root);
                int paddingLeft = findViewById2.getPaddingLeft();
                int paddingTop = findViewById2.getPaddingTop();
                Resources resources = this.zzb.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = resources.getDimensionPixelSize(identifier);
                }
                findViewById2.setPadding(paddingLeft, paddingTop + i, findViewById2.getPaddingRight(), findViewById2.getPaddingBottom());
            }
            if (this.zzn) {
                zzel zzc2 = this.zze.zzc();
                zzea zzea = this.zzo;
                zzea.zza(true);
                zza(zzc2, zzea);
                switch (zzc2.zza) {
                    case -1:
                    case 1:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                        break;
                    case 2:
                        zzi();
                        break;
                    case 5:
                        this.zze.zza();
                        return;
                    default:
                        if (Log.isLoggable(str, 6)) {
                            Log.e(str, "Unknown AutocompleteAdapter state change.");
                            break;
                        }
                        break;
                }
                return;
            }
            zza(this.zze.zzc(), this.zzo);
            zzi();
        }
    }

    public final void zzb() {
    }

    public final void zzc() {
        this.zza.zzw();
    }

    public final void zzd() {
        zzk();
    }

    public final void zze() {
        this.zza.zzx();
    }

    public final void zzf() {
    }

    public final void zzg() {
        if (this.zzb.isFinishing()) {
            if (!this.zzp && !this.zzq) {
                this.zza.zzq();
            }
            this.zzd.zza(this.zza);
        }
        this.zze.zzb();
    }

    public final void zzh() {
        this.zza.zzv();
        zzfd.zza(this.zzb, this.zzg);
    }

    private final void zzc(zzea zzea) {
        zza zza2 = zzea.zza();
        int i = 0;
        this.zzj.setVisibility(zza2 == zza.SHOW_ERROR_WHILE_LOADING ? 0 : 8);
        Button button = this.zzm;
        if (zza2 != zza.SHOW_ERROR_CAN_RETRY_NOT_LOADING) {
            i = 8;
        }
        button.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zzd(View view) {
        try {
            zzk();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zze(View view) {
        try {
            zzk();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zzb(View view) {
        try {
            zzfd.zza(this.zzb, this.zzg);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zzc(View view) {
        try {
            this.zza.zzu();
            this.zzg.setText("");
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    private final void zza(zzel zzel, zzea zzea) {
        String obj = this.zzg.getText().toString();
        String zzc2 = zzea.zzc();
        if (!obj.equals(zzc2)) {
            this.zzg.removeTextChangedListener(this.zzr);
            this.zzg.setText(zzc2);
            EditText editText = this.zzg;
            editText.setSelection(editText.getText().length());
            this.zzg.addTextChangedListener(this.zzr);
            zzj();
        }
        this.zzf.removeCallbacksAndMessages(null);
        if (zzea.zzb()) {
            if (zzea.zza() == zza.SHOW_ERROR_WHILE_LOADING) {
                zzc(zzea);
            }
            if (zzea.zze()) {
                zza(zzea);
            } else {
                this.zzf.postDelayed(new zzdx(this, zzea), 2000);
            }
        } else {
            this.zzj.setVisibility(8);
            this.zzm.setVisibility(8);
            this.zzi.setVisibility(8);
            this.zzk.setText(null);
            this.zzh.setVisibility(0);
        }
        zzea.zza(false);
        if (zzel.zza == 5) {
            zzfd.zza(this.zzb, this.zzg);
        }
    }

    public final void zza(Bundle bundle) {
        bundle.putParcelable("session", this.zza);
        bundle.putParcelable("adapterState", this.zze.zzc());
        bundle.putParcelable("activityState", this.zzo);
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(bundle);
        int length = obtain.marshall().length;
        if (length > 409600) {
            Log.e("Places", String.format("onSaveInstanceState: skipping saving state, it's too large (%d bytes, max is %dKB).", new Object[]{Integer.valueOf(length), Integer.valueOf(400)}));
            bundle.clear();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(Place place) {
        zza(-1, place, new Status(0));
        this.zzq = true;
    }

    /* access modifiers changed from: private */
    public final void zza(int i, Place place, Status status) {
        Intent intent = new Intent();
        if (place != null) {
            intent.putExtra("selected_place", place);
        }
        intent.putExtra("status", status);
        this.zzb.setResult(i, intent);
        this.zzb.supportFinishAfterTransition();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(View view) {
        try {
            zzi();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean zza(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        try {
            zzfd.zza(this.zzb, this.zzg);
            return true;
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(zzel zzel) {
        AutocompletePrediction autocompletePrediction;
        String str = "Places";
        try {
            zzea zzea = this.zzo;
            switch (zzel.zza) {
                case 1:
                case 7:
                    zzea.zza((String) null);
                    zzea.zza(zza.NO_ERROR);
                    break;
                case 2:
                    if (zzea.zza() != zza.SHOW_ERROR_CAN_RETRY_NOT_LOADING) {
                        zzea.zza(zza.NO_ERROR);
                        break;
                    } else {
                        zzea.zza(zza.SHOW_ERROR_WHILE_LOADING);
                        break;
                    }
                case 3:
                    this.zza.zzs();
                    zzea.zza(this.zzb.getString(C10720R.string.places_search_error));
                    zzea.zza(zza.SHOW_ERROR_CAN_RETRY_NOT_LOADING);
                    break;
                case 4:
                    this.zza.zzr();
                    if (!zzel.zzc.isEmpty()) {
                        zzea.zza((String) null);
                        zzea.zza(zza.NO_ERROR);
                        break;
                    } else {
                        String zzc2 = zzea.zzc();
                        zzea.zza(this.zzb.getString(C10720R.string.places_autocomplete_no_results_for_query, new Object[]{zzc2}));
                        zzea.zza(zza.SHOW_ERROR_CANNOT_RETRY_NOT_LOADING);
                        break;
                    }
                case 5:
                    zzel zzc3 = this.zze.zzc();
                    if (!zzc3.zza()) {
                        autocompletePrediction = null;
                    } else {
                        autocompletePrediction = (AutocompletePrediction) zzc3.zzc.get(zzc3.zzd);
                    }
                    if (autocompletePrediction != null) {
                        if (zzea.zzb()) {
                            zzea.zza(zza.SHOW_ERROR_WHILE_LOADING);
                        }
                        zzea.zza((CharSequence) autocompletePrediction.getPrimaryText(null));
                        this.zza.zza(zzel.zzd);
                        break;
                    }
                    break;
                case 6:
                    this.zza.zzt();
                    zzea.zza(this.zzb.getString(C10720R.string.places_search_error));
                    zzea.zza(zza.SHOW_ERROR_CAN_RETRY_NOT_LOADING);
                    break;
                default:
                    if (Log.isLoggable(str, 6)) {
                        Log.e(str, "Unknown AutocompleteAdapter state change.");
                        break;
                    }
                    break;
            }
            zza(zzel, zzea);
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        try {
            zzk();
            return true;
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }
}
