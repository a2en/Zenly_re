package com.squareup.picasso;

import android.graphics.Bitmap;

public interface Cache {

    /* renamed from: com.squareup.picasso.Cache$a */
    static class C11840a implements Cache {
        C11840a() {
        }

        public void clear() {
        }

        public void clearKeyUri(String str) {
        }

        public Bitmap get(String str) {
            return null;
        }

        public int maxSize() {
            return 0;
        }

        public void set(String str, Bitmap bitmap) {
        }

        public int size() {
            return 0;
        }
    }

    static {
        new C11840a();
    }

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
