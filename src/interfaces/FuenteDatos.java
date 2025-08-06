package interfaces;

import documentos.Documento;

import java.util.List;

public interface FuenteDatos {
    List<Documento> obtenerDocumentos();
}
