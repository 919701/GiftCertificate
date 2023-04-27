package ru.clevertec.ecl.dto.gift_certificateDto;

import ru.clevertec.ecl.dto.tagDto.TagRequestDto;

import java.math.BigDecimal;
import java.util.List;

public record GiftCertificateRequestDto(String name,
                                        BigDecimal price,
                                        String description,
                                        Integer duration,
                                        List<TagRequestDto> tags
) {
}
