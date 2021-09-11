package Principal;
import java.util.List;

import ImplementacionInterfaces.Payable;

public class Listing {
    public List<Payable> payables;
    public Listing(List<Payable> payables){
        this.payables = payables;
    }

    public void list(){
        double total = 0;
        for(Payable pay : payables){
            System.out.println(pay.toString());
            total += pay.getPaymentAmount();
        }
        System.out.println("TOTAL ==>" + total);
    }

}
