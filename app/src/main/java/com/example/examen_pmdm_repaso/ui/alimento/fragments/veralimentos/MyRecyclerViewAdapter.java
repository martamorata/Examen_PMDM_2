package com.example.examen_pmdm_repaso.ui.alimento.fragments.veralimentos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_pmdm_repaso.R;
import com.example.examen_pmdm_repaso.modelo.Alimento;



import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    // Variables nuevas
    List<Alimento> listaAlimentos;


    // Clase ViewHolder, dentro del RecyclerView. Obtiene los campos donde pondremos la información del alimento.
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombreRecycler;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombreRecycler = itemView.findViewById(R.id.txtNombreRecycler);
        }

        public TextView getNombre() {
            return txtNombreRecycler;
        }
    }

    // Constructor
    public MyRecyclerViewAdapter(List<Alimento> lista) {
        this.listaAlimentos = lista;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_alimento, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getNombre().setText(listaAlimentos.get(position).getNombre());

        // Método que permite eliminar un alimento al seleccionarlo, y muestra un Toast.
        holder.getNombre().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listaAlimentos.remove(holder.getAdapterPosition()
                );
                notifyDataSetChanged();
                Toast.makeText(v.getContext(), holder.getNombre().getText() + " borrado ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaAlimentos.size();
    }

    public void updateLista(Alimento a) {
        listaAlimentos.add(a);
        this.notifyDataSetChanged();
        System.out.println(listaAlimentos.toString());
        System.out.println("-------------------");

    }
}
