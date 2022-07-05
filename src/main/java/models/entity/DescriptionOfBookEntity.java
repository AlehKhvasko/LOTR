package models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "description_of_book")
public class DescriptionOfBookEntity {
    @Id
    private String id;
    @Column(name = "name", length = 150)
    private String name;

    @ManyToOne
    @JoinColumn(
            name = "list_of_book_id",
            foreignKey = @ForeignKey(name = "fk_descOfBook_listOfBook")
    )
    private ListOfBookEntity listOfBookEntity;
}
