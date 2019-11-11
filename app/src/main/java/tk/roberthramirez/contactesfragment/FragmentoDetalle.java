package tk.roberthramirez.contactesfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.Serializable;

public class FragmentoDetalle extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detalle_layout, container, false);
    }
    public void mostrarDetalle(Contacto contacto) {
        TextView tvNombre = getView().findViewById(R.id.tvNombre);
        tvNombre.setText("Nombre: "+contacto.getNombre());
        TextView tvApellido = getView().findViewById(R.id.tvApellido);
        tvApellido.setText("Apellidos: "+contacto.getApellido1()+" "+contacto.getApellido2());
        TextView tvDireccion = getView().findViewById(R.id.tvDireccion);
        tvDireccion.setText("Direccion: "+contacto.getDireccion());
        TextView tvEmpresa = getView().findViewById(R.id.tvEmpresa);
        tvEmpresa.setText("Empresa: "+contacto.getCompania());
        TextView tvFecha = getView().findViewById(R.id.tvFecha);
        tvFecha.setText(contacto.getFecha());
        TextView tvTelefono1 = getView().findViewById(R.id.tvTel1);
        tvTelefono1.setText("Telefono 1: "+contacto.getTelefono1());
        TextView tvTelefono2 = getView().findViewById(R.id.tvTel2);
        tvTelefono2.setText("Telefono 2: "+contacto.getTelefono2());
        TextView tvEmail = getView().findViewById(R.id.tvEmail);
        tvEmail.setText("Email: "+contacto.getEmail());
    }
}
