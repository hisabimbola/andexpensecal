package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public class C0622b extends RuntimeException {
    public C0622b(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
