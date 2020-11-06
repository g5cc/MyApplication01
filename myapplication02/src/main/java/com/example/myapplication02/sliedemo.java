package com.example.myapplication02;

import com.example.myapplication02.slice.sliedemoSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class sliedemo extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(sliedemoSlice.class.getName());
    }
}
