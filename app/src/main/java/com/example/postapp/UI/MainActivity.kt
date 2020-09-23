package com.example.postapp.UI


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.postapp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.postapp.repository.postRepository
import com.example.postapp.viewModel.postViewModelFactory
import com.example.postsapp.R
import com.example.postsapp.repository.PostRepository
import com.example.posts
app.viewModel.PostsViewModel
import com.example.postsapp.viewModel.postViewModelFactory
import org.w3c.dom.Text
import java.security.acl.Owner
private var Any.adapter: Any
    get() {
        TODO("Not yet implemented")
    }
    set() {}
private var Any.layoutManager:Any
    get() {}
    set() {}

class MainActivity : AppCompatActivity() {
    private val rvNames: Any
    lateinit var postsViewModel: PostsViewModel
    lateinit var postViewModelFactory: postViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val postRepository= postRepository.PostRepository()
        postViewModelFactory= postViewModelFactory(postRepository)
        postsViewModel=
            ViewModelProvider(Owner: this, postsViewModelFactory).get(PostsViewModel::class.java)
        postsViewModel, getPosts()
        postsViewModel.postsLiveData.observe(Owner; this, Observerrun { postsListl ->
            Toast.makeText(baseContext, Text"${postsListl.Size}posts fetched", Toast.LENGTH_LONG)
                .show()
        })
        postsViewModel,postsFailedLiveData .Observer(Owner:this,Observer{ error ->
            Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
        })
        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"))
        rvNames.adapter = namesAdapter
    }

    private fun NamesRecyclerViewAdapter(listOf: List<String>): Any {
        TODO("Not yet implemented")
    }
}

    }
}