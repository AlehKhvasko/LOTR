package models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import models.books.DescriptionOfBooks;
import models.books.ListOfBooks;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_db")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "company_name")
    private String companyName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_db_id")
    private List<ListOfBooks> listOfBooks;

}
