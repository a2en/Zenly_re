package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class zzcs {
    public static String zza(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length == 0)) {
                if (packageInfo.signatures[0] != null) {
                    return zza(packageInfo.signatures[0]);
                }
            }
            return null;
        } catch (NameNotFoundException e) {
            String str2 = "Unable to get certificate fingerprint for package: ";
            String valueOf = String.valueOf(str);
            Log.e("CredentialsHelper", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }

    private static String zza(Signature signature) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
            return zzho.zza().zza(digest, 0, digest.length);
        } catch (NoSuchAlgorithmException e) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
            return null;
        }
    }
}
