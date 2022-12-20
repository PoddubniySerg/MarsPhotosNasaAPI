package go.skillbox.data.util

import go.skillbox.data.retrofit.dto.CameraDto
import go.skillbox.data.retrofit.dto.PhotoDto
import go.skillbox.data.retrofit.dto.PhotosDto
import go.skillbox.data.retrofit.dto.RoverDto
import go.skillbox.domain.models.entity.Camera
import go.skillbox.domain.models.entity.MarsPhoto
import go.skillbox.domain.models.entity.MarsPhotosList
import go.skillbox.domain.models.entity.Rover

class DtoConverter {


    fun convert(photosDto: PhotosDto): MarsPhotosList {
        return MarsPhotosList(photosDto.photos.map { convert(it) })
    }

    fun convert(photoDto: PhotoDto): MarsPhoto {
        return MarsPhoto(
            photoDto.id,
            photoDto.sol,
            convert(photoDto.camera),
            photoDto.imgSrc,
            photoDto.earthDate,
            convert(photoDto.rover)
        )
    }

    fun convert(cameraDto: CameraDto): Camera {
        return Camera(
            cameraDto.id,
            cameraDto.name,
            cameraDto.roverId,
            cameraDto.fullName
        )
    }

    fun convert(roverDto: RoverDto): Rover {
        return Rover(
            roverDto.id,
            roverDto.name,
            roverDto.landingDate,
            roverDto.launchDate,
            roverDto.status
        )
    }
}