package com.example.richsoap.studyer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by richsoap on 2017/10/3 0003.
 */

public class CommonBottombar extends LinearLayout {
    private ImageView imgHome,imgSub,imgMy;
    private TextView textHome,textSub,textMy;
    private RelativeLayout home,sub,my;
    private static int[] Color = {0xffee00,0xccee33,0x808080};

    public CommonBottombar(Context context, AttributeSet attributeSet) {
        super(context,attributeSet);
        LayoutInflater.from(context).inflate(R.layout.common_bottombar,this);
        imgHome = findViewById(R.id.bottombar_home_icon);
        imgSub = findViewById(R.id.bottombar_sub_icon);
        imgMy = findViewById(R.id.bottombar_my_icon);
        textHome = findViewById(R.id.bottombar_home_text);
        textSub = findViewById(R.id.bottombar_sub_text);
        textMy = findViewById(R.id.bottombar_my_text);
        home = findViewById(R.id.bottombar_home);
        sub = findViewById(R.id.bottombar_sub);
        my = findViewById(R.id.bottombar_my);
    }

    public void init() {
        imgHome.setColorFilter(Color[0]);
        imgSub.setColorFilter(Color[0]);
        imgMy.setColorFilter(Color[0]);
        textHome.setTextColor(Color[0]);
        textSub.setTextColor(Color[0]);
        textMy.setTextColor(Color[0]);
    }

    public void setColor(int location,int kind){
        init();
        switch(location) {
            case 0:
                imgHome.setColorFilter(Color[kind]);
                textHome.setTextColor(Color[kind]);
                break;
            case 1:
                imgSub.setColorFilter(Color[kind]);
                textSub.setTextColor(Color[kind]);
                break;
            case 2:
                imgMy.setColorFilter(Color[kind]);
                textMy.setTextColor(Color[kind]);
                break;
            default:
        }
    }

}
