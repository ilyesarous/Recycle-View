package com.example.fournisseurv5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class clientAdapter extends FirebaseRecyclerAdapter<modelClient,clientAdapter.myViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public clientAdapter(@NonNull FirebaseRecyclerOptions<modelClient> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull modelClient model) {
        holder.name.setText(model.getNom());
        holder.id.setText(model.getClientid());

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) v.getContext();
                appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.container,new desc1(model.getNom(),
                        model.getClientid(),
                        model.getDate(),
                        model.getMontant(),
                        model.getEcheance(),
                        model.getRegle(),
                        model.getSolde())).addToBackStack(null).commit();
            }
        });
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
