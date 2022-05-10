package sg.edu.np.mad.exercise2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);
//        FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();

        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();

        Button group1btn = findViewById(R.id.group1);
        Button group2btn = findViewById(R.id.group2);

        group1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment,firstFragment).commit();
            }
        });

        group2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment,secondFragment).commit();
            }
        });

    }
}