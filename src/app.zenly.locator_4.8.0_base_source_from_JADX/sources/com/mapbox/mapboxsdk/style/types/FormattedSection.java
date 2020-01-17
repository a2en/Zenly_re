package com.mapbox.mapboxsdk.style.types;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.utils.C11595b;
import java.util.Arrays;
import java.util.HashMap;

@Keep
public class FormattedSection {
    private Number fontScale;
    private String[] fontStack;
    private String text;
    private String textColor;

    public FormattedSection(String str) {
        this(str, null, null, null);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || FormattedSection.class != obj.getClass()) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) obj;
        String str = this.text;
        if (str == null ? formattedSection.text != null : !str.equals(formattedSection.text)) {
            return false;
        }
        Number number = this.fontScale;
        if (number == null ? formattedSection.fontScale != null : !number.equals(formattedSection.fontScale)) {
            return false;
        }
        if (!Arrays.equals(this.fontStack, formattedSection.fontStack)) {
            return false;
        }
        String str2 = this.textColor;
        String str3 = formattedSection.textColor;
        if (str2 != null) {
            z = str2.equals(str3);
        } else if (str3 != null) {
            z = false;
        }
        return z;
    }

    public Number getFontScale() {
        return this.fontScale;
    }

    public String[] getFontStack() {
        return this.fontStack;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Number number = this.fontScale;
        int hashCode2 = (((hashCode + (number != null ? number.hashCode() : 0)) * 31) + Arrays.hashCode(this.fontStack)) * 31;
        String str2 = this.textColor;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void setFontScale(Number number) {
        this.fontScale = number;
    }

    public void setFontStack(String[] strArr) {
        this.fontStack = strArr;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    /* access modifiers changed from: 0000 */
    public Object[] toArray() {
        HashMap hashMap = new HashMap();
        hashMap.put("font-scale", this.fontScale);
        hashMap.put("text-font", this.fontStack);
        hashMap.put("text-color", this.textColor);
        return new Object[]{this.text, hashMap};
    }

    public FormattedSection(String str, Number number, String[] strArr, String str2) {
        this.text = str;
        this.fontScale = number;
        this.fontStack = strArr;
        this.textColor = str2;
    }

    public void setTextColor(int i) {
        this.textColor = C11595b.m30376a(i);
    }

    /* access modifiers changed from: 0000 */
    public void setTextColor(Object obj) {
        setTextColor(C11595b.m30376a(C11595b.m30378b((String) obj)));
    }

    @Deprecated
    public FormattedSection(String str, Number number, String[] strArr) {
        this(str, number, strArr, null);
    }

    @Deprecated
    public FormattedSection(String str, Number number) {
        this(str, number, null, null);
    }

    @Deprecated
    public FormattedSection(String str, String[] strArr) {
        this(str, null, strArr, null);
    }
}
