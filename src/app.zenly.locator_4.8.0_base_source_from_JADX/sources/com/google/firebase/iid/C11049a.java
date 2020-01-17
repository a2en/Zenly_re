package com.google.firebase.iid;

import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.firebase.iid.a */
public final class C11049a {
    /* renamed from: a */
    public static KeyPair m28460a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(ItemAnimator.FLAG_MOVED);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
