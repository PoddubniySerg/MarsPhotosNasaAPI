package go.skillbox.domain.repository

import go.skillbox.domain.models.params.GetPhotosByPageParam
import go.skillbox.domain.models.entity.MarsPhoto
import go.skillbox.domain.models.entity.MarsPhotosList

interface MarsPhotosRepository {

    suspend fun getPhotosByPage(params: GetPhotosByPageParam): MarsPhotosList
}