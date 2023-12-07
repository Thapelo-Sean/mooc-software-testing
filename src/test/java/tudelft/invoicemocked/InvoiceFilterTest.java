package tudelft.invoicemocked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        Invoice mauricio = new Invoice("Mauricio", 99.0);
        Invoice arie = new Invoice("Arie", 101.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);

        List<Invoice> results = Arrays.asList(mauricio, arie);
        Mockito.when(dao.all()).thenReturn(results);

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();

        Assertions.assertEquals(mauricio, result.get(0));
        Assertions.assertEquals(1, result.size());
    }

    @Test
    public void filterInvalidInvoice(){

        Invoice invoice1 = new Invoice("John", 98.0);
        Invoice invoice2 = new Invoice("Simon", 99.0);

        InvoiceDao dao = Mockito.mock(InvoiceDao.class);
        List<Invoice> results = Arrays.asList(invoice1, invoice2);
        Mockito.when(dao.all()).thenReturn(results);

        InvoiceFilter filter = new InvoiceFilter(dao);
        List <Invoice> result = filter.filter();

        Assertions.assertEquals(invoice1, result.get(0));
        Assertions.assertEquals(2, result.size());
    }
}