package com.blundell.grailsexperiment;

import android.widget.TextView;

public class TextSetter {

    private TextView view;

    public TextSetter(TextView view) {
        this.view = view;
    }

    public void setText(String text) {
        view.setText(text);
    }

}
