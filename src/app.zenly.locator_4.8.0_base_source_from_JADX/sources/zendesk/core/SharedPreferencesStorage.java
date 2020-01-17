package zendesk.core;

import android.content.SharedPreferences;
import com.zendesk.util.C12017g;

class SharedPreferencesStorage implements BaseStorage {
    private final Serializer serializer;
    private final SharedPreferences sharedPreferences;

    SharedPreferencesStorage(SharedPreferences sharedPreferences2, Serializer serializer2) {
        this.sharedPreferences = sharedPreferences2;
        this.serializer = serializer2;
    }

    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    public String get(String str) {
        return this.sharedPreferences.getString(str, null);
    }

    /* access modifiers changed from: 0000 */
    public long getLong(String str) {
        return this.sharedPreferences.getLong(str, 0);
    }

    public void put(String str, String str2) {
        if (C12017g.m31658b(str)) {
            this.sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public void remove(String str) {
        if (C12017g.m31658b(str)) {
            this.sharedPreferences.edit().remove(str).apply();
        }
    }

    public <E> E get(String str, Class<E> cls) {
        return this.serializer.deserialize(get(str), cls);
    }

    public void put(String str, Object obj) {
        if (C12017g.m31658b(str)) {
            String str2 = null;
            if (obj != null) {
                str2 = this.serializer.serialize(obj);
            }
            put(str, str2);
        }
    }
}
