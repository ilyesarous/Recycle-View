package com.example.fournisseurv5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class fourAdapter extends FirebaseRecyclerAdapter<modelFour,fourAdapter.myViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public fourAdapter(@NonNull FirebaseRecyclerOptions<modelFour> options) {
        super(options);

    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull modelFour model) {

        holder.name.setText(model.getNom());
        holder.id.setText(model.getFournisseurid());

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView name,id;

        public myViewHolder(@NonNull View itemView){
            super(itemView);

            name = (TextView)itemView.findViewById(R.id.name);
            id = (TextView)itemView.findViewById(R.id.Id);
        }

    }
}
