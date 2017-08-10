package assalaam.basketball.id.basketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button next = (Button) findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), TeknikDasar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button yuyu = (Button) findViewById(R.id.button4);
        yuyu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Sejarah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ypyp = (Button) findViewById(R.id.button7);
        ypyp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Seputar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button popo = (Button) findViewById(R.id.button6);
        popo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), Peraturan.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
