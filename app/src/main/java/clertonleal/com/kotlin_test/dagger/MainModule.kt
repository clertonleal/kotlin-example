package clertonleal.com.kotlin_test.dagger

import clertonleal.com.kotlin_test.retroft.MovieNetwork
import clertonleal.com.kotlin_test.retroft.RetrofitProvider
import clertonleal.com.kotlin_test.service.MovieService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MainModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return RetrofitProvider.createRetrofit()
    }

    @Provides
    fun provideMovieNetwork(retrofit: Retrofit): MovieNetwork {
        return retrofit.create(MovieNetwork::class.java)
    }

    @Provides
    fun provideMovieService(movieNetwork: MovieNetwork): MovieService {
        return MovieService(movieNetwork)
    }

}