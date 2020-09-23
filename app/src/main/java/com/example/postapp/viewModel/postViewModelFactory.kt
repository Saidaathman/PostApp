package com.example.postapp.viewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.postapp.repository.postRepository
import com.example.postsapp.repository.PostRepository
import java.lang.IllegalArgumentException


class postViewModelFactory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(postViewModel.PostsViewModel::class.java)){
            return postViewModel.PostsViewModel(postRepository.PostRepository) as T
        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }
}
}