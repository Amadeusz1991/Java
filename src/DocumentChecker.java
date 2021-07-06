import Document.Document;
import Document.ExelDocument;
import Document.PdfDocument;

public class DocumentChecker {

    public static void main(String[] args) {
        //ExelDocument document = new ExelDocument();
        Document exelDocument = new ExelDocument();
        Document pdfDocument = new PdfDocument();

        exelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
