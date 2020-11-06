package com.example.myapplication02;

import com.example.myapplication02.slice.MainAbility02Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility02 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbility02Slice.class.getName());
    }
}
