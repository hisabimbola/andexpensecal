package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class uw implements OnClickListener {
    final /* synthetic */ uc f5346a;

    uw(uc ucVar) {
        this.f5346a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5346a.m315i(), ExpenseDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5346a.f5323c);
        bundle.putInt("typeId", 0);
        bundle.putInt("tabId", 3);
        intent.putExtras(bundle);
        this.f5346a.m281a(intent, 0);
    }
}
