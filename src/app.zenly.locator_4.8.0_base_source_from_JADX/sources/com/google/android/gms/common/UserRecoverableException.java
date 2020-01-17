package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {
    public UserRecoverableException(String str, Intent intent) {
        super(str);
    }
}
