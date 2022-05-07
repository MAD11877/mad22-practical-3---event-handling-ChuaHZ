package sg.edu.np.mad.exercise2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView middle = findViewById(R.id.middle);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mid_alert = new AlertDialog.Builder(ListActivity.this);
                mid_alert.setTitle("Profile");
                mid_alert.setMessage("MADness");
                mid_alert.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Random rand = new Random();
                        Integer randint = rand.nextInt(9000000);
                        Intent i2 = new Intent(ListActivity.this, MainActivity.class);

                        i2.putExtra("key",randint);
                        startActivity(i2);
                    }
                });
                mid_alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                mid_alert.show();

            }
        });
    }
}