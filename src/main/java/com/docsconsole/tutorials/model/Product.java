package com.docsconsole.tutorials.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
public class Product {

    @Id
    private String productId;
    private String productName;
    private String productVendorName;


}
