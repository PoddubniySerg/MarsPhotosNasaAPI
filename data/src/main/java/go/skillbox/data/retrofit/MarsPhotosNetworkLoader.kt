package go.skillbox.data.retrofit

import go.skillbox.data.retrofit.dto.PhotosDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface MarsPhotosNetworkLoader {

    companion object {
        private const val API_KEY = "DEMO_KEY"
    }

    @Headers(
        "Accept: Application/json",
        "Content-type: Application/json"
    )
    @GET("/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=$API_KEY")
    suspend fun getMarsPhotos(@Query(value = "page") pageNumber: Int): Response<PhotosDto>
}