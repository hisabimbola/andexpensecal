package com.expensemanager;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class er implements OnItemSelectedListener {
    final /* synthetic */ DisplaySettings f4604a;

    er(DisplaySettings displaySettings) {
        this.f4604a = displaySettings;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4604a.getWindow().setBackgroundDrawableResource(2130837522);
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4604a.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f4604a.getWindow().setBackgroundDrawableResource(2130837516);
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f4604a.getWindow().setBackgroundDrawableResource(2130837517);
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                this.f4604a.getWindow().setBackgroundDrawableResource(2130837513);
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                this.f4604a.getWindow().setBackgroundDrawableResource(2130837514);
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                this.f4604a.m2595a(i, this.f4604a.f2686a.getSelectedItemPosition(), this.f4604a.f2687b.getSelectedItemPosition());
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                this.f4604a.startActivityForResult(intent, 1);
            default:
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        this.f4604a.startActivityForResult(intent, 1);
    }
}
