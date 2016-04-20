package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.csschult.lab3.MainActivity;
import com.example.csschult.lab3.R;

import org.w3c.dom.Text;

/**
 * Created by csschult on 4/19/2016.
 */
public class JUnit_Tests extends ActivityInstrumentationTestCase2<MainActivity> {


    MainActivity mainActivity;

    public JUnit_Tests() {


        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester );

    }
}
