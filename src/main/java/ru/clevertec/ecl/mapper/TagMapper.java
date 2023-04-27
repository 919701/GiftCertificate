package ru.clevertec.ecl.mapper;

import org.mapstruct.Mapper;
import ru.clevertec.ecl.dto.tagDto.TagRequestDto;
import ru.clevertec.ecl.dto.tagDto.TagResponseDto;
import ru.clevertec.ecl.entity.Tag;

@Mapper
public interface TagMapper {

    TagRequestDto toDto(Tag tag);

    Tag fromDto(TagResponseDto tagResponseDto);

}
