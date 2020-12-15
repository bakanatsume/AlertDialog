package com.bipash.alertdialog

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*
import java.util.Calendar.getInstance

class Calender : AppCompatActivity() {
    private lateinit var btnCalender: Button
    private lateinit var txtCalender: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        btnCalender = findViewById(R.id.btnCalender)
        txtCalender = findViewById(R.id.txtCalender)

        btnCalender.setOnClickListener {
            loadCalender()
        }
    }

    private fun loadCalender(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { view, year, monthOfYear, dayOfMonth ->
                txtCalender.text = "Selected Date: $dayOfMonth/${monthOfYear + 1}/$year"
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }

}