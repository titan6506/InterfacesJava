package Principal;
import payroll.HourlyEmployee;
import payroll.SalariedEmployee;
import Principal.Invoice;
import ImplementacionInterfaces.Payable;


public class Application {
    public static void main(String[] args) {
        Payable p;
        p = new HourlyEmployee("Juan", " Perez", "111", 5, 40);
        Model.agregar(p);
        p = new Invoice("01234", "seat", 2, 375);
        Model.agregar(p);
        p = new SalariedEmployee("Pablo", "Marmol", "444", 400);
        Model.agregar(p);
        Listing l = new Listing(Model.payables);
        l.list();

    }

}
