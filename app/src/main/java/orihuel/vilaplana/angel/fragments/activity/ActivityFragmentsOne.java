package orihuel.vilaplana.angel.fragments.activity;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import orihuel.vilaplana.angel.fragments.R;
import orihuel.vilaplana.angel.fragments.fragment.FragmentOne;
import orihuel.vilaplana.angel.fragments.fragment.FragmentThree;
import orihuel.vilaplana.angel.fragments.fragment.FragmentTwo;

public class ActivityFragmentsOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_one);
        setUI();
    }

    private void setUI() {
        changeFragment(R.id.fragmentContainerOne, R.id.btChangeFragOneOne, R.id.btChangeFragOneTwo, R.id.btChangeFragOneThree);
        changeFragment(R.id.fragmentContainerTwo, R.id.btChangeFragTwoOne, R.id.btChangeFragTwoTwo, R.id.btChangeFragTwoThree);
        changeFragment(R.id.fragmentContainerThree, R.id.btChangeFragThreeOne, R.id.btChangeFragThreeTwo, R.id.btChangeFragThreeThree);
    }

    private void changeFragment(int fragmentContainerID, int buttonOneID, int buttonTwoID, int buttonThreeID) {
        FragmentOne fragmentOne = new FragmentOne();
        FragmentTwo fragmentTwo = new FragmentTwo();
        FragmentThree fragmentThree = new FragmentThree();

        Button btChangeFragOneOne = findViewById(buttonOneID);
        changeFragment(btChangeFragOneOne, fragmentContainerID, fragmentOne);

        Button btChangeFragOneTwo = findViewById(buttonTwoID);
        changeFragment(btChangeFragOneTwo, fragmentContainerID, fragmentTwo);

        Button btChangeFragOneThree = findViewById(buttonThreeID);
        changeFragment(btChangeFragOneThree, fragmentContainerID, fragmentThree);
    }

    private void changeFragment(Button button, final int fragmentContainer, final Fragment fragment) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(fragmentContainer, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

}