package mapper;

import models.dto_the_one_api.books.DescriptionOfBookDto;
import models.dto_the_one_api.books.ListOfBooksDto;
import models.entity.DescriptionOfBookEntity;
import models.entity.ListOfBookEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfBookMapper {

//    public ListOfBookEntity toListOfBookEntity(ListOfBooksDto listOfBooksDto) {
//        List<DescriptionOfBookEntity> descriptionOfBookEntities = listOfBooksDto.getDocs().stream()
//                .map(this::toDescriptionOfBookEntity)
//                .collect(Collectors.toList());
//
//        return ListOfBookEntity.builder()
//                .descriptionOfBookEntityList(descriptionOfBookEntities)
//                .build();
//    }

    private DescriptionOfBookEntity toDescriptionOfBookEntity(DescriptionOfBookDto descriptionOfBookDto) {
        return DescriptionOfBookEntity.builder()
                .id(descriptionOfBookDto.getId())
                .name(descriptionOfBookDto.name)
                .build();
    }
}
