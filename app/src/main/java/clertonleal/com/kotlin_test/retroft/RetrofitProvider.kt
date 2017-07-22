package clertonleal.com.kotlin_test.retroft

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class RetrofitProvider {

    companion object {
        fun createRetrofit(): Retrofit {
            val gson = GsonBuilder()
                    .setDateFormat("yyyy-MM-dd").create()

            return Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/").
                    addConverterFactory(GsonConverterFactory.create(gson)).
                    addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
                    build()
        }
    }

}