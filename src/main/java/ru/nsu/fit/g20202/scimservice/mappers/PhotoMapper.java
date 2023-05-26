package ru.nsu.fit.g20202.scimservice.mappers;

import ru.nsu.fit.g20202.scimservice.dto.PhotoDTO;
import ru.nsu.fit.g20202.scimservice.entity.Photo;

public class PhotoMapper
{
    public static PhotoDTO toDTO(Photo photo)
    {
        PhotoDTO photoDTO = new PhotoDTO();
        photoDTO.setValue(photo.getValue());
        photoDTO.setType(photo.getType());
        return photoDTO;
    }

    public static Photo toEntity(PhotoDTO dto)
    {
        Photo photo = new Photo();
        photo.setValue(dto.getValue());
        photo.setType(dto.getType());
        return photo;
    }
}
