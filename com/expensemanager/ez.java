package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class ez implements OnItemSelectedListener {
    final /* synthetic */ Button f4615a;
    final /* synthetic */ Button f4616b;
    final /* synthetic */ DisplaySettings f4617c;

    ez(DisplaySettings displaySettings, Button button, Button button2) {
        this.f4617c = displaySettings;
        this.f4615a = button;
        this.f4616b = button2;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = -1;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                i2 = 2130837526;
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                i2 = 2130837527;
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                i2 = 2130837528;
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                i2 = 2130837529;
                break;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                i2 = 2130837530;
                break;
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                i2 = 2130837531;
                break;
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                this.f4615a.setBackgroundResource(17301508);
                this.f4616b.setBackgroundResource(17301508);
                this.f4615a.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
                this.f4615a.setTypeface(null, 0);
                this.f4615a.setTextColor(-16777216);
                this.f4616b.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
                this.f4616b.setTypeface(null, 0);
                this.f4616b.setTextColor(-16777216);
                return;
        }
        aib.m3858a(this.f4617c.f2701p, this.f4615a, i2);
        aib.m3858a(this.f4617c.f2701p, this.f4616b, i2);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
