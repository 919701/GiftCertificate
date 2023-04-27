package ru.clevertec.ecl.dto.gift_certificateDto;

import ru.clevertec.ecl.dto.tagDto.TagResponseDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record GiftCertificateResponseDto(Long id,
                                         String name,
                                         BigDecimal price,
                                         String description,
                                         Integer duration,
                                         LocalDateTime createDate,
                                         LocalDateTime lastUpdateDate,
                                         List<TagResponseDto> tags

) {
}
