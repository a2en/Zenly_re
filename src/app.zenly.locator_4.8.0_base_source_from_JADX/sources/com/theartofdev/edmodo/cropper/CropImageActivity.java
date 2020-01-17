package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.C0540a;
import com.theartofdev.edmodo.cropper.CropImage.ActivityResult;
import com.theartofdev.edmodo.cropper.CropImageView.C11923b;
import com.theartofdev.edmodo.cropper.CropImageView.OnCropImageCompleteListener;
import com.theartofdev.edmodo.cropper.CropImageView.OnSetImageUriCompleteListener;
import java.io.File;
import java.io.IOException;

public class CropImageActivity extends AppCompatActivity implements OnSetImageUriCompleteListener, OnCropImageCompleteListener {

    /* renamed from: e */
    private CropImageView f30893e;

    /* renamed from: f */
    private Uri f30894f;

    /* renamed from: g */
    private CropImageOptions f30895g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35319a() {
        if (this.f30895g.f30911P) {
            mo35322b(null, null, 1);
            return;
        }
        Uri b = mo35321b();
        CropImageView cropImageView = this.f30893e;
        CropImageOptions cropImageOptions = this.f30895g;
        cropImageView.mo35337a(b, cropImageOptions.f30906K, cropImageOptions.f30907L, cropImageOptions.f30908M, cropImageOptions.f30909N, cropImageOptions.f30910O);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Uri mo35321b() {
        Uri uri = this.f30895g.f30905J;
        if (uri != null && !uri.equals(Uri.EMPTY)) {
            return uri;
        }
        try {
            String str = this.f30895g.f30906K == CompressFormat.JPEG ? ".jpg" : this.f30895g.f30906K == CompressFormat.PNG ? ".png" : ".webp";
            return Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp file for output image", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo35323c() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200) {
            if (i2 == 0) {
                mo35323c();
            }
            if (i2 == -1) {
                this.f30894f = CropImage.m31283a((Context) this, intent);
                if (CropImage.m31287a((Context) this, this.f30894f)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f30893e.setImageUriAsync(this.f30894f);
                }
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo35323c();
    }

    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView(C11943h.crop_image_activity);
        this.f30893e = (CropImageView) findViewById(C11942g.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f30894f = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.f30895g = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.f30894f;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (CropImage.m31291c(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    CropImage.m31286a((Activity) this);
                }
            } else if (CropImage.m31287a((Context) this, this.f30894f)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.f30893e.setImageUriAsync(this.f30894f);
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions = this.f30895g;
            if (cropImageOptions != null) {
                CharSequence charSequence2 = cropImageOptions.f30903H;
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = this.f30895g.f30903H;
                    supportActionBar.mo295a(charSequence);
                    supportActionBar.mo304c(true);
                }
            }
            charSequence = getResources().getString(C11945j.crop_image_activity_title);
            supportActionBar.mo295a(charSequence);
            supportActionBar.mo304c(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C11944i.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f30895g;
        if (!cropImageOptions.f30914S) {
            menu.removeItem(C11942g.crop_image_menu_rotate_left);
            menu.removeItem(C11942g.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f30916U) {
            menu.findItem(C11942g.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f30895g.f30915T) {
            menu.removeItem(C11942g.crop_image_menu_flip);
        }
        if (this.f30895g.f30920Y != null) {
            menu.findItem(C11942g.crop_image_menu_crop).setTitle(this.f30895g.f30920Y);
        }
        Drawable drawable = null;
        try {
            if (this.f30895g.f30921Z != 0) {
                drawable = C0540a.m2546c(this, this.f30895g.f30921Z);
                menu.findItem(C11942g.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e) {
            Log.w("AIC", "Failed to read menu crop drawable", e);
        }
        int i = this.f30895g.f30904I;
        if (i != 0) {
            m31292a(menu, C11942g.crop_image_menu_rotate_left, i);
            m31292a(menu, C11942g.crop_image_menu_rotate_right, this.f30895g.f30904I);
            m31292a(menu, C11942g.crop_image_menu_flip, this.f30895g.f30904I);
            if (drawable != null) {
                m31292a(menu, C11942g.crop_image_menu_crop, this.f30895g.f30904I);
            }
        }
        return true;
    }

    public void onCropImageComplete(CropImageView cropImageView, C11923b bVar) {
        mo35322b(bVar.mo35394g(), bVar.mo35390c(), bVar.mo35393f());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C11942g.crop_image_menu_crop) {
            mo35319a();
            return true;
        } else if (menuItem.getItemId() == C11942g.crop_image_menu_rotate_left) {
            mo35320a(-this.f30895g.f30917V);
            return true;
        } else if (menuItem.getItemId() == C11942g.crop_image_menu_rotate_right) {
            mo35320a(this.f30895g.f30917V);
            return true;
        } else if (menuItem.getItemId() == C11942g.crop_image_menu_flip_horizontally) {
            this.f30893e.mo35332a();
            return true;
        } else if (menuItem.getItemId() == C11942g.crop_image_menu_flip_vertically) {
            this.f30893e.mo35340b();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            mo35323c();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 201) {
            Uri uri = this.f30894f;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, C11945j.crop_image_activity_no_permissions, 1).show();
                mo35323c();
            } else {
                this.f30893e.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            CropImage.m31286a((Activity) this);
        }
    }

    public void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exc) {
        if (exc == null) {
            Rect rect = this.f30895g.f30912Q;
            if (rect != null) {
                this.f30893e.setCropRect(rect);
            }
            int i = this.f30895g.f30913R;
            if (i > -1) {
                this.f30893e.setRotatedDegrees(i);
                return;
            }
            return;
        }
        mo35322b(null, exc, 1);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f30893e.setOnSetImageUriCompleteListener(this);
        this.f30893e.setOnCropImageCompleteListener(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f30893e.setOnSetImageUriCompleteListener(null);
        this.f30893e.setOnCropImageCompleteListener(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35320a(int i) {
        this.f30893e.mo35333a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo35318a(Uri uri, Exception exc, int i) {
        ActivityResult activityResult = new ActivityResult(this.f30893e.getImageUri(), uri, exc, this.f30893e.getCropPoints(), this.f30893e.getCropRect(), this.f30893e.getRotatedDegrees(), this.f30893e.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35322b(Uri uri, Exception exc, int i) {
        setResult(exc == null ? -1 : 204, mo35318a(uri, exc, i));
        finish();
    }

    /* renamed from: a */
    private void m31292a(Menu menu, int i, int i2) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            Drawable icon = findItem.getIcon();
            if (icon != null) {
                try {
                    icon.mutate();
                    icon.setColorFilter(i2, Mode.SRC_ATOP);
                    findItem.setIcon(icon);
                } catch (Exception e) {
                    Log.w("AIC", "Failed to update menu item color", e);
                }
            }
        }
    }
}
