package busqueda;

import documentos.Documento;

import java.util.ArrayList;
import java.util.List;

public class Buscador {
    private String termino;
    private List<Documento> documentos = new ArrayList<>();

    public Buscador (String termino,List<Documento> documentos){
        this.termino = termino;
        this.documentos.addAll(documentos);
    }

    public void buscar(){
        System.out.println("Buscando término: "+ termino+" en "+documentos.size()+" documentos");
        List<Documento> subDocumentos = documentos.subList(0,2);
        for (int i = 0; i < subDocumentos.size(); i++) {
            System.out.println("- Documento "+(i+1)+" "+subDocumentos.get(i).getTitulo());
        }
    }
}
