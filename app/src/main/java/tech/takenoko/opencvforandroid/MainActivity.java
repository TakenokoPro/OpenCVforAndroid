package tech.takenoko.opencvforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tech.takenoko.opencvforandroid.view.CameraShootingView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(MainActivity.this, CameraShootingView.class);
        startActivity(intent);
        finish();
    }

}
