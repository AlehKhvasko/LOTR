package models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "list_of_book")
public class ListOfBookEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "listOfBookEntity"
    )
    private List<DescriptionOfBookEntity> descriptionOfBookEntityList = new ArrayList<>();

}
