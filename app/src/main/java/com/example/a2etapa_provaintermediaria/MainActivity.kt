package com.example.a2etapa_provaintermediaria


import ArbitraryClasses.RV_MainAdapter
import ArbitraryClasses.RV_MainAdapter_todo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    var todoList = mutableListOf(
        RV_MainAdapter_todo("Curso: Flutter"," ~~ Muito melhor que React", "Valor: $20.00"),
        RV_MainAdapter_todo("Curso: Angular"," ~~ Você nunca o intenderá completamente", "Valor: $30.00"),
        RV_MainAdapter_todo("Curso: C#"," ~~ Sem ASP.NET", "Valor: $44.00"),
        RV_MainAdapter_todo("Curso: F#"," ~~ Melhor que orientação a objetos", "Valor: $50.00"),
        RV_MainAdapter_todo("Curso: Rust"," ~~ Melhor que c++ ..?", "Valor: $66.00"),
        RV_MainAdapter_todo("Curso: Java"," ~~ Melhor que c#", "Valor: $70.00"),
        RV_MainAdapter_todo("Curso: NodeJs"," ~~ Como fazer variaveis globais", "Valor: $88.00"),
        RV_MainAdapter_todo("Curso: AppInventor"," ~~ A MELHOR FERRAMENTA PARA CRIAÇÃO DE APPS", "Valor: $90.00"),
        RV_MainAdapter_todo("Curso: C++"," ~~ RAM sobrecarregada", "Valor: $1100.00"),
        RV_MainAdapter_todo("Curso: Arduino"," ~~ Porque? Porque SIM!", "Valor: $2000.00"),
    )

        val at_adapter = RV_MainAdapter(todoList)
        findViewById<RecyclerView>(R.id.Main_RecyclerView).adapter = at_adapter

    }
}