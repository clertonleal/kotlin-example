package clertonleal.com.kotlin_test.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class Movie(@SerializedName(value = "vote_count") var voteCount: Long,
                 var id: Long,
                 var video: Boolean,
                 @SerializedName(value = "vote_average") var voteAverage: Float,
                 var title: String,
                 var popularity: Double,
                 @SerializedName(value = "poster_path") var posterPath: String,
                 @SerializedName(value = "original_language") var originalLanguage: String,
                 @SerializedName(value = "original_title") var originalTitle: String,
                 @SerializedName(value = "genre_ids") var genreIds: List<Long>,
                 @SerializedName(value = "backdrop_path") var backdropPath: String,
                 var adult: Boolean,
                 var overview: String,
                 @SerializedName(value = "release_date") var releaseDate: Date)