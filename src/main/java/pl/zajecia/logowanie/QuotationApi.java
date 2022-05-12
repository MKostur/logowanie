package pl.zajecia.logowanie;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {
    private List<Quotation> quotationList;

    public QuotationApi() {
        this.quotationList = new ArrayList<>();
        quotationList.add(new Quotation("Nfsdfsdfs", "frano"));
        quotationList.add(new Quotation("dasdasdasdasd asda", "grzecho"));
        quotationList.add(new Quotation("mklghnkmfghklm", "Bart"));
        quotationList.add(new Quotation("jkgfjkgg", "Zurek"));

    }
    @GetMapping("/api")
    public List<Quotation> getQuotationList(){
        return quotationList;
    }
    @PostMapping("/api")
    public boolean addQuation(@RequestBody Quotation quotation) {
        return quotationList.add(quotation);
    }
    @DeleteMapping("/api")
    public void deleteQuation(@RequestParam int index) {
        quotationList.remove(index);
    }


}
