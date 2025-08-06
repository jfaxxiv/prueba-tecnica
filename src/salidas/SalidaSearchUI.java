package salidas;

import documentos.Documento;
import interfaces.Salida;

import java.util.List;

public class SalidaSearchUI implements Salida {
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("Mostrando "+documentos.size()+" en la UI de búsqueda");
    }
}
