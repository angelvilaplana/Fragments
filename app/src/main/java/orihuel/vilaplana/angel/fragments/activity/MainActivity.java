package orihuel.vilaplana.angel.fragments.activity;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import orihuel.vilaplana.angel.fragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view) {
        if (view.getId() == R.id.btFragmentsOne) {
            Intent intent = new Intent(this, ActivityFragmentsOne.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ActivityFragmentsTwo.class);
            startActivity(intent);
        }
    }

}