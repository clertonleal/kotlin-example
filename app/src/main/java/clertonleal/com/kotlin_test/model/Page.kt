package clertonleal.com.kotlin_test.model

import com.google.gson.annotations.SerializedName

data class Page<T> (var page: Long,
                    @SerializedName(value = "total_results") var totalResults: Long,
                    @SerializedName(value = "total_pages") var totalPages: Long,
                    var results: List<T>
)