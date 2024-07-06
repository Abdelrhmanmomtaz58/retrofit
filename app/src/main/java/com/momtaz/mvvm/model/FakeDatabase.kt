package com.momtaz.mvvm.model

import com.momtaz.mvvm.model.domain.User


class FakeDatabase {
    fun getCurrentUser(): User {
        return User("abdo", 2003)
    }
}