package com.votrepackage.repository

import androidx.lifecycle.LiveData
import com.votrepackage.dao.UserDao
import com.votrepackage.models.User

class UserRepository(private val userDao: UserDao) {
    val allUsers: LiveData<List<User>> = userDao.getAllUsers()

    suspend fun insert(user: User) {
        userDao.insert(user)
    }

    suspend fun delete(user: User) {
        userDao.deleteUser(user)
    }
}
