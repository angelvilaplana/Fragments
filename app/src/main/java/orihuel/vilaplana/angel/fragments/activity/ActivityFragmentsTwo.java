package orihuel.vilaplana.angel.fragments.activity;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import orihuel.vilaplana.angel.fragments.Disc;
import orihuel.vilaplana.angel.fragments.R;
import orihuel.vilaplana.angel.fragments.fragment.DetailFragment;
import orihuel.vilaplana.angel.fragments.fragment.ListFragment;

public class ActivityFragmentsTwo extends AppCompatActivity implements ListFragment.OnItemClickListener {

    private Disc selectDisc;

    private DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_two);

        detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetail);

        ListFragment listFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentList);
        if (listFragment != null) {
            listFragment.setListener(this);
        }

        if (savedInstanceState != null && detailFragment != null) {
            selectDisc = (Disc) savedInstanceState.getSerializable("disc");
            detailFragment.setUI(selectDisc);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("disc", selectDisc);
    }

    @Override
    public void onItemClick(Disc disc) {
        if (detailFragment != null) {
            selectDisc = disc;
            detailFragment.setUI(disc);
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("disc", disc);
            startActivity(intent);
        }
    }

}
