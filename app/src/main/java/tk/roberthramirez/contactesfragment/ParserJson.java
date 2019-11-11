package tk.roberthramirez.contactesfragment;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;

public class ParserJson {

    private Contacto[] contactos;
    private InputStream contactoFile;

    public ParserJson(Context c) {
        this.contactoFile= c.getResources().openRawResource(R.raw.contacts);
    }

    public boolean parse() {
        boolean parsed = false;
        contactos = null;
        int bytesArchivo;
        byte[] bytes = null;
        String json;
        try {
            bytesArchivo=contactoFile.available();
            bytes = new byte[bytesArchivo];
            contactoFile.read(bytes);
            json=new String(bytes, "UTF-8");

            JSONTokener tokener = new JSONTokener(json);
            JSONArray archivo = new JSONArray(tokener);
            JSONObject objContacto = null;
            contactos = new Contacto[archivo.length()];

            for(int i=0; i<archivo.length();i++) {
                objContacto = archivo.getJSONObject(i);
                contactos[i] = new Contacto(objContacto.getString("name"), objContacto.getString("firstSurname"), objContacto.getString("secondSurname"), objContacto.getString("birth"),objContacto.getString("company"), objContacto.getString("email"), objContacto.getString("phone1"), objContacto.getString("phone2"), objContacto.getString("address"));
            }


            parsed=true;
        }catch (IOException ioe){
            System.out.println("Error input Output");
        }catch (JSONException jsonError) {
            System.out.println("No se ha cargado el JSON_ARRAY");
        }
        return parsed;
    }

    public Contacto[] getContactos() {
        return this.contactos;
    }
}
