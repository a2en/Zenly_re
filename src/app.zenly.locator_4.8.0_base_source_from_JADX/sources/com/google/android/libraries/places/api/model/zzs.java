package com.google.android.libraries.places.api.model;

abstract class zzs extends PlusCode {
    private final String zza;
    private final String zzb;

    zzs(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlusCode) {
            PlusCode plusCode = (PlusCode) obj;
            String str = this.zza;
            if (str != null ? str.equals(plusCode.getCompoundCode()) : plusCode.getCompoundCode() == null) {
                String str2 = this.zzb;
                return str2 != null ? str2.equals(plusCode.getGlobalCode()) : plusCode.getGlobalCode() == null;
            }
        }
    }

    public String getCompoundCode() {
        return this.zza;
    }

    public String getGlobalCode() {
        return this.zzb;
    }

    public int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
        sb.append("PlusCode{compoundCode=");
        sb.append(str);
        sb.append(", globalCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
