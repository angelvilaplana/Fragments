package orihuel.vilaplana.angel.fragments.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import orihuel.vilaplana.angel.fragments.Disc;
import orihuel.vilaplana.angel.fragments.ItemAdapter;
import orihuel.vilaplana.angel.fragments.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListFragment extends Fragment implements ItemAdapter.OnItemClickListener {

    private List<Disc> discs;

    private OnItemClickListener listener;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initializeDiscs();
        RecyclerView recyclerView = Objects.requireNonNull(getView()).findViewById(R.id.rvList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new ItemAdapter(discs, this));
    }

    private void initializeDiscs() {
        discs = new ArrayList<>();
        discs.add(new Disc(R.drawable.killer_queen, "Killer Queen", "Queen", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sollicitudin felis eget dictum placerat. Curabitur porttitor iaculis arcu, lacinia maximus elit eleifend at. Donec eget nisi eget quam imperdiet lobortis."));
        discs.add(new Disc(R.drawable.bohemia_rhapsody, "Bohemiam Rhapsody", "Queen", "Morbi placerat massa in mi pellentesque iaculis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam nulla ante, venenatis vitae arcu nec, varius eleifend massa."));
        discs.add(new Disc(R.drawable.dont_stop_me_now, "Don't Stop Me Now", "Queen", "Integer rutrum eleifend volutpat. Sed gravida auctor dolor, vel interdum mi accumsan a. In pretium interdum metus, ac varius quam lacinia at. Sed efficitur nulla at magna auctor, eget vulputate ex aliquam."));
        discs.add(new Disc(R.drawable.i_want_to_break_free, "I Want to Break Free", "Queen", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sollicitudin felis eget dictum placerat. Curabitur porttitor iaculis arcu, lacinia maximus elit eleifend at. Donec eget nisi eget quam imperdiet lobortis."));
        discs.add(new Disc(R.drawable.radio_ga_ga, "Radio Ga Ga", "Queen", "Morbi placerat massa in mi pellentesque iaculis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam nulla ante, venenatis vitae arcu nec, varius eleifend massa."));
        discs.add(new Disc(R.drawable.we_are_the_champions, "We Are the Champions", "Queen", "Integer rutrum eleifend volutpat. Sed gravida auctor dolor, vel interdum mi accumsan a. In pretium interdum metus, ac varius quam lacinia at. Sed efficitur nulla at magna auctor, eget vulputate ex aliquam."));
        discs.add(new Disc(R.drawable.invisible_man, "Invisible Man", "Queen", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sollicitudin felis eget dictum placerat. Curabitur porttitor iaculis arcu, lacinia maximus elit eleifend at. Donec eget nisi eget quam imperdiet lobortis."));
        discs.add(new Disc(R.drawable.play_the_game, "Play The Game", "Queen", "Morbi placerat massa in mi pellentesque iaculis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam nulla ante, venenatis vitae arcu nec, varius eleifend massa."));
        discs.add(new Disc(R.drawable.we_will_rock_you, "We Will Rock You", "Queen", "Integer rutrum eleifend volutpat. Sed gravida auctor dolor, vel interdum mi accumsan a. In pretium interdum metus, ac varius quam lacinia at. Sed efficitur nulla at magna auctor, eget vulputate ex aliquam."));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onItemClick(Disc disc) {
        listener.onItemClick(disc);
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(Disc disc);
    }

}