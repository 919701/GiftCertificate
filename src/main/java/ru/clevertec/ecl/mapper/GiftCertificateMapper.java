package ru.clevertec.ecl.mapper;

import org.mapstruct.Mapper;
import ru.clevertec.ecl.dto.gift_certificateDto.GiftCertificateRequestDto;
import ru.clevertec.ecl.dto.gift_certificateDto.GiftCertificateResponseDto;
import ru.clevertec.ecl.entity.GiftCertificate;

@Mapper
public interface GiftCertificateMapper {

    GiftCertificateRequestDto toDto(GiftCertificate giftCertificate);

    GiftCertificate fromDto (GiftCertificateResponseDto giftCertificateResponseDto);
}
