package org.admintest.numberpickerbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker np = findViewById(R.id.np);
        np.setMaxValue(9);
        np.setMinValue(0);
        np.setWrapSelectorWheel(false);
        np.setDisplayedValues(new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"});
        np.setValue(9);
    }
}
