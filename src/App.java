import busqueda.Buscador;
import documentos.Documento;
import documentos.FuenteBaseDatos;
import documentos.FuenteExcel;
import documentos.FuenteWeb;
import salidas.SalidaSearchUI;
import salidas.SalidasDashboard;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //Instancias de Prueba
        FuenteWeb web = new FuenteWeb("tituloweb","contenido","web");
        FuenteWeb web2 = new FuenteWeb("tituloweb2","contenido","web");

        FuenteBaseDatos bd = new FuenteBaseDatos("tituloBD","contenido","base");
        FuenteBaseDatos bs2 = new FuenteBaseDatos("tituloBD2","contenido","base");

        FuenteExcel excel = new FuenteExcel("tituloExcel","contenido","excel");
        FuenteExcel excel2 = new FuenteExcel("tituloExcel2","contenido","excel");

        //Problema 1
        List<Documento> listaComun = new ArrayList<>();
        listaComun.addAll(web.obtenerDocumentos());
        listaComun.addAll(bd.obtenerDocumentos());
        listaComun.addAll(excel.obtenerDocumentos());

        System.out.println(listaComun);
        System.out.println();

        //Problema 2
        SalidaSearchUI salida1 = new SalidaSearchUI();
        salida1.mostrar(listaComun);
        System.out.println();

        SalidasDashboard salida2 = new SalidasDashboard();
        salida2.mostrar(web.obtenerDocumentos());
        System.out.println();

        //Problema 3
        Buscador buscador = new Buscador("Excel",listaComun);
        buscador.buscar();
    }
}
