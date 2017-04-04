package program.testinfofragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class TestInfoFragment extends AppCompatActivity implements View.OnClickListener {

private Fragment tfrag;
Button startTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_info_fragment);
       startTest = (Button) findViewById(R.id.StartTest);
        startTest.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startTest.setVisibility(View.GONE);
        tfrag = new TestFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frgmCont, tfrag)
                .commit();
    }
}
