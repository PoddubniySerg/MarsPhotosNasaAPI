package go.skillbox.domain.models.entity

data class MarsPhoto(
    val id: Long,
    val sol: Int,
    val camera: Camera,
    val imgSrc: String,
    val earthDate: String,
    val rover: Rover
)