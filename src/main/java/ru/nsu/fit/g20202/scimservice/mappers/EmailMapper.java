package ru.nsu.fit.g20202.scimservice.mappers;


import ru.nsu.fit.g20202.scimservice.dto.EmailDTO;
import ru.nsu.fit.g20202.scimservice.entity.Email;

public class EmailMapper
{
    public static EmailDTO toDTO(Email email)
    {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setValue(email.getValue());
        emailDTO.setType(email.getType());
        emailDTO.setPrimary(email.isPrimary());
        return emailDTO;
    }

    public static Email toEntity(EmailDTO dto)
    {
        Email email = new Email();
        email.setValue(dto.getValue());
        email.setType(dto.getType());
        email.setPrimary(dto.isPrimary());
        return email;
    }
}
