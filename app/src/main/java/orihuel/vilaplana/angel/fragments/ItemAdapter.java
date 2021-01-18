package orihuel.vilaplana.angel.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<Disc> discs;

    private OnItemClickListener listener;

    public ItemAdapter(List<Disc> discs, OnItemClickListener listener) {
        this.discs = discs;
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout item;
        ImageView ivMain;
        TextView tvTitle;
        TextView tvSubtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.item = itemView.findViewById(R.id.item);
            this.ivMain = itemView.findViewById(R.id.ivMain);
            this.tvTitle = itemView.findViewById(R.id.tvTitle);
            this.tvSubtitle = itemView.findViewById(R.id.tvSubtitle);
        }

        public void bind(final Disc disc, final OnItemClickListener listener) {
            ivMain.setImageResource(disc.getIdImage());
            tvTitle.setText(disc.getTitle());
            tvSubtitle.setText(disc.getSubtitle());

            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(disc);
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(discs.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return discs.size();
    }

    public interface OnItemClickListener {
        void onItemClick(Disc disc);
    }

}
