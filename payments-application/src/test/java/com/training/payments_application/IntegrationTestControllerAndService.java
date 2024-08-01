package com.training.payments_application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.payments_application.repo.AuthorRepo;
import com.training.payments_application.repo.BookRepo;
import com.training.payments_application.services.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import com.training.payments_application.entities.Book;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
 @ExtendWith(SpringExtension.class)
  @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
  @AutoConfigureMockMvc
public class IntegrationTestControllerAndService {

    @Autowired

    private MockMvc mockMvc;

 @MockBean
    private BookRepo repo;

 @MockBean
 private AuthorRepo repo1;
 @MockBean
    private BookService service;


 @Test
    public void test() throws Exception {


     Book b1 = new Book(11L,"Homo deus");

     ObjectMapper om = new ObjectMapper();
         String bookjson = om.writeValueAsString(b1);


     Mockito.when(repo.save(b1)).thenReturn(b1);
         Mockito.when(service.addBook(b1)).thenReturn(b1);

         mockMvc.perform(post("/api/books")
                 .contentType("application/json")
                 .content(bookjson))
                 .andExpect(status().isCreated());


     ArgumentCaptor<Book> capturedTransaction = ArgumentCaptor.forClass(Book.class);
//4 – check the expected functions were called
     Mockito.verify(repo).save(capturedTransaction.capture());
//5 – any other assertions
     assertEquals("11L", capturedTransaction.getValue().getId());



 }

}
