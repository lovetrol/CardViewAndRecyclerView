package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.UsuariosViewHolder> {

    private Context mContext;
    private List<Usuarios> usuariosList;


    class UsuariosViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNombre, textViewAltaprot;
        //ImageView imageView;

        public UsuariosViewHolder(View itemView) {
            super(itemView);

            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewAltaprot = itemView.findViewById(R.id.textViewAltaProt);
        }
    }


    public Adaptador(Context mContext, List<Usuarios> usuariosList) {
        this.mContext = mContext;
        this.usuariosList = usuariosList;

    }


    @Override
    public UsuariosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflanter = LayoutInflater.from(mContext);
        View view = inflanter.inflate(R.layout.list_usuarios, null);
        //return rootView;
        return new UsuariosViewHolder(view);

    }


    @Override
    public void onBindViewHolder(UsuariosViewHolder holder, int position) {

        Usuarios usuarios = usuariosList.get(position);

        //cargamos la imagen
        /*Glide.with(mContext)
                .load(usuarios.getImage())
                .into(holder.imageView);*/

        holder.textViewNombre.setText(usuarios.getNombre());
        holder.textViewAltaprot.setText(usuarios.getAltaprot());


    }


    @Override
    public int getItemCount() {
        return usuariosList.size();
    }
}
