package ru.gernik.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {
    private String id;
    private String name;
    private String lastname;
    private String middlename;
    private String age;
    private List<String> carIds;
}
