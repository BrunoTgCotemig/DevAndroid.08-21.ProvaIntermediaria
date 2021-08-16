package ArbitraryClasses


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a2etapa_provaintermediaria.R

class RV_MainAdapter (var todos:List<RV_MainAdapter_todo>): RecyclerView.Adapter<RV_MainAdapter.Adapter1>()
{// -- Code
    inner class Adapter1(itemView: View) : RecyclerView.ViewHolder(itemView)
                    //This stands for the to-do ViewHolder



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter1 {

        // Here, we inflate the .xml file to actually get it as a view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_itemstructure, parent, false) // I'm not very sure of what this does...
        return Adapter1(view)
    }

    override fun onBindViewHolder(holder: Adapter1, position: Int) {
        holder.itemView.apply{}
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}// -- Code