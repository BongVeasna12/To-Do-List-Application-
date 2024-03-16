package org.example.springwebmvc.repository;

import lombok.Data;
import lombok.Getter;
import org.example.springwebmvc.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
@Configuration
public class TodoListDatasource {
    @Bean
    public  List<Todo> todo () {
        return new ArrayList<>();
    }
}
