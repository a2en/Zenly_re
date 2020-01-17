package com.google.android.gms.security;

import android.content.Intent;

public interface ProviderInstaller$ProviderInstallListener {
    void onProviderInstallFailed(int i, Intent intent);

    void onProviderInstalled();
}
