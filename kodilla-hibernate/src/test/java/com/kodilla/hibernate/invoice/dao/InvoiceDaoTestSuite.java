package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Nail");
        Product product2 = new Product("Hammer");

        Item item1 = new Item(new BigDecimal(0.2), 100);
        Item item2 = new Item(new BigDecimal(50), 1);
        Item item3 = new Item(new BigDecimal(0.2), 200);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product1);

        product1.getItems().add(item1);
        product1.getItems().add(item3);
        product2.getItems().add(item2);

        Invoice invoice = new Invoice("2018/09/15/001");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals("2018/09/15/001", invoice.getNumber());

        //CleanUp
        invoiceDao.delete(id);
    }
}
