package com.example.a2etapa_provaintermediaria


import ArbitraryClasses.RV_MainAdapter
import ArbitraryClasses.RV_MainAdapter_todo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity()
{
   /*
    * AUTOR DO PROJETO
    * MATRÍCULA: 11900989
    * NÚMERO DE CHAMADA: 10
    * NOME: Bruno Teles Galvão
    */


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val todoList = mutableListOf(
        RV_MainAdapter_todo("Curso: Flutter"," Muito melhor que React!", "Valor: $20.00"),
        RV_MainAdapter_todo("Curso: Angular"," Você nunca o intenderá completamente....", "Valor: $30.00"),
        RV_MainAdapter_todo("Curso: C#"," Sem ASP.NET!", "Valor: $44.00"),
        RV_MainAdapter_todo("Curso: F#"," Programação funcional > Orientada a objetos", "Valor: $50.00"),
        RV_MainAdapter_todo("Curso: Rust"," Melhor que c++ ..?", "Valor: $66.00"),
        RV_MainAdapter_todo("Curso: Java"," Melhor que c#. Com toda certeza.", "Valor: $70.00"),
        RV_MainAdapter_todo("Curso: NodeJs","Uma odisseia em busca de como fazer variaveis globais", "Valor: $88.00"),
        RV_MainAdapter_todo("Curso: AppInventor"," A MELHOR FERRAMENTA PARA CRIAÇÃO DE APPS!!!!!! IMPERDIVEL!!", "Valor: $90.00"),
        RV_MainAdapter_todo("Curso: C++","Ooga Booga! Memoria alocada dinamicamente! ", "Valor: $1100.00"),
        RV_MainAdapter_todo("Curso: C"," Programação procedural > Orientada a objetos", "Valor: $2000.00"),
    )

        val RV_MainAdapter = RV_MainAdapter(    todoList, fun (p: RV_MainAdapter_todo){}    )
        val Main_RecyclerView = findViewById<RecyclerView>(R.id.Main_RecyclerView)

        Main_RecyclerView.adapter = RV_MainAdapter
        Main_RecyclerView.layoutManager = LinearLayoutManager(this)




    }
}