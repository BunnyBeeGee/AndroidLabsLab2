package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button.Button = (Button) findViewById(R.id.button1);
        Button.setText("Click");
        Button.setOnClickListener( (click) ); (btn.setText("You clicked me"); }  );
            button.setOnClickListener(new void OnClickListener() {

                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                    Snackbar.make(theEdit, getText("Checkbox is " + b, Snackbar.LENGTH.LONG)
            .setAction( getText("undo"), click-> compoundButton.setChecked(|b)).show();
            Snackbar.setAction(“Button”, clickListener );
                    getResources.getString(R.string.toast_message);
        }

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_linear);
        CheckBox cb = (CheckBox)findViewById( R.id.checkbox )

        cb.setChecked(true);

        cb.setOnCheckChangedListener(OnCheckChangedListener )

        OnCheckChangedListener is an interface that has one function:

        onCheckChanged(CompoundButton cb, boolean isChecked) { }0
        setOnCheckChangedListener( (cb, isChecked) -> { } );

        });

    }

    private Object getText(String undo) {
    }
}