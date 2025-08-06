package salidas;

import documentos.Documento;
import interfaces.Salida;

import java.util.ArrayList;
import java.util.List;

public class SalidasDashboard implements Salida {
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("Mostrando resumen de documentos por fuente");
        for (Documento doc : documentos){
            System.out.println("- Titulo: "+doc.getTitulo()+" Fuente: "+doc.getFuenteOrigen());
        }
    }
}
