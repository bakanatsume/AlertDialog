package com.bipash.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnalert: Button = findViewById(R.id.btnalert)
        val txtFirst: EditText = findViewById(R.id.txtFirst)
        val txtSecond: EditText = findViewById(R.id.txtSecond)
        val btnadd: Button = findViewById(R.id.btnadd)

        btnadd.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Alert")
            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Sum is ${txtFirst.text.toString().toInt() + txtSecond.text.toString().toInt()}", Toast.LENGTH_SHORT).show()
            }

            btnalert.setOnClickListener {
                val builder = AlertDialog.Builder(this)

                builder.setTitle("My Alert")
                builder.setMessage("Are you sure?")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                builder.setPositiveButton("Yes") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_SHORT).show()
                }

                builder.setNeutralButton("Cancel") { dialogInterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "Clicked cancel\n operation failed",
                        Toast.LENGTH_LONG
                    ).show()
                }
                builder.setNegativeButton("No") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "CLicked No", Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(false)
                alertDialog.show()
            }
        }
    }
}