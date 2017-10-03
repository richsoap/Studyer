package com.example.richsoap.studyer;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;

/**
 * Created by richsoap on 2017/10/3 0003.
 */

public class CommonToolbar extends Toolbar {
    public CommonToolbar(Context context, AttributeSet attributeSet) {
        super(context,attributeSet);
        LayoutInflater.from(context).inflate(R.layout.common_toolbar,this);
    }

}
