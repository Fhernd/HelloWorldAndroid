package co.ortizol.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    private static final String TAG_LOG = HelloActivity.class.getSimpleName();
    private static final String COUNTER = "counter";
    private TextView mTvwHelloWorld;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null){
            counter = 0;
        } else {
            counter = savedInstanceState.getInt(COUNTER);
            ++counter;
        }

        // Create a TextView and write Hello World!:
        mTvwHelloWorld = new TextView(this);
        // Set the text for the newly view:
        mTvwHelloWorld.setText(String.format("Value of the counter: %s", String.valueOf(counter)));
        // Set the content view for the TextView:
        setContentView(mTvwHelloWorld);

        Log.i(TAG_LOG, "Inside on onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG_LOG, "Inside on onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG_LOG, "Inside on onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG_LOG, "Inside on onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG_LOG, "Inside on onPause()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(COUNTER, counter);

        Log.i(TAG_LOG, "Inside on onSaveInstanceState()");

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG_LOG, "Inside on onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG_LOG, "Inside on onRestart()");
    }
}
