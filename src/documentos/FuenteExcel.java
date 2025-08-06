package documentos;

import interfaces.FuenteDatos;

import java.util.ArrayList;
import java.util.List;

public class FuenteExcel extends Documento implements FuenteDatos {

    private static List<Documento> documentos = new ArrayList<>();
    public FuenteExcel(String titulo,String contenido,String fuenteOrigen){
        super(titulo,contenido,fuenteOrigen);
        documentos.add(this);
    }

    //Al ser una lista estatica se agregan todas las instancias de esta clase a la lista documentos
    @Override
    public List<Documento> obtenerDocumentos(){
        System.out.println("Obteniendo documentos desde Excel");
        return documentos;
    }

    @Override
    public String toString() {
        return "documento:{"+super.getTitulo()+","+super.getContenido()+","+super.getFuenteOrigen()+"}";
    }
}
