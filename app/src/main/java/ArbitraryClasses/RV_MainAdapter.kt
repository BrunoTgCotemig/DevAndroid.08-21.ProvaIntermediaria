package ArbitraryClasses


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a2etapa_provaintermediaria.R
import java.util.jar.Attributes

class RV_MainAdapter (var todos:List<RV_MainAdapter_todo>): RecyclerView.Adapter<RV_MainAdapter.Adapter1>()
{// -- Code
    inner class Adapter1(itemView: View) : RecyclerView.ViewHolder(itemView)   //This stands for the to-do ViewHolder
    {
        var _Name = itemView.findViewById<TextView>(R.id.Product_Name)
        var _Value = itemView.findViewById<TextView>(R.id.Product_Value)
        var _Description = itemView.findViewById<TextView>(R.id.Product_Description)
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter1 {

        // Here, we inflate the .xml file to actually get it as a view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_itemstructure, parent, false) // I'm not very sure of what this does...
        return Adapter1(view)
    }

    override fun onBindViewHolder(holder: Adapter1, position: Int) {
        holder._Name.text = todos[position].ProductName
        holder._Description.text = todos[position].ProductDescription
        holder._Value.text = todos[position].ProductValue

        //holder.itemView.apply{
        //
        //}
    }

    override fun getItemCount(): Int {
        return todos.size
    }





}// -- Code