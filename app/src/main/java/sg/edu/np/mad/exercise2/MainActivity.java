package sg.edu.np.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    boolean flag;
    User user = new User("Guest","PCG :c",1,true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.Follow);
        btn.setOnClickListener(this);

        TextView hello = findViewById(R.id.Hello);
        hello.setText("Hello" + user.Name);

        TextView desc = findViewById(R.id.desc);
        desc.setText((user.Description));
        flag = true;

        Intent receiveIntent = getIntent();
        int message = receiveIntent.getIntExtra("key", 123);

        TextView hi = findViewById(R.id.Hello);
        hi.setText("MAD " + message);

    }

    public void onClick(View v){
        if (user.Followed){
            btn.setText("Unfollow");
            user.Followed = false;
            Toast.makeText(this, "Unfollowed", Toast.LENGTH_LONG).show();
        }
        else{
            btn.setText("Follow");
            user.Followed = true;
            Toast.makeText(this, "Followed", Toast.LENGTH_LONG).show();
        }
    }
}