package go.skillbox.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object MarsPhotosRetrofitInstance {

    private const val BASE_URL = "https://api.nasa.gov"

    private val retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    val MarsPhotosRetrofit: MarsPhotosNetworkLoader? =
        retrofit.create(MarsPhotosNetworkLoader::class.java)
}