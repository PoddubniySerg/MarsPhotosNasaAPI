package go.skillbox.data.mocks

import go.skillbox.data.retrofit.dto.CameraDto
import go.skillbox.data.retrofit.dto.PhotoDto
import go.skillbox.data.retrofit.dto.PhotosDto
import go.skillbox.data.retrofit.dto.RoverDto
import kotlinx.coroutines.delay

class PhotosDataMock {

    suspend fun getPhotosByPage(page: Int): PhotosDto? {
        return PhotosDto(getPhotos())
    }

    suspend fun getPhotos(): List<PhotoDto> {
        delay(2000)
        return listOf(
            PhotoDto(
                id = 102693,
                sol = 1000,
                CameraDto(
                    id = 20,
                    name = "FHAZ",
                    roverId = 5,
                    fullName = "Front Hazard Avoidance Camera"
                ),
                imgSrc = "invalid_url",
                earthDate = "2015-05-30",
                rover = RoverDto(
                    id = 5,
                    name = "Curiosity",
                    landingDate = "2012-08-06",
                    launchDate = "2011-11-26",
                    status = "active"
                )
            ),
            PhotoDto(
                id = 102693,
                sol = 1000,
                CameraDto(
                    id = 20,
                    name = "FHAZ",
                    roverId = 5,
                    fullName = "Front Hazard Avoidance Camera"
                ),
                imgSrc = "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG",
                earthDate = "2015-05-30",
                rover = RoverDto(
                    id = 5,
                    name = "Curiosity",
                    landingDate = "2012-08-06",
                    launchDate = "2011-11-26",
                    status = "active"
                )
            ),
            PhotoDto(
                id = 102693,
                sol = 1000,
                CameraDto(
                    id = 20,
                    name = "FHAZ",
                    roverId = 5,
                    fullName = "Front Hazard Avoidance Camera"
                ),
                imgSrc = "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG",
                earthDate = "2015-05-30",
                rover = RoverDto(
                    id = 5,
                    name = "Curiosity",
                    landingDate = "2012-08-06",
                    launchDate = "2011-11-26",
                    status = "active"
                )
            ),
            PhotoDto(
                id = 102693,
                sol = 1000,
                CameraDto(
                    id = 20,
                    name = "FHAZ",
                    roverId = 5,
                    fullName = "Front Hazard Avoidance Camera"
                ),
                imgSrc = "invalid_url",
                earthDate = "2015-05-30",
                rover = RoverDto(
                    id = 5,
                    name = "Curiosity",
                    landingDate = "2012-08-06",
                    launchDate = "2011-11-26",
                    status = "active"
                )
            ),
            PhotoDto(
                id = 102693,
                sol = 1000,
                CameraDto(
                    id = 20,
                    name = "FHAZ",
                    roverId = 5,
                    fullName = "Front Hazard Avoidance Camera"
                ),
                imgSrc = "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG",
                earthDate = "2015-05-30",
                rover = RoverDto(
                    id = 5,
                    name = "Curiosity",
                    landingDate = "2012-08-06",
                    launchDate = "2011-11-26",
                    status = "active"
                )
            ),
            PhotoDto(
                id = 102693,
                sol = 1000,
                CameraDto(
                    id = 20,
                    name = "FHAZ",
                    roverId = 5,
                    fullName = "Front Hazard Avoidance Camera"
                ),
                imgSrc = "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG",
                earthDate = "2015-05-30",
                rover = RoverDto(
                    id = 5,
                    name = "Curiosity",
                    landingDate = "2012-08-06",
                    launchDate = "2011-11-26",
                    status = "active"
                )
            )
        )
    }
}