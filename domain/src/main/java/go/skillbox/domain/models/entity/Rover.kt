package go.skillbox.domain.models.entity

data class Rover(
    val id: Int,
    val name: String,
    val landingDate: String,
    val launchDate: String,
    val status: String
)