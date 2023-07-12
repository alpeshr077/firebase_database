package com.example.firebase_database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebase_database.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var ref : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        ref = FirebaseDatabase.getInstance().reference

        binding.btnSubmit.setOnClickListener {

            var name = binding.edtName.text.toString()
            var suraname = binding.edtSurname.text.toString()
            var contact = binding.edtContact.text.toString()
            var address = binding.edtAddress.text.toString()

            var model = UserModel(name,suraname,contact,address)

            ref.root.child("users").setValue(model)

        }

    }
}