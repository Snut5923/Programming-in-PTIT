package HELLOJAR;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
import sun.tools.jar.resources.jar;;
public class App {
    jar HELLOJAR.jar ;
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
