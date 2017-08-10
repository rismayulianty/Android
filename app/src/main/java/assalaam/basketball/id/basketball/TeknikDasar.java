package assalaam.basketball.id.basketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeknikDasar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknik_dasar);

        Button next = (Button) findViewById(R.id.button15);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), TeknikDasar1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button yo = (Button) findViewById(R.id.button16);
        yo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), TeknikDasar2.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button np = (Button) findViewById(R.id.button17);
        np.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), TeknikDasar3.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button hg = (Button) findViewById(R.id.button18);
        hg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), TeknikDasar4.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button ti = (Button) findViewById(R.id.button19);
        ti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new
                        Intent(view.getContext(), TeknikDasar5.class);
                startActivityForResult(myIntent, 0);
            }
        });




    }
}
