package com.zielm.funnyboat;

import android.view.MotionEvent;

public interface GameModule {
	void tick();
	void touch(MotionEvent ev);
}
