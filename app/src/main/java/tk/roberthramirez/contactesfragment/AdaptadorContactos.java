package tk.roberthramirez.contactesfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AdaptadorContactos extends ArrayAdapter<Contacto> {
    private Context context;
    private Contacto[] contactos;

    public AdaptadorContactos(Fragment context, Contacto[]contactos) {
        super(context.getActivity(), R.layout.lista_layout, contactos);
        this.contactos = contactos;
        this.context = context.getActivity();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.lista_layout, null);
        TextView tvNombreLis =item.findViewById(R.id.tvNombreLis);
        tvNombreLis.setText(contactos[position].getNombre()+" "+contactos[position].getApellido1());
        TextView tvTelefonoLis = item.findViewById(R.id.tvTelefonoLis);
        tvTelefonoLis.setText(contactos[position].getTelefono1());
        return item;
    }
}
