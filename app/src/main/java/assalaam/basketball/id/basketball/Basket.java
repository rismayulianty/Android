package assalaam.basketball.id.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class Basket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Menu.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button sa = (Button) findViewById(R.id.button14);
        sa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Info.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button b = (Button) findViewById(R.id.imageButton);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), WebActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }
}
