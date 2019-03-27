package gh.com.mobilecontent.retrofit3.network;

import java.util.List;

import gh.com.mobilecontent.retrofit3.model.RetroPhoto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
