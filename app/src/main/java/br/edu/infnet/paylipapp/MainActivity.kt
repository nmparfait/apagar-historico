package br.edu.infnet.paylipapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalculate = findViewById<Button>(R.id.btNewSimulate)
        val etSalary = findViewById<EditText>(R.id.etSalary)
        val etDependents = findViewById<EditText>(R.id.etDependents)
        val etAlimony = findViewById<EditText>(R.id.etAlimony)
        val etOthers = findViewById<EditText>(R.id.etOthers)



        btCalculate.setOnClickListener {
            if(etSalary.toString().isNotBlank()) {

                val intent = Intent(this, ResultAcitivity::class.java)
                intent.putExtra("etSalary",etSalary.text.toString())
                intent.putExtra("etDependents",etDependents.text.toString())
                intent.putExtra("etAlimony",etAlimony.text.toString())
                intent.putExtra("etOthers",etOthers.text.toString())

                startActivity(intent)

            }else{
                getString(R.string.insira_o_valor_do_sal_rio_bruto)
            }

        }


    }


}