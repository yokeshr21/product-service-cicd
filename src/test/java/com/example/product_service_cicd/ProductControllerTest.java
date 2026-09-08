package com.example.product_service_cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {

    @Autowired
    private MockMvcTester mockMvc;

    @Test
    void shouldReturnProductById() {
        assertThat(mockMvc.get().uri("/products/1"))
                .hasStatusOk()
                .hasBodyTextEqualTo("Product ID: 1");
    }
}
