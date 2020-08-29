package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.contactapp.ContactDetail.Companion.CONTACT_KEY
import com.example.contactapp.clases.Contacts
import com.example.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null


    /*
    *
    * Instancia de la clase Contacts agregando los parametros o datos que se envian hacia la clase
    * */
    private val contact1 = Contacts("Eduardo", 71725643, "juaneduardo021299@hotmail.com", R.drawable.contact1)
    private val contact2 = Contacts("kevin", 74727434, " kevin01@gmail.com", R.drawable.contact2)
    private val contact3 = Contacts("Estefany", 71753889, "estefany19@hotmail.com", R.drawable.contact3)
    private val contact4 = Contacts("Laura", 76549087, "laura25@gmail.com", R.drawable.contact4)
    private val contact5 = Contacts("Marco", 60245678, "marco34@hotmail.com", R.drawable.contact5)
    private val contact6 = Contacts("Daniela", 71807951, "daniela10@hotmail.com", R.drawable.contact6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        loadContactsData()

    }

    /*
    *
    * funcion de asignacion a la vista a un elemento TextView el dato del nombre atraves del codigo
    * */
    private fun loadContactsData(){

        binding?.NameContac1?.text = contact1.name
        binding?.NameContac2?.text = contact2.name
        binding?.NameContac3?.text = contact3.name
        binding?.NameContac4?.text = contact4.name
        binding?.NameContac5?.text = contact5.name
        binding?.NameContac6?.text = contact6.name


        setClickContact()

    }
    /*
    * funcion de onclick en la foto de el contacto o el nombre
    * */
    private fun setClickContact(){
        binding?.person1?.setOnClickListener {
            launchContactIntent(contact1)

        }
        binding?.person2?.setOnClickListener {
            launchContactIntent(contact2)

        }
        binding?.person3?.setOnClickListener {
            launchContactIntent(contact3)

        }
        binding?.person4?.setOnClickListener {
            launchContactIntent(contact4)

        }
        binding?.person5?.setOnClickListener {
            launchContactIntent(contact5)

        }
        binding?.person6?.setOnClickListener {
            launchContactIntent(contact6)

        }
    }


    /*
    * Navegacion hacia actividad de detalles del contacto
    *
    * */
    private fun launchContactIntent(contactos: Contacts){
        val intent = Intent(this, ContactDetail::class.java)
        intent.putExtra(CONTACT_KEY, contactos)
        startActivity(intent)
    }


}

