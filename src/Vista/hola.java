/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorHistorial;
import Modelo.Historial;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class hola {
    private static ControladorHistorial controladorHistorial;
    public static void main(String[] args) {
       controladorHistorial = new ControladorHistorial();
       imprimir();
    }

    public static void imprimir() {
        Document document = new Document();

        try {
            Image imagen = Image.getInstance("src/imagenes/logo.png");

            PdfWriter.getInstance(document, new FileOutputStream("Informe.pdf"));
            document.open();

            imagen.setAlignment(Element.ALIGN_CENTER);
            document.add(imagen);

            Paragraph titulo = new Paragraph("REPORTE MINI MARQUET \"LA GUADALUPANA\"   ",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(Chunk.NEWLINE);

            Paragraph nom = new Paragraph("NOMBRE:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(nom);

            Paragraph nombre = new Paragraph("WILSON RIVERA",
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            nombre.setAlignment(Element.ALIGN_CENTER);
            document.add(nombre);
            document.add(Chunk.NEWLINE);

            nom = new Paragraph("TUTOR:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(nom);

            nombre = new Paragraph("JUAN ARAUJO",
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            nombre.setAlignment(Element.ALIGN_CENTER);
            document.add(nombre);
            document.add(Chunk.NEWLINE);

            Calendar fe = Calendar.getInstance();
            String fecha = fe.get(Calendar.YEAR) + "/" + (fe.get(Calendar.MONTH) + 1) + "/" + fe.get(Calendar.DAY_OF_MONTH);
            String hora = fe.get(Calendar.HOUR) + ":" + fe.get(Calendar.MINUTE) + ":" + fe.get(Calendar.SECOND);

            Paragraph fee = new Paragraph("FECHA:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(fee);

            Paragraph fechaa = new Paragraph(fecha,
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            fechaa.setAlignment(Element.ALIGN_CENTER);
            document.add(fechaa);

            document.add(Chunk.NEWLINE);

            Paragraph hoo = new Paragraph("HORA:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(hoo);

            Paragraph horaa = new Paragraph(hora,
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            horaa.setAlignment(Element.ALIGN_CENTER);
            document.add(horaa);

            document.add(Chunk.NEXTPAGE);

            Paragraph t1 = new Paragraph("REPORTE DE LOS PRODUCTOS",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            t1.setAlignment(Element.ALIGN_CENTER);
            document.add(t1);
            document.add(Chunk.NEWLINE);

            PdfPTable table = new PdfPTable(7);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell(new Paragraph("ID",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("FECHA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("MOTIVO",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("PRODUCTO",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("CANTIDAD INGRESA | SALE",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("CANTIDAD NUEVA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("CANTIDAD ANTERIOR",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            List<Historial> lsRiego = controladorHistorial.listar();
            if (lsRiego != null) {
                JOptionPane.showMessageDialog(null, "Es nulla");
            }
            for (Historial h : lsRiego) {

                table.addCell(h.getId() + "");
                table.addCell(h.getFecha() + "");
                table.addCell(h.getMotivo() + "");
                table.addCell(h.getProducto().getNombre() + "");
                table.addCell(h.getCantidadAnt() + "");
                table.addCell(h.getCantidadNew() + "");
                table.addCell(h.getCantidadOld() + "");
            }

            document.add(table);

            document.add(Chunk.NEXTPAGE);

            t1 = new Paragraph("DATOS TABULABLES",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            t1.setAlignment(Element.ALIGN_CENTER);
            document.add(t1);
            document.add(Chunk.NEWLINE);

            document.close();
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("Informe.pdf"));

        } catch (Exception e) {
            System.err.println(e.getMessage() + e.getLocalizedMessage());
            //System.exit(-1);
        }

    }

}
