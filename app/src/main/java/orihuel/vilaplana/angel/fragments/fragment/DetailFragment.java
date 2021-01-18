package orihuel.vilaplana.angel.fragments.fragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import orihuel.vilaplana.angel.fragments.Disc;
import orihuel.vilaplana.angel.fragments.R;

public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    public void setUI(Disc disc) {
        ImageView ivMain = getView().findViewById(R.id.ivMain);
        ivMain.setImageResource(disc.getIdImage());
        TextView tvTitle = getView().findViewById(R.id.tvTitle);
        tvTitle.setText(disc.getTitle());
        TextView tvSubtitle = getView().findViewById(R.id.tvSubtitle);
        tvSubtitle.setText(disc.getSubtitle());
        TextView tvDescription = getView().findViewById(R.id.tvDescription);
        tvDescription.setText(disc.getDescription());
    }

}