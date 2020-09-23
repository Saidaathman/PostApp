package com.example.postapp.viewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.postapp.models.post
import com.example.postapp.repository.postRepository
import com.example.postsapp.models.Post
import com.example.postsapp.repository.PostRepository
import kotlinx.coroutines.launch
import kotlin.Suppress as Suppress1
class postViewModel {
    class PostsViewModel ( val PostsRepository: postRepository.PostRepository):ViewModel(){
        var postsLiveData = MutableLiveData <List<post.Post>>()
        var postsFailedLiveData = MutableLiveData<String>()
        fun get Posts(){
            viewModelScope.launch {
                val response =postRepository.getPosts()
                if (response.isSuccessful){
                    postsLiveData.postValue(response.body())
                }
                else{
                    postsLiveData.postValue(response.body()?.String())
                }

            }
        }
    }
}

private fun Any.body():List<post.Post> {

}

private fun Any.errorBody():List<post.Post> {

}
}