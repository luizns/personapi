package digitalinnovation.personapi.dto.mapper;

import digitalinnovation.personapi.dto.request.PersonDTO;
import digitalinnovation.personapi.entities.Person;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}