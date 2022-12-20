package go.skillbox.marsroverphotosloaderrecyclerview.util

import go.skillbox.domain.models.entity.Camera
import go.skillbox.domain.models.entity.MarsPhoto
import go.skillbox.domain.models.entity.Rover
import go.skillbox.marsroverphotosloaderrecyclerview.models.CameraUiModel
import go.skillbox.marsroverphotosloaderrecyclerview.models.MarsPhotoUiModel
import go.skillbox.marsroverphotosloaderrecyclerview.models.RoverUiModel

class UiModelsConverter {

    fun convert(marsPhoto: MarsPhoto): MarsPhotoUiModel {
        return MarsPhotoUiModel(
            marsPhoto.id,
            marsPhoto.sol,
            convert(marsPhoto.camera),
            marsPhoto.imgSrc,
            marsPhoto.earthDate,
            convert(marsPhoto.rover)
        )
    }

    fun convert(camera: Camera): CameraUiModel {
        return CameraUiModel(
            camera.id,
            camera.name,
            camera.roverId,
            camera.fullName
        )
    }

    fun convert(rover: Rover): RoverUiModel {
        return RoverUiModel(
            rover.id,
            rover.name,
            rover.landingDate,
            rover.launchDate,
            rover.status
        )
    }
}