package com.votrepackage.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.votrepackage.models.User
import com.votrepackage.repository.UserRepository
import com.votrepackage.viewmodels.UserViewModel

class MainActivity : AppCompatActivity() {

    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.allUsers.observe(this, Observer { users ->
            // Update UI
        })
    }
}
