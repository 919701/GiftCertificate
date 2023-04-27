package ru.clevertec.ecl.service.impl;

import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.clevertec.ecl.dto.tagDto.TagRequestDto;
import ru.clevertec.ecl.dto.tagDto.TagResponseDto;
import ru.clevertec.ecl.mapper.TagMapper;
import ru.clevertec.ecl.service.TagService;

import java.util.List;

@Service
@AllArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagResponseDto responseDto;
    private final TagMapper tagMapper = Mappers.getMapper(TagMapper.class);


    @Override
    public List<TagResponseDto> findAll() {
        return null;
    }

    @Override
    public TagResponseDto findById(Long id) {
        return null;
    }

    @Override
    public TagResponseDto save(TagResponseDto entityDto) {
        return null;
    }

    @Override
    public TagResponseDto update(TagResponseDto entityDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
