package orihuel.vilaplana.angel.fragments.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import orihuel.vilaplana.angel.fragments.Disc;
import orihuel.vilaplana.angel.fragments.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail);
        setUI();
    }

    private void setUI() {
        Disc disc = (Disc) getIntent().getSerializableExtra("disc");
        setTitle(disc.getTitle());
        ImageView ivMain = findViewById(R.id.ivMain);
        ivMain.setImageResource(disc.getIdImage());
        TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText(disc.getTitle());
        TextView tvSubtitle = findViewById(R.id.tvSubtitle);
        tvSubtitle.setText(disc.getSubtitle());
        TextView tvDescription = findViewById(R.id.tvDescription);
        tvDescription.setText(disc.getDescription());
    }

}
