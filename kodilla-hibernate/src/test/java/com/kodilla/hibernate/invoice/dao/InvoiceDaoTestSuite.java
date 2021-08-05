package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("001/0508/2021");
        Product product1 = new Product("Potato");
        Product product2 = new Product("Tomato");
        Product product3 = new Product("Banana");
        Product product4 = new Product("Strawberry");
        Item item1 = new Item(product1, invoice, new BigDecimal("5.5"), 100);
        Item item2 = new Item(product2, invoice, new BigDecimal("8.4"), 50);
        Item item3 = new Item(product3, invoice, new BigDecimal("4.5"), 25);
        Item item4 = new Item(product4, invoice, new BigDecimal("10.5"), 35);
        Item item5 = new Item(product4, invoice, new BigDecimal("11.4"), 10);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
