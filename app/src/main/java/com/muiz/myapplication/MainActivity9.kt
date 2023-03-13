package com.muiz.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity9 : AppCompatActivity() {
    private lateinit var pref: SharedPreferences
    private lateinit var todos: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var list: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        pref = getSharedPreferences("pref", 0)

        val btn = findViewById<Button>(R.id.addBtn)

        val textInput = findViewById<EditText>(R.id.input)
        list = findViewById(R.id.todoList)
        todos = arrayListOf()
        adapter = ArrayAdapter(applicationContext, R.layout.list_item, todos)
        list.adapter = adapter

        getSavedTodos()

        btn.setOnClickListener {
            todos.add(textInput.text.toString())
            saveTodos()
        }
    }

    private fun getSavedTodos() {
        val len = pref.getInt("len", 0)

        for (i in 0..len) {
            val todo = pref.getString("todo-${i}", null)
            if(todo!= null) {
                todos.add(todo)
            }
        }

        adapter.notifyDataSetChanged()
    }

    private fun saveTodos() {
        val editor = pref.edit()

        for((i, todo) in todos.withIndex()) {
            editor.putString("todo-${i}", todo)
        }

        editor.putInt("len", todos.size)

        editor.apply()

        adapter.notifyDataSetChanged()
    }

}