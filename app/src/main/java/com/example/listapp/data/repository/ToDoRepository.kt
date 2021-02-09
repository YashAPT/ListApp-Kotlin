package com.example.listapp.data.repository

import androidx.lifecycle.LiveData
import com.example.listapp.data.ToDoDao
import com.example.listapp.data.models.ToDoData

class ToDoRepository(private val todoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = todoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData) {
        todoDao.insertData(toDoData)
    }

}