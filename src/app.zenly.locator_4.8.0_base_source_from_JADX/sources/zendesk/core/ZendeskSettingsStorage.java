package zendesk.core;

import com.google.gson.JsonElement;
import com.zendesk.util.C12017g;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

class ZendeskSettingsStorage implements SettingsStorage {
    private final BaseStorage settingsStorage;

    ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    public boolean areSettingsUpToDate(long j, TimeUnit timeUnit) {
        Long l;
        synchronized (this.settingsStorage) {
            l = (Long) this.settingsStorage.get("last_settings_update", Long.class);
        }
        if (l == null || l.longValue() == -1) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return true;
        }
        return false;
    }

    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = this.settingsStorage.get(str, cls);
        }
        return e;
    }

    public boolean hasStoredSettings() {
        boolean b;
        synchronized (this.settingsStorage) {
            b = C12017g.m31658b(this.settingsStorage.get("last_settings_update"));
        }
        return b;
    }

    public void storeRawSettings(Map<String, JsonElement> map) {
        synchronized (this.settingsStorage) {
            this.settingsStorage.put("last_settings_update", (Object) Long.valueOf(System.currentTimeMillis()));
            for (Entry entry : map.entrySet()) {
                this.settingsStorage.put((String) entry.getKey(), entry.getValue());
            }
        }
    }
}
