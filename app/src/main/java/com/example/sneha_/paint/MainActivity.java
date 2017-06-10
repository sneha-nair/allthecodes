package com.example.sneha_.paint;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.graphics.Typeface;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView rect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rect = (ImageView) findViewById(R.id.rect);

           }}

private final class ChoiceTouchListener implements OnTouchListener {

    public boolean onTouch(View view, MotionEvent motionEvent) {

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            ClipData data = ClipData.newPlainText("", "");
            DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(data, shadowBuilder, view, 0);

            return true;
        } else {
            return false;
        }
    }
}

private class ChoiceDragListener implements OnDragListener {

}public boolean onDrag(View v, DragEvent event) {
    //handle drag events

    return true;
}